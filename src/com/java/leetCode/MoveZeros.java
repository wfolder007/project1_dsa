package com.java.leetCode;

public class MoveZeros
{
    public static void main(String[] args) {
        fun();
    }
    static void fun()
    {
        int a[] = {1,0,4,0,5,7};
        moveZeros(a);
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
    }
}
