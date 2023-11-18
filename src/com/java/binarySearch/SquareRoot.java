package com.java.binarySearch;

public class SquareRoot
{
    public static void main(String[] args)
    {
        fun();
    }

    static void fun()
    {
        int x = 4 ;
        System.out.println(sqrtEff(x));
    }

// The below function is of O(n^1/2) time complexity, but we can do much efficient solution using binary search.

    static int sqrt(int x)
    {
        int result = 0;
        for(int i = 1 ; i*i <= x ;i++)
        {
            result = i;
        }
        return result;
    }


// Below code is most efficient, using binary search.

    static int sqrtEff(int x)
    {
        int res = 0;
        int s = 1 , e = x;
        int mid = 0 ;
        while(s<=e)
        {
            mid=(s+e)/2;
            int temp = mid*mid;
            if(x<temp)
                e = mid-1;
            else if(x>temp)
                s=mid+1;
            else {
                s = mid + 1;
                res = mid;
            }
        }

        return res;
    }

}
