package com.algorithmicToolbox;

public class Fibonacci {
    //slow naive algorithm because it calculates duplicates e.g T(n-3) from T(n-2) and T(n-1)
    //O(2^n)
    static int fibRecursive(int n ){
        if(n <= 1)
            return n;
        else
            return fibRecursive(n-1)+ fibRecursive(n-2);
    }

    //faster efficient algorithm
    //O(n)
    static int fibonacci(int n ){
        int[] results = new int[n+1];
        results[0] = 0;
        results[1] = 1;

        for(int i = 2; i <= n ; i ++){
            results[i] = results[i-1] + results[i-2];
        }
        return results[n];
    }

    public static void main(String[] args) {
        //int res = fibRecursive(6);
        int res = fibonacci(14);
        System.out.println("recursive result of fib : "+res);
    }
}
