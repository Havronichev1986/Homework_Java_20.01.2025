package org.example.Task_4;

import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите первое число: ");
        String i = scanner.next();

        System.out.printf("Введите второе число: ");
        String y = scanner.next();

        System.out.printf("Введите третье число: ");
        String f = scanner.next();

        System.out.printf("Введите четвертое число: ");
        String a = scanner.next();

        System.out.printf("Введите пятое число: ");
        String q = scanner.next();

        System.out.printf("Введите шестое число: ");
        String g = scanner.next();

        System.out.printf("Ваше число: " + i + y + f + a + q + g);

        System.out.println("\nСформированное число: " + g + q + f + a + y + i);

        scanner.close();
    }
}
