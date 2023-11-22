package SelectionSort;

import java.util.Arrays;

public class Intro {

    public static void main(String[] args) {

        int[] array = {3, 4, 87, 44, 86, 45, 67, 23, 98, 56};

        System.out.println(Arrays.toString(selectionSort(array)));

    }

    private static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int min = i;
            for (int j = i + 1; j < array.length; j++) {

                //for descending order, swap the inequality sign
                if (array[min] > array[j]) min = j;
            }

            //swapping the variables
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        return array;
    }

}
