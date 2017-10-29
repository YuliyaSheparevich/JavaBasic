package lesson1_1;
import java.util.Scanner;

public class lesson1_1_task5 {

    public static void main(String[] args) {
        double a,b=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 4 числа");
        for (int i=0; i<4;i++){

            while (!sc.hasNextDouble()) {
                System.out.println("Введите число, а не что-то другое");
                sc.next();
            }
            a = sc.nextDouble();
            b=b+a;
        }

        System.out.println("Сумма = " + b);

    }
}
