package lesson1_1;
import java.util.Scanner;
import static java.lang.Math.sqrt;
    public class lesson1_1_task4 {
        public static void main(String[] args) {
            double a,b;
            double gipotenuza;
            Scanner sc = new Scanner(System.in);

            System.out.println("Введи сторону А");
            while (!sc.hasNextDouble()) {
                System.out.println("Введи число, а не что-то другое");
                sc.next();
            }
            a = sc.nextDouble();

            System.out.println("Введи сторону В");
            while (!sc.hasNextDouble()) {
                System.out.println("Введи число, а не что-то другое");
                sc.next();
            }
            b = sc.nextDouble();


            System.out.println("Площадь треугольника = " + (a*b)/2);
            gipotenuza= sqrt(a*a+b*b);
            System.out.println("Гипотенза = " + gipotenuza) ;
        }



}
