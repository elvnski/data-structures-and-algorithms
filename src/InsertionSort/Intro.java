package InsertionSort;

import java.util.Arrays;

public class Intro {

    public static void main(String[] args) {


        int[] array = {4, 65, 75, 54, 75, 67, 34, 86, 44, 56, 86};

        System.out.println(Arrays.toString(insertionSort(array)));

    }

    private static int[] insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++){

            int temp = array[i];

            int k = i - 1;
            while (k >= 0 && array[k] > temp){

                array[k + 1] = array[k];
                k--;
            }

            array[k + 1] = temp;
        }

        return array;
    }

}
