package com.akua.search;

import com.akua.Algorithms;

/**
 * Interpolation Search
 * - for SORTED arrays
 * - The Interpolation Search is an improvement over BinarySearch.
 * - BinarySearch always goes to the middle element to check.Interpolation may go to
 *   to different locations according to the value of the key.
 * - For ex: if the value of the key is closer to the last element,
 *   interpolation s. is likely to start search toward the end side.
 *
 *   pos = lo + [ (x-arr[lo])*(hi-lo) / (arr[hi]-arr[Lo]) ]
 *
 *   lo : starting index arr
 *   hi : ending index
 */
public class InterpolationSearch extends Algorithms {

    public int search(int[] arr,int wanted){
        int lower = 0;
        int higher = arr.length - 1;

        while( lower <= higher &&
                wanted >= arr[lower] &&
                wanted <= arr[higher]){

            if (lower == higher){
                printSelected(arr,lower, ANSI_RED);
                return arr[lower] == wanted ? lower : -1;
            }

            //  pos = low + (highLow farkı/arrHighLow farkı * (aranan - arrLowValue))
            int position = lower + (((higher - lower) / (arr[higher] - arr[lower]) * (wanted - arr[lower])));

            if (arr[position] == wanted){
                printSelected(arr,position, ANSI_RED);
                return position;
            }

            if ( arr[position] < wanted){
                lower = position + 1;
            }else{
                higher = position - 1;
            }
       }
        return -1;
    }
}
