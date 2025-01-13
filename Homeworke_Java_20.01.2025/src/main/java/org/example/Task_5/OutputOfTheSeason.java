package org.example.Task_5;

import java.util.Scanner;

public class OutputOfTheSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите номер месяца: ");
        int i = scanner.nextInt();

        method(i);

        scanner.close();
    }
    public static void method(int i){
        if (i == 1 || i == 2 || i == 12) {
            System.out.printf("Winter");
        }if (i >=3 && i <=5){
            System.out.printf("Spring");
        }if (i >=6 && i <=8) {
            System.out.printf("Summer");
        }
        if (i >=9 && i <=11) {
            System.out.printf("Autumn");
        }
    }
}
