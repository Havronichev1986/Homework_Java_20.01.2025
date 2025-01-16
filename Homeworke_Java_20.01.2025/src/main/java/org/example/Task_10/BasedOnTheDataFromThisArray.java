package org.example.Task_10;

import java.util.Arrays;
import java.util.Random;

public class BasedOnTheDataFromThisArray {

    private static final Random random = new Random();

    public static void main(String[] args) {

        Integer[] ar = RandomArray();

        Integer[] oddNumbers = newArrayOddNumbers(ar);
        Integer[] EvenNumbers = newArrayEvenNumbers(ar);
        Integer[] NegativeNumbers = newArrayNegativeNumbers(ar);
        Integer[] PositiveNumbers = newArrayPositiveNumbers(ar);
        Integer[] Nulls = newArrayNulls(ar);

        System.out.printf("Оригинальный массив: " + Arrays.toString(ar));
        System.out.println("\nНечетные числа из оригинального массива: " + Arrays.toString(oddNumbers));
        System.out.println("Четные числа из оригинального массива: " + Arrays.toString(EvenNumbers));
        System.out.println("Отрицательные числа из оригинального массива: " + Arrays.toString(NegativeNumbers));
        System.out.println("Положительные числа из оригинального массива: " + Arrays.toString(PositiveNumbers));
        System.out.println("Нули из оригинального массива: " + Arrays.toString(Nulls));
    }

    public static Integer[] RandomArray() {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (random.nextInt(20) - 10);
        }
        return Arrays.stream(arr).toArray(Integer[]::new);
    }
    public static Integer[] newArrayOddNumbers(Integer[] arr) {

        return Arrays.stream(arr)
                .filter(e -> e % 2 != 0)
                .toArray(Integer[]::new);
    }
    public static Integer[] newArrayEvenNumbers(Integer[] arr) {

        return Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .toArray(Integer[]::new);
    }
    public static Integer[] newArrayNegativeNumbers(Integer[] arr) {

        return Arrays.stream(arr)
                .filter(e -> e < 0)
                .toArray(Integer[]::new);
    }
    public static Integer[] newArrayPositiveNumbers(Integer[] arr) {

        return Arrays.stream(arr)
                .filter(e -> e > 0)
                .toArray(Integer[]::new);
    }
    public static Integer[] newArrayNulls(Integer[] arr) {

        return Arrays.stream(arr)
                .filter(e -> e == 0)
                .toArray(Integer[]::new);
    }
}
