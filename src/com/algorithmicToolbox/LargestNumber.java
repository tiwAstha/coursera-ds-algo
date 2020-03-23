package com.algorithmicToolbox;

public class LargestNumber {

    public static void main(String[] args) {
        int[] numbers = {5,9,9,3,1};
        System.out.println(largestNumber(numbers));
    }

    static String largestNumber(int[] numbers){

        StringBuilder stringBuilder = new StringBuilder();
        int[] result;
        int j = 0;
        while(j < numbers.length){
            result = findMax(numbers);
            stringBuilder.append(result[0]);
            numbers[result[1]] = -1;
            j++;
        }
        return new String(stringBuilder);

    }

    static int[] findMax(int[] numbers){
        int max = Integer.MIN_VALUE;
        int index = -1;
        int[] result = new int[2];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
                index = i;
            }
        }
        result[0] = max;
        result[1] = index;
        return result;
    }
}
