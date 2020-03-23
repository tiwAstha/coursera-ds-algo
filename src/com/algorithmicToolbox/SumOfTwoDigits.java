package com.algorithmicToolbox;

import java.util.Scanner;

public class SumOfTwoDigits {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        System.out.println("sum of two digits "+num1+" and "+num2+" is "+sum(num1, num2));
    }
    static int sum(int a, int b){
        return a+b;
    }
}
