package ru.mirea.lab1;
import java.util.Arrays;
import java.util.Scanner;

public class Practic {
    public static void main(String[] args){
        /* Задача 5 */
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        /* Задача 7 */
        System.out.println(task_7(5));
    }

    /* Задача 3 */
    static void  task_3(){
        int [] arr = {-4, -1 ,1, 4, 7, 11, 17, 19, 24};
        int len_array = arr.length;
        int sum_arr = 0;
        for(int i = 0; i < len_array; i++){
            sum_arr += arr[i];
        }
        double avarage = (double)sum_arr / len_array;
        System.out.println("Сумма масива = " + sum_arr);
        System.out.println("Среднее арифмитическое массива = " + avarage);
    }

    /* Задача 4 */
    static void task_4() {
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
    /* Задача 6 */
    static void task_6() {
        for(int i = 1; i < 11; i++){
            System.out.println(i + " значение = " + 1./i);
        }
    }
    /* Задача 7 */
        static int task_7(int f){
        int result = 1;
        for(int i = 1; i < f + 1; i++){
            result *= i;
        }
        return result;
    }
}
