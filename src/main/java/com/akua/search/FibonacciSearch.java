package com.akua.search;

import com.akua.Algorithms;

/**
 * for the SORTED Arrays
 *
 * The idea is to first find the smallest Fibonacci number that is
 * greater than or equal to length of given array.
 *
 * We use (m-2)'th fibonacci number as the index if it is a valid index.
 *
 * i = fib(m-2) == arr[i] return i
 * else greater we recur for subarrray after i
 * else we recur for subarray before i
 */
public class FibonacciSearch extends Algorithms {



    public int[] findFibonacci(int arrLength){
        int[] fiboArr = new int[3];

        fiboArr[0] = 0;
        fiboArr[1] = 1;
        fiboArr[2] = fiboArr[0] + fiboArr[1];

        while (fiboArr[2] < arrLength){
            fiboArr[0] = fiboArr[1];
            fiboArr[1] = fiboArr[2];
            fiboArr[2] = fiboArr[0] + fiboArr[1];
        }

        return fiboArr;
    }

    public int[] slideBackFibonacci(int[] fiboArr, int step){
        int i = 0 ;

        while(i < step){
            fiboArr[2] = fiboArr[1];
            fiboArr[1] = fiboArr[0];
            fiboArr[0] = fiboArr[2] - fiboArr[1];
            i++;
        }

        return fiboArr;
    }

    public int search(int[] arr, int wanted){
        int[] fiboArr = findFibonacci(arr.length);

        int offset = -1;

        while (fiboArr[2] > 1){
            // array uzunlugunu kontrol et
            int i = findMin( offset + fiboArr[0], arr.length - 1 );

            if(arr[i] < wanted){
                slideBackFibonacci(fiboArr,1);
                offset = i;
            }
            else if(arr[i] > wanted){
                slideBackFibonacci(fiboArr,2);
            }
            else{
                printSelected(arr,i, ANSI_RED);
                return i;
            }
        }

        if ( fiboArr[1] == 1 && arr[offset + 1] == wanted){
            printSelected(arr,offset+1, ANSI_RED);
            return offset+1;
        }

        return -1;
    }
}
