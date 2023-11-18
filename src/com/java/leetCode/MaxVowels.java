package com.java.leetCode;

public class MaxVowels
{
    public static void main(String[] args) {
        fun();
    }

    static void fun() {
        int a[] = {};
        String s = "abciiidef";
        System.out.println(maximumNoOfVowels(s, 3));
    }

    static int maximumNoOfVowels(String s, int k) {
        int max = 0;
        int n = s.length();
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }
        max = count;

        for (int i = 1; i < n - k; i++) {
            if (s.charAt(i - 1) == 'a' || s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'i' || s.charAt(i - 1) == 'o' || s.charAt(i - 1) == 'u') {
                count--;
            }
            if (s.charAt(i + k - 1) == 'a' || s.charAt(i + k - 1) == 'e' || s.charAt(i + k - 1) == 'i' || s.charAt(i + k - 1) == 'o' || s.charAt(i + k - 1) == 'u') {
                count++;
            }

            max = Math.max(max, count);
        }
        return max;
    }
    public int maxVowels(String s, int k) {
        int n = s.length(), b = 0, z = 0;
        byte[] w = new byte[n];
        s.getBytes(0, n, w, 0);
        int e=0,q=0,f=0;
        e=b=f;
        byte[] t = new byte['{'];

        t['a'] = t['e'] = t['i'] = t['o'] = t['u'] = 1;


        while (b < k) {

            z += t[w[b++]];

        }

        for (int a = 0, c = z; b < n;) {
            if ((c += t[w[b++]] - t[w[a++]]) > z && (z = c) == k) return k;
        }
        return z;
    }
}
