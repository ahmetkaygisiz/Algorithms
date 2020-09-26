package com.akua;

public class Algorithms {
	public static final String ANSI_RED	 	= "\u001B[31m";
	public static final String ANSI_YELLOW 	= "\u001B[32m";
	public static final String ANSI_PURPLE 	= "\u001B[35m";
	public static final String ANSI_BLUE 	= "\u001B[36m";
	public static final String ANSI_RESET 	= "\u001B[0m";


	public int findMin(int x, int y){
		return (x <= y) ? x : y;
	}

	// Biraz renk katmak gerek
	public void printSelected(int[] arr, int selected, String ANSI_CODE) {
		for (int i = 0; i < arr.length; i++)
			if(i == selected)
				System.out.print(ANSI_CODE +  arr[i] + ANSI_RESET + "  ");
			else
				System.out.print(arr[i] + "  ");
		System.out.println(" ");
	}

	public void printSwaped(int[] arr, int s1, int s2){
		for(int i = 0; i < arr.length; i++)
			if(i == s1)
				System.out.print(ANSI_YELLOW +  arr[i] + ANSI_RESET + "  ");
			else if (i == s2)
				System.out.print(ANSI_RED +  arr[i] + ANSI_RESET + "  ");
			else
				System.out.print(arr[i] + "  ");
		System.out.println(" ");
	}

	public void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
