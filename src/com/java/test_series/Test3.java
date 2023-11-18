package com.java.test_series;

public class Test3
{
    public static void main(String[] args) {
        fun();
    }

    static void fun()
    {
        int a[]={0,0,10};
        moveZeros(a);
    }

    static void removeDuplicates(int a[])
    {
        int n = a.length;
        int temp[] =new int[n];
        int index= 1 ;
        int p=a[0];
        temp[0]=a[0];
        for(int i = 1 ; i< n ; i++)
        {
            if(a[i]!= p)
            {
                temp[index] = a[i];
                index++;
            }
            p=a[i];
        }
        for(int i : temp)
        {
            System.out.println(i);
        }
    }

    static void moveZeros(int[] a)
    {
        int n = a.length;
        int p=0;

        for(int i = 0 ; i< n ; i++)
        {
            if(a[i]!=0)
            {
                int temp = a[i];
                a[i]=a[p];
                a[p]=temp;
                p++;
            }
        }
        for(int i : a)
        {
            System.out.println(i);
        }
    }

}
