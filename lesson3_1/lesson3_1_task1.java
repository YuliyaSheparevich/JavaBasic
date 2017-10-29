package lesson3_1;

import java.util.Scanner;

public class lesson3_1_task1 {

    public static void main(String[] args) {
        int i;
        int K=0;
        System.out.print("Введи количество элементов массива" + "\n");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Введи целое число!");
            sc.next();
        }
        i=sc.nextInt();

        int[] a= new int[i];

        enterArrayFromConsole(a);
        K=kratnoe();
        summaElem(a,K);


    }

    public static void enterArrayFromConsole(int[] mas) {


        System.out.print("Введи массив" + "\n");
        Scanner fc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {

            System.out.print("ar[" + i + "]=>");
            mas[i] = fc.nextInt();
        }
    }
    public static int kratnoe(){

        System.out.print("Введи кратное число" + "\n");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Введи целое число!");
            sc.next();
        }
        return sc.nextInt();
    }


    public static void summaElem(int[] a, int K){
        int SUM=0;
        for(int i=0; i<a.length; i++){

            if(a[i]%K==0){
                SUM=SUM+a[i];
            }

        }
        System.out.println("Сумма элементов, кратных "+ K + "=  " + SUM);

    }

}
