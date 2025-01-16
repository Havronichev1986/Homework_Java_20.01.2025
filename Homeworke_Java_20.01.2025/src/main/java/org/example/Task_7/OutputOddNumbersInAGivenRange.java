package org.example.Task_7;

import java.util.Scanner;

public class OutputOddNumbersInAGivenRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите первое число: ");
        int start = scanner.nextInt();

        System.out.printf("Ввелите второе число:");
        int end = scanner.nextInt();

        method(start,end);

        scanner.close();
    }

    public static void method(int start, int end) {
        if (start > end) {
            for (int i = end; i <= start; i++) {
                if (i % 2 != 0) {
                    System.out.printf(i + " , ");
                }
            }

        }else {
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    System.out.printf(i + " , ");
                }
            }
        }
    }
}