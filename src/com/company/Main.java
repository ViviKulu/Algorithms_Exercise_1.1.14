package com.company;

public class Main {

//    Write a static method lg() that takes an int value N as argument and returns
//    the largest int not larger than the base-2 logarithm of N. Do not use Math.

    public static void main(String[] args) {
        // write your code here
        int x = 7;
        System.out.println(lg(x));
    }

    public static int lg(int N) {
        if (N == 0)
            return -1;
        if (N == 1)
            return 0;
        if (N == 2)
            return 1;
        int difference = N - 2;
        int track = 2;
        int counter = 1;
        for (int i = 0; i < N; i++) {
            track *= 2;
            if ((N - track) < difference)
                difference = N - track;
            if (track > N)
                return counter;
            counter++;
        }
        return 0;
    }
}
