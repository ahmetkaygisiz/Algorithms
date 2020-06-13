package com.akua.sorting;

import com.akua.Algorithms;

public class InsertionSort extends Algorithms {
	
	public int[] sort(int[] arr) {
		for(int pos = 1 ; pos < arr.length; pos++) 
			insert(arr, pos, arr[pos]);
		return arr;
	}
	
	public void insert(int[] arr, int pos, int value) {
		int i = pos - 1;
		System.out.print("i : " + i +"\t | ");
		
		while(i >= 0 && arr[i] > value) {
			arr[i+1] = arr[i];
			i = i-1;
			arr[i+1] = value;
		}
		printSelected(arr, pos);
	}
}
