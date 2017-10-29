package lesson1_2;
import java.util.Scanner;
import java.math.BigDecimal;
import static java.lang.Math.pow;
import static java.lang.Math.PI;


public class lesson1_2_task9 {
    public static void main(String[] args) {

        double R ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи  значение радиуса");
        while (!sc.hasNextDouble()) {
            System.out.println("Введи число!");
            sc.next();
        }
        R = sc.nextDouble();

        BigDecimal y = new BigDecimal(2*PI*R);
        System.out.println("длина окружности " + y.doubleValue());


        BigDecimal x = new BigDecimal(PI*pow(R,2));
        System.out.println("площадь круга " + x.doubleValue());



    }
}