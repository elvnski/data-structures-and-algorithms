package BubbleSort;

import java.util.Arrays;

public class Intro {

    public static void main(String[] args) {

        int[] array = {4, 5, 6, 2, 7, 4, 45, 65, 45, 3, 9};

        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    private static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++){

                if (array[j] > array[j + 1]){

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j +1] = temp;
                }
            }
        }

        return array;
    }

}
