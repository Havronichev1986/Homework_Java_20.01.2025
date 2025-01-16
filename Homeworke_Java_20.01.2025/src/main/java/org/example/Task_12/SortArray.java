package org.example.Task_12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Stream;

public class SortArray {

    private static final Random random = new Random();

    public static void main(String[] args) {

        Integer[] ar = RandomArray();
        Stream<Integer> SortAscending = newArraySortAscending(ar);
        Stream<Integer> SortDescending = newArraySortDescending(ar);

        System.out.printf("\nОригинальный массив: " + Arrays.toString(ar));
        System.out.printf("\nСортировка по возростанию: " + Arrays.toString(SortAscending.toArray()));
        System.out.printf("\nСортировка по убыванию: " + Arrays.toString(SortDescending.toArray()) + "\n");
    }

    public static Integer[] RandomArray() {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (random.nextInt(20) - 10);
        }
        return Arrays.stream(arr).toArray(Integer[]::new);
    }
    public static Stream<Integer> newArraySortAscending(Integer[] arr){
        return Arrays.stream(arr).sorted();
    }
    public static Stream<Integer> newArraySortDescending(Integer[] arr){
        return Arrays.stream(arr).sorted(Collections.reverseOrder());
    }
}
