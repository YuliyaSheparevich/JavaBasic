package lesson1_2;

        import java.util.Scanner;
        import static java.lang.Math.sqrt;
        import static java.lang.Math.pow;


public class lesson1_2_task6 {
    public static void main(String[] args) {

        double a, b, c, d, e,f ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи  значение а");
        while (!sc.hasNextDouble()) {
            System.out.println("Введи целое число!");
            sc.next();
        }
        a = sc.nextDouble();

        System.out.println("Введи  значение b");
        while (!sc.hasNextDouble()) {
            System.out.println("Введи целое число!");
            sc.next();
        }
        b = sc.nextDouble();

        System.out.println("Введи  значение c");
        while (!sc.hasNextDouble()) {
            System.out.println("Введи целое число!");
            sc.next();
        }
        c = sc.nextDouble();


        System.out.println("Введи  значение d");
        while (!sc.hasNextDouble()) {
            System.out.println("Введи целое число!");
            sc.next();
        }
        d = sc.nextDouble();

        e= (b+sqrt(pow(b,2)+4*a*c)/2*a)-(pow(a,3)*c+b);
        f= (a/c)*(b/d)-((a*b-c)/c*d);

        System.out.println("выражение 1 = " + e);
        System.out.println("выражение 2  = " + f);

    }
}