package com.akua.sorting;

import com.akua.Algorithms;

public class BubbleSort extends Algorithms{	
	 
	public int[] sort(int arr[]){
        for (int i = 0 ; i < arr.length; i++)
        	bubble(arr, i);
        return arr;
    }
	
	public void bubble(int[] arr, int i) {
		System.out.print("i : " + i +"\t | ");
		
		 for (int j = 0; j < arr.length-1-i; j++)
             if(arr[j]>arr[j+1]) {
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
         
		 printSelected(arr, i);
	}
}
