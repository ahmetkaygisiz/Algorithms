package com.akua.search;

import com.akua.Algorithms;

/**
 *  Exponential search involves two steps :
 *      1 - Find range where element is present
 *      2 - Do Binary Search in the above found range. ? :D
 */
public class ExponentialSearch extends Algorithms {

    public int search(int arr[], int wanted){
        if (arr[0] == wanted){
            return 0;
        }

        int i = 1;

        while(i < arr.length && arr[i] <= wanted){
            i = i * 2;
        }

        return new BinarySearch().search(arr,i/2, findMin(i , arr.length), wanted);
    }
}
