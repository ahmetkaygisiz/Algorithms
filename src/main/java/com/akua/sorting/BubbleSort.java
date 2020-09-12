package com.akua.sorting;

import com.akua.Algorithms;

/**
 * <h3>Tips</h3>
 *
 * <p>
 *     1 - sort-for : i = 0 - length - 1 ; i++
 *     2 - buble - for : j = 0 -> length - 1 - i ; j++
 *     3 - arr[j] > arr[j + 1] ? swap : nothing
 * </p>
 */

public class BubbleSort extends Algorithms{	
	 
	public int[] sort(int arr[]){
        for (int i = 0 ; i < arr.length - 1 ; i++)
        	bubble(arr, i);
        return arr;
    }
	
	private void bubble(int[] arr, int i) {
        printSelected(arr, i, Algorithms.ANSI_RED);

        for (int j = 0; j < arr.length-1-i; j++) {
             if (arr[j] > arr[j + 1]) {
                 printSwaped(arr, j, j+1);
                 swap(arr,j, j + 1);
             }
         }

        System.out.println("");
	}
}
