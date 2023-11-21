package BinarySearch;

import java.util.Arrays;

public class Intro {

    public static void main(String[] args) {

        int[] array = new int[1000000];
        int target = 17864;

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        int index = Arrays.binarySearch(array, target);

        if (index == -1){
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element found at: " + index);
        }


        /*Our own Custom Binary search */
        System.out.println("/*Our own Custom Binary search */\n");
        int index2 = binarySearch(array, target);

        if (index2 == -1){
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element found at: " + index2);
        }


    }

    private static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high){

            int middle = low + (high - low)/2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if (value < target) low = middle + 1;
            else if (value > target) high = middle - 1;
            else return middle; //Target found

        }

        return -1; //Target not found
    }

}
