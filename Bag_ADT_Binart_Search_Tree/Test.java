// NAME : MUSTAFA CEM ONAN
// ID   : 180315064

public class Test {

    public static void main(String[] args) {
        Bag<Integer> bag1 = new Bag<>();
        Bag<Integer> bag2 = new Bag<>();
        Bag<Integer> bag3 = new Bag<>();

        System.out.println("bag1: " + bag1);

        System.out.println("Adding some data to the bag1");

        //Testing out the add() method
        bag1.add(10);
        bag1.add(3);
        bag1.add(12);
        bag1.add(12);
        bag1.add(5);
        bag1.add(10);
        bag1.add(10);
        bag1.add(100);

        //Testing toString() method
        System.out.println("bag1: " + bag1);
        //Testing size() method
        System.out.println("Size of the bag1 = " + bag1.size());
        //Testing distictSize() method
        System.out.println("Distinct Size of the bag1 = " + bag1.distinctSize());

        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();

        //Testing clear() method
        System.out.println("bag1 will now be cleared.");
        bag1.clear();

        System.out.println("bag1: " + bag1);

        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();

        System.out.println("Equality test : adding [0-9] digits to bag1 in ordered, adding same digits to bag2 in reverse order");
        System.out.println("bag1 must be equal to bag2");
        //Adding [0-9] digits to the bag1
        for (int i = 9; i >= 0; i--){
            bag1.add(i);
        }

        //Adding [0-9] digits IN REVERSE ORDER to the bag2
        for (int i = 0; i <= 9; i++){
            bag2.add(i);
        }

        System.out.println("bag1: " + bag1);
        System.out.println("bag2: " + bag2);

        //Testing equals() method (Should be equal)
        if (bag1.equals(bag2))
            System.out.println("(YES) bag1 equals to the bag2.");
        else
            System.out.println("(NO) bag1 IS NOT equal to the bag2.");

        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();

        System.out.println();
        System.out.println("Now adding an another 0 to the bag1 and testing equality one more time.");
        System.out.println("bag1 must NOT be equal to bag2");
        //Adding an another 0 to the bag1 and testing equals() one more time
        bag1.add(0);

        System.out.println("bag1: " + bag1);
        System.out.println("bag2: " + bag2);

        //Testing equals() method (Should NOT be equal)
        if (bag1.equals(bag2))
            System.out.println("(YES) bag1 equals to the bag2.");
        else
            System.out.println("(NO) bag1 IS NOT equal to the bag2.");


        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();

        System.out.println("Element size, isEmpty() test :");
        //Reset bag1 and bag2.
        bag1.clear();
        bag2.clear();

        //Add 5 times 10 to the bag1.
        for (int i = 0; i < 5; i++)
            bag1.add(10);

        //Print bag1.
        System.out.println("bag1: " + bag1);

        //Testing elementSize() method.
        System.out.println("Element size of the 10 is: " + bag1.elementSize(10));

        //Testing isEmpty()
        if (bag1.isEmpty())
            System.out.println("bag1 is empty");
        else
            System.out.println("bag1 IS NOT empty");

        //Clearing bag1
        bag1.clear();
        System.out.println("bag1 is now cleared");
        System.out.println("bag1 : " + bag1);

        //Testing isEmpty() again
        if (bag1.isEmpty())
            System.out.println("bag1 is empty");
        else
            System.out.println("bag1 IS NOT empty");

        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();

        System.out.println("Remove test:");
        //Testing remove() function
        bag1.clear();
        bag2.clear();
        bag3.clear();

        bag1.add(10);
        bag1.add(10);
        bag1.add(5);
        bag1.add(5);
        bag1.add(5);
        bag1.add(15);
        bag1.add(15);
        bag1.add(15);

        System.out.println(bag1);
        System.out.println("Size : " + bag1.size());
        System.out.println("Distinct size : " + bag1.distinctSize());

        System.out.println("Removing 5");
        bag1.remove(5);

        System.out.println(bag1);
        System.out.println("Size : " + bag1.size());
        System.out.println("Distinct size : " + bag1.distinctSize());

        System.out.println("Removing 10");
        bag1.remove(10);

        System.out.println(bag1);
        System.out.println("Size : " + bag1.size());
        System.out.println("Distinct size : " + bag1.distinctSize());

        System.out.println("Removing 10 again");
        bag1.remove(10);

        System.out.println(bag1);
        System.out.println("Size : " + bag1.size());
        System.out.println("Distinct size : " + bag1.distinctSize());

        System.out.println("Removing 5");
        bag1.remove(5);

        System.out.println(bag1);
        System.out.println("Size : " + bag1.size());
        System.out.println("Distinct size : " + bag1.distinctSize());

        System.out.println("Removing 15");
        bag1.remove(15);

        System.out.println(bag1);
        System.out.println("Size : " + bag1.size());
        System.out.println("Distinct size : " + bag1.distinctSize());

        System.out.println("Removing 15 again");
        bag1.remove(15);

        System.out.println(bag1);
        System.out.println("Size : " + bag1.size());
        System.out.println("Distinct size : " + bag1.distinctSize());

        System.out.println("Removing 15 again");
        bag1.remove(15);

        System.out.println(bag1);
        System.out.println("Size : " + bag1.size());
        System.out.println("Distinct size : " + bag1.distinctSize());

        System.out.println("Removing 5");
        bag1.remove(5);

        System.out.println(bag1);
        System.out.println("Size : " + bag1.size());
        System.out.println("Distinct size : " + bag1.distinctSize());

        System.out.println("This project is implemented by :");
        System.out.println("Name : Mustafa Cem ONAN");
        System.out.println("ID   : 180315064");
        
        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();

        System.out.println("Any Type Test:");
        System.out.println("Adding Car objects to a bag.");
        
        //Car object has already overrided compareTo method it's inside. And it's sorting
        //car objects to their prices. If the prices of 2 car is equal, then sorts alphabetically.        
        
        Car car1 = new Car("astra", 30000);
        Car car2 = new Car("vectra", 40000);
        Car car3 = new Car("passat", 300000);
        Car car4 = new Car("e220d", 550000);
        Car car5 = new Car("sahin", 15000);
        Car car6 = new Car("corsa", 55000);
        Car car7 = new Car("corsa", 40000);
        Car car8 = new Car("520d", 300000);
        Car car9 = new Car("dogan", 15000);
        Car car10 = new Car("w140", 300000);
        
        Bag<Car> carBag = new Bag<Car>();
        
        carBag.add(car1);
        carBag.add(car2);
        carBag.add(car3);
        carBag.add(car4);
        carBag.add(car5);
        carBag.add(car6);
        carBag.add(car7);
        carBag.add(car8);
        carBag.add(car9);
        carBag.add(car10);
        
        System.out.println(carBag);

    }
}




		