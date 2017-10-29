package lesson1_2;
        import java.util.Scanner;

public class lesson1_2_task3 {
    public static void main(String[] args) {
        int a, ch = 0, tri = 0, mod=0;
        double b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи  количество чисел");
        while (!sc.hasNextInt()) {
            System.out.println("Введи целое число!");
            sc.next();
        }
        a = sc.nextInt();
        System.out.println("Введи " + a + " вещественных чисел/а");
        for (int i = 0; i < a; i++) {

            while (!sc.hasNextDouble()) {
                System.out.println("Введи вещественное число!");
                sc.next();
            }
            b = sc.nextDouble();
            ch=(int)b;

            if (ch % 2 == 0) {
                tri++;
            }
            if (ch>15){
                mod++;
            }

        }
        System.out.println("четных было = " + tri);
        System.out.println("чисел >15 было  = " + mod);

    }
}