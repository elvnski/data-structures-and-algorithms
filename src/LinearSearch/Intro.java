package LinearSearch;

public class Intro {

    public static void main(String[] args) {

        int[] array = {15, 8, 27, 42, 19, 33, 10, 5};

        int index = linearSearch(array, 73);

        if (index != -1){
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found.");
        }

    }

    private static int linearSearch(int[] array, int value) {

        for ( int i = 0; i < array.length; i++){
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }



}
