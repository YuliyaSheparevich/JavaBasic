package lesson2_2;

import java.util.Scanner;

public class lesson2_2_task7 {
    public static void main(String[] args) {
        int i=0;
        System.out.print("Введи количество элементов массива" + "\n");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Введи целое число!");
            sc.next();
        }
        i=sc.nextInt();

        double[] mas = new double[i];

        enterArrayFromConsole(mas);
        findMaxElement(mas);
        findMinElementAndIndex(mas);
        sortArray(mas);
        printArray(mas);
    }

    public static void enterArrayFromConsole(double[] mas) {


        System.out.print("Введи массив" + "\n");
        Scanner fc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {

            System.out.print("ar[" + i + "]=>");
            mas[i] = fc.nextDouble();
        }
    }



    public static void printArray(double[] mas) {
        System.out.println("--------------------------------------------");
        for (int i = 0; i < mas.length; i++) {
            System.out.print("mas[" + i + "]=" + mas[i] + "; ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");
    }

    public static void findMaxElement(double[] mas) {
        if (mas.length == 0) {
            return;
        }
        double max;

        max = mas[0];

        for (int i = 1; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];

            }
        }
        System.out.println("Максимальный элемент- " + max);
    }

    public static void findMinElementAndIndex(double[] mas) {
        if (mas.length == 0) {
            return;
        }
        double min=mas[0];
        int index=0;
        for (int i = 1; i < mas.length; i++) {
            if (min > mas[i]) {
                min = mas[i];
                index=i;
            }
        }
        System.out.println("Min элемент- " + min + " Index- " + index);
    }



    public static void sortArray(double[] mas) {
        int minValueIndex = 0;
        for (int i = 0; i < mas.length; i++) {
            minValueIndex = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] < mas[minValueIndex]) {
                    minValueIndex = j;
                }
            }
            double temp = mas[i];
            mas[i] = mas[minValueIndex];
            mas[minValueIndex] = temp;
        }
    }
}
