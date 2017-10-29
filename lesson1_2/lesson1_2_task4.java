package lesson1_2;

import java.util.Scanner;


public class lesson1_2_task4 {
    public static void main(String[] args) {
        int a, b, ch = 0, tri = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введи  количество чисел");
        while (!sc.hasNextInt()) {
            System.out.println("Введи целое число, а не что-то другое");
            sc.next();
        }
        a = sc.nextInt();
        System.out.println("Введи " + a + "целых чисел/а");
        for (int i = 0; i < a; i++) {

            while (!sc.hasNextInt()) {
                System.out.println("Введи целое число!");
                sc.next();
            }
            b = sc.nextInt();

            if (15>b | b>2) {
                ch++;
            }
            if (b % 5 == 4){
                tri=tri+b;
            }


        }
        System.out.println(" чисел больше 15 или <2 было = " + ch);
        System.out.println("сумма чисел, которые делятся на 5 с остатком 4  = " + tri);

    }
}
