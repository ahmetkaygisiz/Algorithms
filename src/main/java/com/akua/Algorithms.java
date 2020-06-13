package com.akua;

public class Algorithms {
	public static final String ANSI_RED = "\u001B[36m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public void printSelected(int[] arr, int selected) {
		for (int i = 0; i < arr.length; i++)
			if(i == selected)
				System.out.print("[" + arr[i] + "]  ");
			else
				System.out.print(arr[i] + "  ");
		System.out.println(" ");
	}

// Still researching
// For colorfull outprint
//	System.out.print(ANSI_RED + arr[i] + ANSI_RESET);
}
