package ru.mirea.lab1.task3;

public class task_3 {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 1, 4, 7, 11, 17, 19, 24};
        int len_array = arr.length;
        int sum_arr = 0;
        for (int i = 0; i < len_array; i++) {
            sum_arr += arr[i];
        }
        double avarage = (double) sum_arr / len_array;
        System.out.println("Сумма масива = " + sum_arr);
        System.out.println("Среднее арифмитическое массива = " + avarage);
    }
}
