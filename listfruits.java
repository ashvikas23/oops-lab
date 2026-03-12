import java.util.*;

class listfruits {
    public static void main(String args[]) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Avocado");
        fruits.add("Orange");
        fruits.add("Strawberry");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Blueberry");
        fruits.add("Guava");
        fruits.add("Pomegranate");

        System.out.println("ORIGINAL LIST");
        for(String str : fruits) {
            System.out.println(str);
        }
        System.out.println();

        fruits.remove("Blueberry");
        fruits.remove(2); 

        System.out.println("REMOVED LIST");
        for(String str : fruits) {
            System.out.println(str);
        }
        System.out.println(); 

        fruits.set(3, "Chickoo");

        System.out.println("UPDATED LIST");
        for(String str : fruits) {
            System.out.println(str);
        }
        System.out.println(); 

        Collections.sort(fruits);

        System.out.println("SORTED LIST");
        for(String str : fruits) {
            System.out.println(str);
        }
        System.out.println();

        System.out.println("Checking List");
        System.out.println("Apple is in list: " + fruits.contains("Apple"));
        System.out.println("Lemon is in list: " + fruits.contains("Lemon"));
        System.out.println("Size of array is: " + fruits.size());
        System.out.println("Object at second position is: " + fruits.get(2));
        System.out.println(); 

        fruits.clear();
        System.out.println("Final list is: " + fruits);
    }
}

