package lesson1_1;
import java.util.Scanner;
import static java.lang.Math.log;
import static java.lang.Math.pow;

public class lesson1_1_task6 {
    public static void main(String[] args) {
        double a, b, c, d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите  A");
        while (!sc.hasNextDouble()) {
            System.out.println("Введите число, а не что-то другое");
            sc.next();
        }
        a = sc.nextDouble();

        System.out.println("Введите  B");
        while (!sc.hasNextDouble()) {
            System.out.println("Введите число, а не что-то другое");
            sc.next();
        }
        b = sc.nextDouble();

        System.out.println("Введите C");
        while (!sc.hasNextDouble()) {
            System.out.println("Введите число, а не что-то другое");
            sc.next();
        }
        c = sc.nextDouble();


        d = pow(a, 2) - pow((b - c), 2) + log(b * b + 1);

        System.out.println("ответ = " + d);

    }
}
