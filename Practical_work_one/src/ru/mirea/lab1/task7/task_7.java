package ru.mirea.lab1.task7;

import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();
        System.out.println("Факторил числа " +  factorial + " = " + fact(factorial));
    }

    static int fact(int f) {
        int result = 1;
        for (int i = 1; i < f + 1; i++) {
            result *= i;
        }
        return result;
    }
}
