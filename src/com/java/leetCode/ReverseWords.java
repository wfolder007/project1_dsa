package com.java.leetCode;

public class ReverseWords
{
    public static void main(String[] args)
    {
        fun();
    }

    static void fun()
    {
        String originalString = "a good   example";
        reverseWords(originalString);
    }

    static String reverseWords(String originalString)
    {
        StringBuffer duplicateString = new StringBuffer();
        String arr1[] = originalString.split(" ");
        int n = arr1.length;
        String arr2[]= new String[arr1.length];
        int pointer1 = 0;
        for(int i = 0 ; i<n ; i++)
        {
            if(arr1[i] != "") {
                arr2[pointer1] = arr1[i];
                pointer1++;
            }

        }
        for(int i = n-1 ; i>=0 ;i--)
        {
            if(arr2[i] != null)
            {
                duplicateString.append(arr2[i]);
                if(i>0)
                    duplicateString.append(" ");
            }
        }

        return duplicateString.toString();
    }
}
