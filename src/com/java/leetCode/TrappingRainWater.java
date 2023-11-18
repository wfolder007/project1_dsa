package com.java.leetCode;

public class TrappingRainWater
{
    public static void main(String[] args) {
        fun();
    }

    static void fun()
    {
        int a[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingWater(a));
    }

    static int trappingWater(int a[])
    {
        int n = a.length;
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        int total=0;
        lMax[0]=a[0];
        int max=lMax[0];
        for(int i = 1 ; i<n ; i++)
        {
            max = Math.max(max, a[i-1]);
            lMax[i] = max;
        }

        rMax[n-1]=a[n-1];
        max = rMax[n-1];
        for(int i = n-2 ; i>=0 ; i--)
        {
            max = Math.max(max, a[i+1]);
            rMax[i] = max;
        }

        for(int i = 1 ; i< n-1 ; i++)
        {
            if(a[i] < Math.min(lMax[i],rMax[i]))
                total += Math.min(lMax[i],rMax[i])-a[i];
        }
        return total;
    }
}
