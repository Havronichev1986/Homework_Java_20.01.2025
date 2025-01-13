package org.example.Task_2;

import java.util.Scanner;

public class KeyboardInputAndOutput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        double i = scanner.nextDouble();

        System.out.println("Введите процент: ");
        double y = scanner.nextDouble();

        method(i,y);

        scanner.close();

    }
    public static void method(double i, double y){
        double result = (i * y) / 100;
        System.out.printf(y + " порцентов от " + i + " равно: " + result);
    }
}
