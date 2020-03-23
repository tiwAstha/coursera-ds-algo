package com.algorithmicToolbox;

public class GCD {

    //O(min(a,b))
    static int gcdNaive(int a, int b){
        int d = 1;
        for(int i = 1; i <= a; i++ ){

            if(a % i == 0 && b % i == 0 )
                d = i;
        }
        return d;
    }

    //O(log(min(a,b)))
    static int euclidGCDRec(int a, int b){
        if(b == 0) return a;
        return euclidGCD(b, a % b);
    }

    static int euclidGCD(int a, int b){
        int rem;

        while( b > 0){
            rem = a % b;
            a = b;
            b =  rem;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 18, b = 36;
        System.out.println("gcd of "+a+" and "+ b+" is : "+gcdNaive(a,b));
        System.out.println("gcd of "+a+" and "+ b+" is : "+euclidGCD(a,b));
    }
}


