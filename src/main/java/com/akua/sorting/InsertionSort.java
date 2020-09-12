package com.akua.sorting;

import com.akua.Algorithms;

/**
 * <h3>Tips</h3>
 *
 * <p>
 *     1 - sort-for :  i = 1 -> length  ; i++
 *     2 - insertion - for : j = i - 1; j >= 0; j--
 *     3 -
 * </p>
 */


public class InsertionSort extends Algorithms {
	
	public int[] sort(int[] arr) {

		for(int i = 1 ; i < arr.length; i++) // gez
			insert(arr, i, arr[i]);
		return arr;
	}


	private void insert(int[] arr, int i, int value) {
		printSelected(arr, i, Algorithms.ANSI_RED);
		
		for(int j = i - 1; j >= 0; j--){		// yerlestir.
			if(arr[j] > value){
				arr[j+1] = arr[j];
				arr[j] = value;

				printSelected(arr, j , Algorithms.ANSI_YELLOW);
			}
		}
		System.out.println(" ");
	}

	/*
			while(j >= 0 && arr[j] > value) {
				arr[j+1] = arr[j];
				j--;
				arr[j+1] = value;

				printSelected(arr, j+1, Algorithms.ANSI_YELLOW);
			}
	 */
}
