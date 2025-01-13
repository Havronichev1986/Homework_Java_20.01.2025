package org.example.Task_6;

import java.util.Scanner;

public class TranslationOfMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите колличество метров: ");
        double i = scanner.nextLong();

        System.out.printf("Перевести в мили нажмите  - 1\n" +
                "Перевести в дюймы нажмите - 2\n" +
                "Перевести в ярды нажмите  - 3\n");
        int y = scanner.nextInt();

        method(i,y);

        scanner.close();
    }
    public static void method(double i, int y){
        switch (y){
            case 1:
                double result = i/1609.34;
                String output = String.format("%.8f", result); // 8 знаков после точки
                System.out.printf(i + "  метров в милях будет равно " + output);
                break;
            case 2:
                System.out.printf(i + "  метров в дюймах будет равно " + i * 39.37);
                break;
            case 3:
                double result1 = i*1.09361;
                String output1 = String.format("%.5f", result1); // 8 знаков после точки
                System.out.printf(i + "  метров в милях будет равно " + output1);
                break;

        }
    }
}
