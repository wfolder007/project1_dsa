//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//        You must write an algorithm that runs in O(n) time and without using the division operation.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,4]
//        Output: [24,12,8,6]
//        Example 2:
//
//        Input: nums = [-1,1,0,-3,3]
//        Output: [0,0,9,0,0]
//
//
//        Constraints:
//
//        2 <= nums.length <= 105
//        -30 <= nums[i] <= 30
//        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.


package com.java.leetCode;

public class ProductOfArraysExceptSelf
{
    public static void main(String[] args)
    {
        fun();
    }

    static void fun()
    {
        int a[] = {1,2,3,4};
        int res[] = product(a);
        for(int i : res)
        {
            System.out.println(i);
        }
    }

    static int[] product(int a[])
    {
        int n = a.length;
        int [] ans = new int[n];
        int[] p = new int[n];
        int [] s= new int[n];
        int product =1;

        p[0] = 1;
        for(int i = 1 ; i< n ; i++)
        {
            product = product*a[i-1];
            p[i]=product;
        }
        product = 1;
        for(int i = n-2 ;  i>=0 ; i--)
        {
            product = product*a[i+1];
            s[i]=product;
        }
        s[n-1]=1;

        for(int i =0 ; i < n ; i++)
        {
            ans[i]=s[i]*p[i];
        }

        return ans;
    }
}
