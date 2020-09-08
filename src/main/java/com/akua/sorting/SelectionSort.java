package com.akua.sorting;

import com.akua.Algorithms;

/**
 * <h3>Tips</h3>
 *
 * <p>
 *     1 - sort-for : i = 0 - length - 1 ; i++
 *     2 - min = i
 *     3 - select- for : j = i + 1 -> length; j++
 *     4 - is smaller ? swap : nothing
 * </p>
 */
public class SelectionSort extends Algorithms {
    public int[] sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++ )
            selection(arr, i);
        return arr;
    }

    public void selection(int arr[], int i){
        printSelected(arr, i, Algorithms.ANSI_RED);
        int min = i;

        for(int j = i + 1; j < arr.length; j++) {
            printSelected(arr, j, Algorithms.ANSI_YELLOW);
            if (arr[j] < arr[min])
                min = j;
        }
        System.out.println(" ");

        int tmp = arr[min];
        arr[min] = arr[i];
        arr[i] = tmp;

        printSelected(arr, i, ANSI_BLUE);

    }

}
