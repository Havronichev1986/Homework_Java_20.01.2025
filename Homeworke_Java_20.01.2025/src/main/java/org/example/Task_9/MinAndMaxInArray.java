package org.example.Task_9;

import java.util.Arrays;
import java.util.Random;

public class MinAndMaxInArray {

    private static final Random random = new Random();
    public static void ArraysMethod(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = (random.nextInt(20) - 10);
            System.out.printf(arr[i] + " | ");
        }

        int maxArray = Arrays.stream(arr).max().getAsInt();
        int minArray = Arrays.stream(arr).min().getAsInt();

        System.out.println("\nmax значение в масиве: " + maxArray);
        System.out.println("min значение в масиве: " + minArray);

        int count = 0;
        for (int num : arr){
            if (num < 0)count++;
        }
        System.out.println(count + "  отрицательных значений в массиве");

        int count1 = 0;
        for (int num : arr){
            if (num > 0)count1++;
        }
        System.out.println(count1 + "  положительных значений в массиве");

        int count2 = 0;
        for (int num : arr){
            if (num == 0)count2++;
        }
        System.out.println(count2 + "  значений равных 0 в массиве");
    }

    public static void main(String[] args) {

        int[] arr = new int[12];
        ArraysMethod(arr);

    }


}
