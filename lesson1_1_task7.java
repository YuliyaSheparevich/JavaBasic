package lesson1_1;
        import java.util.Scanner;

public class lesson1_1_task7 {
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

        if (a > b) {
            System.out.println("Введи C");
            while (!sc.hasNextDouble()) {
                System.out.println("Введи число, а не что-то другое");
                sc.next();
            }
            c = sc.nextDouble();
            System.out.println("c+b = " + (c + b));
        } else {
            if (a == b) {
                System.out.println("Конец");
            } else {
                System.out.println("Введи C");
                while (!sc.hasNextDouble()) {
                    System.out.println("Введи число, а не что-то другое");
                    sc.next();
                }
                c = sc.nextDouble();
                System.out.println("a+c+b = " + (a + c + b));
                System.out.println("Новый год!");
            }
        }

    }

}
