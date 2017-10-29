package lesson1_2;

import java.util.Scanner;
import static java.lang.Math.tan;


public class lesson1_2_task8 {
    public static void main(String[] args) {

        double a, b, c, d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи  значение а");
        while (!sc.hasNextDouble()) {
            System.out.println("Введи  число!");
            sc.next();
        }
        a = sc.nextDouble();

        System.out.println("Введи  значение b");
        while (!sc.hasNextDouble()) {
            System.out.println("Введи  число!");
            sc.next();
        }
        b = sc.nextDouble();

        System.out.println("Введи  шаг");
        while (!sc.hasNextDouble()) {
            System.out.println("Введи  число!");
            sc.next();
        }
        c = sc.nextDouble();
        System.out.print("x" + "           F(x)" + "\n");
        while(a<b)
        {
            System.out.print(a + "    ");
            d=2*tan(a/2)+1;
            System.out.print(d  + "\n");
            a=a+c;
        }

    }
}