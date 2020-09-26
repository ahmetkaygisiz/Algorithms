package com.akua;

import com.akua.search.*;
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

        int[] sortedArray = new BucketSort().sort(arr);

        BinarySearch bs = new BinarySearch();
        int binarySIndex = bs.search(sortedArray,0,arr.length-1, wanted);
        System.out.println("bsIndex = " + binarySIndex);
        
        LinearSearch ls = new LinearSearch();
        int linearSIndex = ls.search(arr, wanted);
        System.out.println("linearSIndex = " + linearSIndex);
        
        JumpSearch js = new JumpSearch();
        int jumpSIndex = js.search(sortedArray, wanted);
        System.out.println("jumpSIndex = " + jumpSIndex);
        
        FibonacciSearch fs = new FibonacciSearch();
        int fiboSIndex = fs.search(sortedArray, wanted);
        System.out.println("fiboSIndex = " + fiboSIndex);
        
        InterpolationSearch is = new InterpolationSearch();
        int interpolationSIndex =is.search(sortedArray,wanted);
        System.out.println("interpolationSIndex = " + interpolationSIndex);
        
        ExponentialSearch es = new ExponentialSearch();
        int exponentialSIndex = es.search(sortedArray,wanted);
        System.out.println("exponentialSIndex = " + exponentialSIndex);
    }
}
