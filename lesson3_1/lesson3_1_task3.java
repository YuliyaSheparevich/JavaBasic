package lesson3_1;

import java.util.Scanner;

public class lesson3_1_task3 {

    public static void main(String[] args) {
        int i;

        System.out.print("Введи количество элементов массива" + "\n");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Введи целое число!");
            sc.next();
        }
        i = sc.nextInt();

        double[] a = new double[i];

        enterArray(a);

        OpredeleniePosled(a);

    }

    public static void enterArray(double[] mas) {

        System.out.print("Введи массив" + "\n");
        Scanner fc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {

            System.out.print("ar[" + i + "]=>");
            mas[i] = fc.nextDouble();
        }
    }

    public static void OpredeleniePosled(double[] a) {
        System.out.println("--------------------------------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]=" + a[i] + "; ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");
        boolean vozrast=true;
        boolean flag=false;
        int i=1;


        while(flag == false){
            while(i < a.length) {
                if(a[i-1] >a[i]){
                    System.out.println(" Не Возрастающая");
                    flag=true;
                    vozrast=false;
                    break;
                }
                i++;
            }
            flag=true;
        }

        if(vozrast==true){
            System.out.println("Возрастающая");

        }
    }
}
