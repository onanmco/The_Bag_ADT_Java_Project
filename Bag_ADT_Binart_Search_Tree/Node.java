// NAME : MUSTAFA CEM ONAN
// ID   : 180315064

public class Node <T extends Comparable<T>>{
	
	// Fields of Node class.
	
	// Field that holds the any type of data.
    private T data;
    // Field that holds the frequency of data.    
    private int elementSize;
    // Field that links to the left child node.
    private Node<T> left;
    // Field that links to the right child node.
    private Node<T> right;
    
    // Constructor method.
    public Node(T item){
        this.data = item;
        this.elementSize = 1;
        this.left = null;
        this.right = null;
    }
    // Constructor method, overloaded.
    public Node(T item, int elementSize, Node<T> left, Node<T> right){
        this.data = data;
        this.elementSize = elementSize;
        this.left = left;
        this.right = right;
    }
    // Getter method of data field.
    public T getData() {
        return data;
    }
    // Setter method of data field.
    public void setData(T data) {
        this.data = data;
    }
    // Getter method of elementSize field.
    public int getElementSize() {
        return elementSize;
    }
    // Setter method of elementSize field.
    public void setElementSize(int elementSize) {
        this.elementSize = elementSize;
    }    
    // Getter method of left field.
    public Node<T> getLeft() {
        return left;
    }
    // Setter method of data field.
    public void setLeft(Node<T> left) {
        this.left = left;
    }
    // Getter method of right field.
    public Node<T> getRight() {
        return right;
    }
    // Setter method of right field.
    public void setRight(Node<T> right) {
        this.right = right;
    }
    // Method that increments elementSize by one.
    public void increaseElementSize(){
        elementSize++;
    }
    // Method that decrements elementSize by one.
    public void decreaseElementSize(){
        elementSize--;
    }
}
