package com.akua.search;

import com.akua.Algorithms;

/**
 * Start from leftmost in the arr
 * Compare one by one
 * if matches return index
 * if doesnt matches return -1
 */
public class LinearSearch extends Algorithms {

    public int search(int[] arr,int wanted){

        for(int i = 0; i < arr.length; i++)
            if(arr[i] == wanted){
                printSelected(arr, i, ANSI_RED);
                return i;
            }
        return -1;
    }

}
