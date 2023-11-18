package com.java.leetCode;

public class ContainerWithMostWater
{
    public static void main(String[] args)
    {
        fun();
    }

    static void fun()
    {
        int a[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater(a));
    }

    static int containerWithMostWater(int[] a)
    {
        int res = 0;
        int n = a.length;
        int s = 0, e=n-1;
        int size = n;
        while(s<=e)
        {
            int min_val = Math.min(a[s],a[e]);
            res = Math.max(res, min_val*(size-1));
            if(a[s]<=a[e])
            {
                s++;
            }
            else if (a[e]<a[s] || a[e]>a[e-1])
            {
                e--;
            }
            size--;
        }

        return res;
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int delta = right - left;
            int min;
            if (height[left] < height[right]) {
                min = height[left];
                while ((left < right) && (height[left] <= min)) {
                    left++;
                }
            } else {
                min = height[right];
                while ((left < right) && (height[right] <= min)) {
                    right--;
                }
            }

            max = Math.max(max, delta * min);
        }

        return max;

    }
}
