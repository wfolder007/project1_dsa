package com.java.binarySearch;

public class SearchingInfinite
{
    public static void main(String[] args)
    {
        fun();
    }

    static void fun()
    {
        int a[] = {1,10,15,20,40,60,80,100,200,500,1000,2000,3000};
        System.out.println(searchInfinite(a,20));
    }

    static int searchInfinite(int a[], int target)
    {
        int i = 1;
        if(a[0]==target)
            return 0;
        while(a[i] < target)
        {
            if(a[i] == target)
                return i;
            i=i*2;
        }

        return binarySearch(a,i/2+1,i,target);
    }

    static int binarySearch(int a[], int s, int e, int target)
    {
        int mid;
        while(s<=e)
        {
            mid = (s+e)/2;
            if(target > a[mid])
                s=mid+1;
            else if (target < a[mid])
                e = mid-1;
            else
                return mid;
        }

        return -1;
    }
}
