package org.example.Task_11;

public class MethodDisplayingLine {
    public static void main(String[] args) {

        drawLine(10, "horizontal", '*');
        drawLine(5, "vertical", '#');

    }

    public static void drawLine(int length, String direction, char symbol) {
        if (length <= 0) {
            System.out.println("Длина линии должна быть положительным числом.");
            return;
        }

        if (direction.equalsIgnoreCase("horizontal")) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        } else if (direction.equalsIgnoreCase("vertical")) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Направление должно быть 'horizontal' или 'vertical'.");
        }
    }
}
