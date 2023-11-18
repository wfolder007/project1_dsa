
// Problem description:

// This problem contains solution to finding first occurence, and finding the last occurence, finally we used those both functions
//to find the number of occurences.


package com.java.binarySearch;

public class CountOccurence
{
    public static void main(String[] args)
    {
            fun();
    }

    static void fun()
    {
        int a[] = {10,20,20,20,30,30};
        int s = 0;
        int e = a.length-1;
        int target = 20;
        System.out.println(countOccurences(a,s,e,target));
    }

    static int countOccurences(int a[], int s, int e, int target)
    {
        FirstOccurence o1 = new FirstOccurence();
        LastOccurence o2 = new LastOccurence();
        int index1 = o1.firstOccurence(a,s,e,target);

        if(index1 == -1)
            return 0;
        else
            return (o2.lastOccurence(a,s,e,target)-index1+1);
    }

}

class FirstOccurence
{
    int firstOccurence(int a[], int s, int e, int target)
    {
        int mid;
        while(s<=e)
        {
            mid = (s+e)/2;
            if(target < a[mid])
                e=mid-1;
            else if(target > a[mid])
                s=mid+1;
            else {
                if(mid==0 || a[mid-1]!=a[mid])
                    return mid;
                else
                    e=mid-1;
            }
        }
        return -1;
    }
}

class LastOccurence
{
    int lastOccurence(int a[], int s, int e, int target)
    {
        int mid ;
        int n = a.length;
        while(s<=e)
        {
            mid = (s+e)/2;
            if(target < a[mid])
                e=mid-1;
            else if(target > a[mid])
                s=mid+1;
            else {
                if(mid==n-1 || a[mid+1]!=a[mid])
                    return mid;
                else
                    s=mid+1;
            }
        }
        return -1;
    }
}
