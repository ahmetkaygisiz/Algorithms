package com.akua.sorting;

import com.akua.Algorithms;

/**
 * Heap sort is a comparison based sorting technique based on Binary Heap data structure.
 * It is similar to selection sort where we first find the maximum element
 * and place the maximum element at the end.
 * We repeat the same process for the remaining elements.
 */
public class HeapSort extends Algorithms {

    public void sort(int arr[]){
        int n = arr.length;

        for(int i = n/2 -1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for(int i = n - 1; i > 0; i--){
            swap(arr,0,i);

            heapify(arr, i,0);
        }
        printSelected(arr,0, ANSI_RED);
    }

    private void heapify(int[] arr, int n, int i){
        int largest = i;

        int l = 2*i + 1;
        int r = 2*i + 2;

        if(l < n && arr[l] > arr[largest])
            largest = l;

        if(r < n && arr[r] > arr[largest])
            largest = r;

        if(largest != i){
            swap(arr,i,largest);

            heapify(arr, n, largest);
        }
    }
}
