package com.java.test_series;

import java.util.Arrays;

public class Test4 {

    public static void main(String[] args) {
        fun();
    }

    static void fun()
    {
        int a[] = {1,1,1,0,0,0,1,1,1,1,0};
        consecutiveOnes(a,2);
    }

    static int consecutiveOnes(int a[], int k)
    {
        int count=0;
        int n = a.length;
        int res=0;
        int temp =k;

        for(int i =0 ; i<k ; i++)
        {
            if(a[i]==1)
                count++;
        }

        for(int i = 1; i< n ; i++)
        {
            if(a[i+k-1]==0 && a[i]==1 && temp>0)
            {
                temp--;
                a[i+k-1]=1;
                if(temp==0)
                {
                    temp=k;
                    count=0;
                }
            }
            if(a[i+k-1] == 1)
            {
                count++;
            }
            res=Math.max(res,count);
        }

        return res;
    }
}
