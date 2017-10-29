package lesson1_2;

       import java.util.Scanner;
        import static java.lang.Math.log;
        import static java.lang.Math.abs;

public class lesson1_2_task2 {
    public static void main(String[] args) {
        int a, b, ch = 0, tri = 0, mod=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введи  количество чисел");
        while (!sc.hasNextInt()) {
            System.out.println("Введи целое число, а не что-то другое");
            sc.next();
        }
        a = sc.nextInt();
        System.out.println("Введи " + a + " чисел/а");
        for (int i = 0; i < a; i++) {

            while (!sc.hasNextInt()) {
                System.out.println("Введи целое число!");
                sc.next();
            }
            b = sc.nextInt();
            if (b % 2 == 0) {
                ch++;
            }
            if (b % 3 == 0){
                tri=tri+b;
            }

            if (abs(b)<3){
                mod++;
            }
        }
        System.out.println("четных было = " + ch);
        System.out.println("сумма кратных 3м  = " + tri);
        System.out.println("кол, модуль которых <3  = " + mod);
    }
}
