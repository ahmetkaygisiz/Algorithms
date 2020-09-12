package com.akua;

import com.akua.sorting.*;
import com.sun.net.httpserver.Headers;
//import com.akua.sorting.InsertionSort;

public class App 
{
    public static void main( String[] args )
    {
        int arr[] = {43,11,55,1,44,3,6,43,5,7,4,34};
    	
        sortAlgorithms(arr);
    }

    public static void sortAlgorithms(int[] arr){
        BubbleSort bs = new BubbleSort();
        bs.sort(arr);

        //InsertionSort is = new InsertionSort();
        //is.sort(arr);

        //SelectionSort ss = new SelectionSort();
        //ss.sort(arr);

        //MergeSort ms = new MergeSort();
        //ms.mergeSort(arr,  arr.length);

        //QuickSort qs = new QuickSort();
        //qs.sorted(arr);

        //HeapSort hs = new HeapSort();
        //hs.sort(arr);
    }
}
