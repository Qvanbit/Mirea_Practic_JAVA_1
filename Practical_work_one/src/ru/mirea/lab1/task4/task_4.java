package ru.mirea.lab1.task4;

import java.util.Arrays;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len_array = scanner.nextInt();
        double[] arr = new double[len_array];
        int i = 0;
        while (i < len_array) {
            arr[i] = scanner.nextDouble();
            i++;
        }
        Arrays.sort(arr);
        double max_arr = arr[len_array - 1];
        double min_arr = arr[0];
        System.out.println("Максимальный элемент массива = " + max_arr);
        System.out.println("Минимальный элемент массива " + min_arr);
    }
}
