package lesson1_2;

        import java.util.Scanner;
        import static java.lang.Math.log;
        import static java.lang.Math.pow;

public class lesson1_2_task1 {
    public static void main(String[] args) {
        double a, b, c, d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи  А");
        while (!sc.hasNextDouble()) {
            System.out.println("Введи число, а не что-то другое");
            sc.next();
        }
        a = sc.nextDouble();

        System.out.println("Введи  В");
        while (!sc.hasNextDouble()) {
            System.out.println("Введи число, а не что-то другое");
            sc.next();
        }
        b = sc.nextDouble();

        if (a == b) {

            System.out.println("Скоро Новый Год!");
        }  else {
            System.out.println("Введи C");
            while (!sc.hasNextDouble()) {
                System.out.println("Введи число, а не что-то другое");
                sc.next();
            }
            c = sc.nextDouble();
            System.out.println("a+c+b = " + (a + c + b));
            System.out.println("a^2+b^2 = " + pow(a,2)+pow(b,2));
            System.out.println("моя любимая футбольная команда");
        }
    }

}