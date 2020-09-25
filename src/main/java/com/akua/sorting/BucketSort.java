package com.akua.sorting;

import com.akua.Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

/**
 *  BucketSort Algorithm
 *  <code>
 *      bucketSort()
 *      create N buckets each of which can hold a range of value
 *
 *      for all the buckets
 *          initialize each bucket with 0 values
 *
 *      for all the buckets
 *          put elements into buckets matching the range
 *
 *      for all the buckets
 *          sort elements in the each bucket
 *
 *      gather elements from each bucket
 *
 *  </code>
 */
public class BucketSort extends Algorithms {

    public void bucketFloatSort(float[] arr, int n){
        if (n <= 0)
            return;

        @SuppressWarnings("unchecked")
        Vector<Float>[] bucket = new Vector[n];

        for(int i = 0; i < n; i++){
            bucket[i] = new Vector<Float>();
        }

        for(int i = 0; i < n; i++){
            int index = (int) arr[i] * n;
            bucket[index].add(arr[i]);
        }

        for(int i = 0; i < n; i++)
            Collections.sort(bucket[i]);

        int index = 0;

        for(int i = 0; i < n; i++)
            for(int j = 0; i < bucket[i].size(); j++)
                arr[index++] = bucket[i].get(j);
    }

    public int[] sort(int[] nums){
        int maxValue = max_value(nums);

        int[] bucket = new int[maxValue + 1];

        int[] sorted_nums = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            bucket[nums[i]]++;

        int outPos = 0;

        for (int i = 0; i < bucket.length; i++)
            for (int j = 0; j < bucket[i]; j++)
                sorted_nums[outPos++] = i;

        return sorted_nums;
    }

    public int max_value(int[] nums) {
        int max_value = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max_value)
                max_value = nums[i];

        return max_value;
    }

}
