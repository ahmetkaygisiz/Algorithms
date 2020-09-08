package com.akua;

public class Algorithms {
	public static final String ANSI_RED	 	= "\u001B[31m";
	public static final String ANSI_YELLOW 	= "\u001B[32m";
	public static final String ANSI_PURPLE 	= "\u001B[35m";
	public static final String ANSI_BLUE 	= "\u001B[36m";
	public static final String ANSI_RESET 	= "\u001B[0m";


	// Biraz renk katmak gerek
	public void printSelected(int[] arr, int selected, String ANSI_CODE) {
		for (int i = 0; i < arr.length; i++)
			if(i == selected)
				System.out.print(ANSI_CODE +  arr[i] + ANSI_RESET + "  ");
			else
				System.out.print(arr[i] + "  ");
		System.out.println(" ");
	}
}
