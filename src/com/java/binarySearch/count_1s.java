package com.java.binarySearch;

public class count_1s
{
    public static void main(String[] args)
    {
        fun();
    }

    static void fun()
    {
        int a[] = {0,0,0,0};
        int s = 0;
        int e = a.length-1;
        int target = 1;
        System.out.println(count(a,s,e,target));
    }

    static int firstOccurence(int a[], int s, int e, int target)
    {
        int mid;
        while(s<=e)
        {
            mid = (s+e)/2;
            if(target<a[mid])
                e = mid-1;
            else if(target > a[mid])
                s = mid+1;
            else {
                if(mid == 0 || a[mid-1]!=a[mid])
                    return mid;
                else
                    e=mid-1;
            }
        }
        return -1;
    }

    static int count(int a[], int s, int e, int target)
    {
        int index1 = firstOccurence(a,s,e,target);

        if(index1 == -1)
            return 0;
        else
            return (e-index1+1);
    }
}
