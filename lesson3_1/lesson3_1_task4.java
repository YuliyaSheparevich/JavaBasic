package lesson3_1;

import java.util.Random;
import java.util.Scanner;

public class lesson3_1_task4 {

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
        Print(a);
        massivChetnie(a);

    }

    public static void enterArrayFromConsole(int[] a) {
        Random random=new Random();



        for (int i = 0; i < a.length; i++) {


            a[i] = random.nextInt(100);
        }
    }

    public static void Print(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"]="+a[i] + "   ");
        }
        System.out.println();
    }



    public static void massivChetnie(int[] a) {
        int m = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i]%2 == 0) {
                m++;
            }
        }


        if (m==0){
            System.out.println("Четных элементов нет!");

        }


        int[] SUM = new int[m];
        int f = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i]%2 == 0) {
                SUM[f] = a[i];
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
