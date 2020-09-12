package com.akua.sorting;

import com.akua.Algorithms;

public class QuickSort extends Algorithms {
    public int[] sorted(int[] arr){
        sort(arr, 0, arr.length - 1);

        return arr;
    }

    private void sort(int arr[], int low, int high){
        if(low < high){
            int partitioningIndex = partition(arr, low, high);

            sort(arr, low, partitioningIndex - 1 );
            sort(arr,partitioningIndex + 1 , high);
        }
    }

    private int partition(int arr[], int low, int high){
        int pivot = arr[high];

        int i = (low - 1);

        for(int j = low; j < high ; j++){
            if(arr[j] < pivot) {
                i++;
                //printSwaped(arr, i, j);
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        //System.out.println(" ");
        //printSwaped(arr, i + 1, high);

        return (i + 1);
    }

}
