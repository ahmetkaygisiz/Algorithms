package com.akua.search;

import com.akua.Algorithms;

/**
 * Sıralı arrayler için kullanılır.
 * Elemanı ortalayana kadar 2 ye bölerek ilerliyoruz
 * Eğer eleman bulunmadıysa ve ortadaki elemandan büyükse
 *
 */
public class BinarySearch extends Algorithms {

    // first call search(arr, 0, arr.length -1, wantedValue)
    public int search(int arr[], int l, int r, int wanted){
        if ( r >= l){
            int mid = l + (r -l)/2;

            if(arr[mid] == wanted){
                printSelected(arr, mid, ANSI_RED);
                return mid;
            }


            if( arr[mid] > wanted)
                return search(arr, l, mid-1, wanted);
            return search(arr, mid+1, r, wanted);
        }

        return -1;
    }
}
