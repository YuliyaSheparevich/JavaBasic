package lesson3_1;

import java.util.Scanner;

public class lesson3_1_task2 {

    public static void main(String[] args) {
        int i;

        System.out.print("Введи количество элементов массива" + "\n");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Введи целое число!");
            sc.next();
        }
        i = sc.nextInt();

        int[] a = new int[i];

        enterArrayFromConsole(a);

        massivNull(a);

    }

    public static void enterArrayFromConsole(int[] mas) {

        System.out.print("Введи массив" + "\n");
        Scanner fc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {

            System.out.print("ar[" + i + "]=>");
            mas[i] = fc.nextInt();
        }
    }

    public static void massivNull(int[] a) {
        int m = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 0) {
                m++;
            }
        }


        if (m==0){
            System.out.println("Нулевых элементов нет!");

        }


        int[] SUM = new int[m];
        int f = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == 0) {
                SUM[f] = i;
                f++;
            }
        }

        System.out.println("--------------------------------------------");
        for (int i = 0; i < SUM.length; i++) {
            System.out.print("mas[" + i + "]=" + SUM[i] + "; ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");
    }
}
