package QuickSort;

import java.util.Arrays;

public class Intro {

    public static void main(String[] args) {

        int[] array = {6, 23, 5, 7, 2, 4, 54, 6, 6,34, 87, 56 ,3, 76 ,45, 6, 55};

        System.out.println("Default Array: \n" + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array: \n" + Arrays.toString(array));

    }

    private static void quickSort(int[] array, int start, int end) {

        if (end <= start) return; //Base case

        int pivot = partition(array, start, end);

        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1;  j++){

            if (array[j] < pivot){

                //swapping the elements
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;

        //after all elements around pivot are on their proper sides
        //we place the pivot on its proper resting place
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

}
