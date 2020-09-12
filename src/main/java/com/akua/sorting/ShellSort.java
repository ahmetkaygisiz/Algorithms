package com.akua.sorting;
/**
 *  Worst : O(n^2)
 *  Best : O(nlogn)
 */
public class ShellSort {
    public void sort(int[] arr, int n){
        for (int interval = n / 2; interval > 0; interval /= 2){
            shell(arr,n, interval);
        }
    }

    void shell(int array[], int n, int interval) {
        for (int i = interval; i < n; i += 1) {
            int temp = array[i];
            int j;

            for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                array[j] = array[j - interval];
            }

            array[j] = temp;
        }
    }

}
