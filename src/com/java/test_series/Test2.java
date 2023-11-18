package com.java.test_series;
class Test2
{
    public static void main(String[] args)
    {
        fun();
    }

    static void fun()
    {
        int a[] = {2, 5, 0, 6};
        System.out.println(increasingTriplet(a));
    }

    static boolean increasingTriplet(int nums[])
    {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n <= max1) max1 = n;
            else if(n <= max2) max2 = n;
            else return true;
        }
        return false;

    }
}