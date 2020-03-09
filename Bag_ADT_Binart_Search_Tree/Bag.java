// NAME : MUSTAFA CEM ONAN
// ID   : 180315064

public class Bag <T extends Comparable<T>> {

    //Fields of Bag<T extends Comparable<T>>
    private Node<T> root;

    //Constructor of Bag<T extends Comparable<T>>
    public Bag(){
        clear();
    }

    //Required methods starts

    //Method that adds a data to the Bag.
    public void add(T item){
        root = add(root, item);
    }

    //Method that adds a data to the Bag.
    private Node<T> add(Node<T> current, T item){
        if (current == null){
            current = new Node<>(item);
            return current;
        }
        if (current.getData().compareTo(item) < 0){
            current.setRight(add(current.getRight(), item));
        }
        else if (current.getData().compareTo(item) > 0){
            current.setLeft(add(current.getLeft(), item));
        }
        else if (current.getData().compareTo(item) == 0){
            current.increaseElementSize();
        }
        return current;
    }

    //Method that resets the Bag.
    public void clear(){
        root = null;
    }

    //Method that returns true if given data exists in the Bag.
    public boolean contains(T item) {
        return contains(root, item);
    }

    //Method that returns true if given data exists in the Bag.
    private boolean contains(Node<T> current, T item) {
        if (current != null) {
            if (current.getData().compareTo(item) == 0) {
                return true;
            }
            else if (current.getData().compareTo(item) > 0) {
                return contains(current.getLeft(), item);
            }
            else if (current.getData().compareTo(item) < 0) {
                return contains(current.getRight(), item);
            }
        }
        return false;
    }

    //Method that returns the distinct element size of the Bag.
    public int distinctSize(){        
        return distinctSize(root);
    }

    //Method that returns the distinct element size of the Bag.
    private int distinctSize(Node <T> current) {
        int i = 0;

        if (current == null){
            return 0;
        }
        else{
            i += distinctSize(current.getLeft());
            i += 1;
            i += distinctSize(current.getRight());
        }
        return i;
    }

    //Method that returns true if the given Bag equals to this Bag.
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Bag) {
        	if (this.toString().equals(obj.toString())) {
        		return true;
        	}
        }
        return false;
    }

    //Method that returns the frequency of the given data.
    public int elementSize(T item){
        Node<T> current = search(item);
        if (current == null)
            return 0;
        else
            return current.getElementSize();
    }

    //Method that returns true if the Bag is empty.
    public boolean isEmpty(){
        if (root == null){
            return true;
        }
        return false;
    }

    //Method that removes the given item from the Bag.
    public boolean remove(T item){
        if (this.contains(item) == false){
            System.out.println("Item could not found.");
            return false;
        }
        int beforeRemoving = this.size();
        root = remove(root, item);
        if (this.size() < beforeRemoving){
            return true;
        }
        return false;
    }

    //Method that removes the given item from the Bag.
    private Node<T> remove(Node<T> current, T item){
        if (current == null){
            return null;
        }
        if (current.getData().compareTo(item) > 0){
            current.setLeft(remove(current.getLeft(), item));
        }
        else if (current.getData().compareTo(item) < 0){
            current.setRight(remove(current.getRight(), item));
        }
        else if (current.getData().compareTo(item) == 0){
            if (current.getElementSize() > 1){
                current.decreaseElementSize();
                return current;
            }
            else {
                if (current.getLeft() == null && current.getRight() == null){
                    if (current == root){
                        clear();
                    }
                    return null;
                }
                else if (current.getLeft() == null){
                    current = current.getRight();
                }
                else if (current.getRight() == null){
                    current = current.getLeft();
                }
                else {
                    if (maxDepth(current.getRight()) > maxDepth(current.getLeft())){
                        Node<T> leftMostOfRightOfCurrent = leftMost(current.getRight());
                        current.setData(leftMostOfRightOfCurrent.getData());
                        current.setElementSize(leftMostOfRightOfCurrent.getElementSize());
                        leftMostOfRightOfCurrent.setElementSize(1);
                        current.setRight(remove(current.getRight(), leftMostOfRightOfCurrent.getData()));
                    }
                    else {
                        Node<T> rightMostOfLeftOfCurrent = rightMost(current.getLeft());
                        current.setData(rightMostOfLeftOfCurrent.getData());
                        current.setElementSize(rightMostOfLeftOfCurrent.getElementSize());
                        rightMostOfLeftOfCurrent.setElementSize(1);
                        current.setLeft(remove(current.getLeft(), rightMostOfLeftOfCurrent.getData()));
                    }
                }
            }
        }
        return current;
    }

    //Method that returns the total element number of the Bag.
    public int size(){
        return size(root);
    }

    //Method that returns the total element number of the Bag.
    private int size(Node <T> current) {
        int i = 0;

        if (current == null){
            return 0;
        }
        else {
            i += size(current.getLeft());
            i += current.getElementSize();
            i += size(current.getRight());
        }
        return i;
    }

    //Method that returns a string representation of the Bag.
    @Override
    public String toString(){
        if (this.isEmpty())
            return "This is an empty Bag.";
        return toString(root);
    }

    //Method that returns a string representation of the Bag.
    private String toString(Node<T> current){
        String s = "";

        if (current == null){
            return "";
        }
        else {
            s += toString(current.getLeft());
            s += "[{" + current.getData() + "} x " + current.getElementSize() + "]";
            s += toString(current.getRight());
        }
        return s;
    }

    //User methods:
    //Method that returns the left-most element after the given node.
    private Node<T> leftMost(Node<T> current){
        if (current.getLeft() != null){
            return leftMost(current.getLeft());
        }
        return current;
    }

    //Method that returns the right-most element after the given node.
    private Node<T> rightMost(Node<T> current){
        if (current.getRight() != null){
            return rightMost(current.getRight());
        }
        return current;
    }

    //Method that returns the maximum depth of the given node.
    private int maxDepth(Node<T> current){
        if (current == null){
            return 0;
        }
        else {
            int leftDepth = maxDepth(current.getLeft());
            int rightDepth = maxDepth(current.getRight());

            if (leftDepth > rightDepth){
                return (leftDepth + 1);
            }
            else {
                return (rightDepth + 1);
            }
        }
    }

    //Method that returns the node if it has the given data.
    private Node<T> search(T item) {
        return search(root, item);
    }

    //Method that returns the node if it has the given data.
    private Node<T> search(Node<T> current, T item) {
        if (current == null)
            return null;
        else {
            if (current.getData().compareTo(item) == 0) {
                return current;
            }
            else if (current.getData().compareTo(item) > 0) {
                return search(current.getLeft(), item);
            }
            else if (current.getData().compareTo(item) < 0) {
                return search(current.getRight(), item);
            }
        }
        return current;
    }

}
