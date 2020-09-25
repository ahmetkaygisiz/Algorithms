package com.akua.search;

import com.akua.Algorithms;
/**
 * also known Block Search
 * for the SORTED arrays. Basic idea is check fewer elements.
 *
* Time Complexity : O(√n)
* Auxiliary Space : O(1)
 */

public class JumpSearch extends Algorithms {
    public int search(int[] arr, int wanted){
        // Finding block size to be jumped
        int step = (int) Math.floor(Math.sqrt(arr.length));

        // Finding the block where element is
        // present(if it is present)
        int prev = 0;

        while(arr[Math.min(step, arr.length) -1] < wanted){
            prev = step;
            step += (int) Math.floor(Math.sqrt(arr.length));

            if(prev >= arr.length)
                return -1;
        }

        // Doing a linear search for x in block
        // beginning with prev
        while(arr[prev] < wanted){
            prev++;

            if(prev == Math.min(step, wanted))
                return -1;
        }

        if(arr[prev] == wanted){
            printSelected(arr, prev, ANSI_RED);
            return prev;
        }

        return -1;
    }
}
