package com.akua;

import com.akua.search.BinarySearch;
import com.akua.search.FibonacciSearch;
import com.akua.search.JumpSearch;
import com.akua.search.LinearSearch;
import com.akua.sorting.*;
import com.sun.net.httpserver.Headers;
//import com.akua.sorting.InsertionSort;

public class App 
{
    public static void main( String[] args )
    {
        int arr[] = {43,11,55,1,44,3,6,43,5,7,4,34};
        //sortAlgorithms(arr);

        searchAlgorithms(arr, 34);
    }

    public static void sortAlgorithms(int[] arr){
        //BubbleSort bs = new BubbleSort();
        //bs.sort(arr);

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

        //BucketSort bucketSort = new BucketSort();
        //bucketSort.sort(arr);

    }

    public static void searchAlgorithms(int[] arr,int wanted){
  /*      BinarySearch bs = new BinarySearch();
        System.out.println("index : " + bs.search(new BucketSort().sort(arr),0,arr.length-1, wanted) + "\n");

        LinearSearch ls = new LinearSearch();
        System.out.println("index : " + ls.search(arr, wanted) + "\n");

        JumpSearch js = new JumpSearch();
        System.out.println("index : " + js.search(new BucketSort().sort(arr), wanted));
  */
        FibonacciSearch fs = new FibonacciSearch();
        System.out.println("index : " + fs.search(new BucketSort().sort(arr), wanted));

    }
}
