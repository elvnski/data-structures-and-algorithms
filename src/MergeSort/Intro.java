package MergeSort;

import java.util.Arrays;

public class Intro {

    public static void main(String[] args) {

        int[] array = {32, 4, 54, 76, 345, 35, 35, 35, 6, 224, 23, 7, 89, 45, 678, 9};

        System.out.println("Original Array: " + Arrays.toString(array));

        mergeSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {

        int length = array.length;

        if (length <= 1) return; //base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //left array
        int k = 0; //right array

        for (; i < length; i++){
            if(i < middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[k] = array[i];
                k++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array){

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int x = 0, l = 0, r = 0; //indices

        //Check conditions for merging
        while(l < leftSize && r < rightSize) {

            if (leftArray[l] < rightArray[r]) {
                array[x] = leftArray[l];
                x++;
                l++;
            }
            else {
                array[x] = rightArray[r];
                x++;
                r++;
            }
        }

        //For when we have the last element that does not have another to be compared to
        while(l < leftSize){
            array[x] = leftArray[l];
            x++;
            l++;
        }

        while (r < rightSize){
            array[x] = rightArray[r];
            x++;
            r++;
        }

    }

}
