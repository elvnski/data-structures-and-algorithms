package DynamicArrays;

public class Intro {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(4);


        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");


        System.out.println(dynamicArray);

        System.out.println("Empty : " + dynamicArray.isEmpty());
        System.out.println("Size : " + dynamicArray.size);
        System.out.println("Capacity : " + dynamicArray.capacity);


        //Inserting at given index
        dynamicArray.insert(0, "EGG");
        System.out.println(dynamicArray);
        System.out.println("Size : " + dynamicArray.size);
        System.out.println("Capacity : " + dynamicArray.capacity);

        //Deleting an item
        dynamicArray.delete("B");
        System.out.println(dynamicArray);
        System.out.println("Size : " + dynamicArray.size);
        System.out.println("Capacity : " + dynamicArray.capacity);

        //Searching for an item
        System.out.println("Search result: " + dynamicArray.search("A"));

        //Testing growth feature
        dynamicArray.add("newKid");
        dynamicArray.add("New newKid");
        System.out.println(dynamicArray);
        System.out.println("Size : " + dynamicArray.size);
        System.out.println("Capacity : " + dynamicArray.capacity);


        //Shrinkage feature
        dynamicArray.delete("A");
        dynamicArray.delete("C");
        dynamicArray.delete("New newKid");
        System.out.println(dynamicArray);
        System.out.println("Size : " + dynamicArray.size);
        System.out.println("Capacity : " + dynamicArray.capacity);

    }

}