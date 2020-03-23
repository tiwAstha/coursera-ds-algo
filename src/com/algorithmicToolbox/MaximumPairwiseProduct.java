package com.algorithmicToolbox;

import java.util.Arrays;

public class MaximumPairwiseProduct {

    static long maxProdPairwise(int[] numbers, int len){

        if(len == 1)
            return numbers[0];
        else if (len == 0)
            return 0;
        else{

        /*  //O(nlog(n))
            long prod;
            Arrays.sort(numbers);
            prod = numbers[len-1] * numbers[len-2];
            return prod;
         */

        //O(n)
        long prod;
        int max1 = numbers[0];
        int max2 = numbers[0];
        for(int i : numbers){
            if(i > max1){
                max2 = max1;
                max1 = i;

            }
            else if(i <= max1 && i > max2){
                max2 = i;
            }

        }
        prod = max1*max2;
        return prod;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2,9,3,1,9};
        long product = maxProdPairwise(numbers, numbers.length);
        System.out.println("max product pairwise is "+product);
    }
}
