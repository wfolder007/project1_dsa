package com.java.leetCode;

import java.util.Arrays;

public class MaxNoKsumPairs
{
    public static void main(String[] args)
    {
        fun();
    }

    static void fun()
    {
        int[] a = {1,2,3,4,5};
        System.out.println( maxNoKsumPairs(a,5));
    }

    static int maxNoKsumPairs(int a[], int k)
    {
        int n = a.length;
        int count=0;
        Arrays.sort(a);
        int s=0, e=n-1;

        while(s<e)
        {
            int sum = a[s]+a[e];
            if(sum==k)
            {
                s++;
                e--;
                count++;
            }
            else if(sum > k)
            {
                e--;
            }
            else if(sum < k)
            {
                s++;
            }
        }

        return count;
    }
}
