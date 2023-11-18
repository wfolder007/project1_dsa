package com.java.binarySearch;

public class SortedRotatedArray
{
    public static void main(String[] args) {
        fun();
    }

    static void fun()
    {
        int a[] = {10,20,30,40,50,8,9};
        System.out.println(search(a,30));
    }

    static boolean search(int a[], int x)
    {
        int n = a.length;
        int s = 0, e=n-1;
        int mid;
        while(s<=e)
        {
            mid = (s+e)/2;
            if(x<a[mid])

                if(x>a[s] && x<a[mid])
                    e=mid-1;
                else
                    s=mid+1;
            else if (x>a[mid])
                s=mid+1;
            else
                return true;

        }
        return false;
    }

}
