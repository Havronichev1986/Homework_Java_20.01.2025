package org.example.Task_8;

import java.util.Scanner;

public class MultiplicationTableInAGivenRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя диапазон
        System.out.print("Введите начальное значение диапазона: ");
        int start = scanner.nextInt();

        System.out.print("Введите конечное значение диапазона: ");
        int end = scanner.nextInt();

        // Проверяем корректность диапазона
        if (start > end) {
            System.out.println("Начальное значение должно быть меньше или равно конечному значению.");
            return;
        }

        // Выводим таблицу умножения
        System.out.println("Таблица умножения от " + start + " до " + end + ":");
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d " + " | ", i, j, i * j );
            }
            System.out.println(); // Пустая строка между таблицами
        }

        scanner.close();
    }
}
