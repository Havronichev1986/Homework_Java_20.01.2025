package org.example.Task_3;

import java.util.Scanner;

public class Create_a_NumberContainingTheEnteredDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите первое число: ");
        String i = scanner.next();

        System.out.printf("Введите второе число: ");
        String y = scanner.next();

        System.out.printf("Введите третье число: ");
        String f = scanner.next();

        System.out.printf("Сформированное число: " + i + y + f);

        scanner.close();
    }
}
