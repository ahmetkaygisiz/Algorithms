package com.akua;

import com.akua.sorting.BubbleSort;
import com.akua.sorting.InsertionSort;
import com.akua.sorting.MergeSort;
import com.akua.sorting.SelectionSort;
//import com.akua.sorting.InsertionSort;

public class App 
{
    public static void main( String[] args )
    {
        int arr[] = {43,11,55,1,44,3,6,43,5,7,4,5};
    	
        //InsertionSort is = new InsertionSort();
        // is.sort(arr);
        
         //BubbleSort bs = new BubbleSort();
         //bs.sort(arr);

        //SelectionSort ss = new SelectionSort();
        //ss.sort(arr);

        MergeSort ms = new MergeSort();
        ms.mergeSort(arr,  arr.length);
    }
}
