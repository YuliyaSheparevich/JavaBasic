package lesson1_2;

import java.util.Scanner;
import java.math.BigDecimal;
import static java.lang.Math.pow;

public class lesson1_2_task10 {
    public static void main(String[] args) {

        double R ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи  значение x");
        while (!sc.hasNextDouble()) {
            System.out.println("Введи число!");
            sc.next();
        }
        R = sc.nextDouble();


        if (R<=-3){
            System.out.println("F(x) = 9");
        } else {
            if (R>3){

                BigDecimal y = new BigDecimal(1/(pow(R,2)+1));
                System.out.println("F(x) = " + y.doubleValue());
            }else{
                System.out.println("Нет решений");
            }
        }
    }
}
