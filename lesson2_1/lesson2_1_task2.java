package lesson2_1;


   import java.util.Scanner;

public class lesson2_1_task2 {
    public static void main(String[] args) {
        int x;
        int y;
        int sum, mul;
        x=Vvod();
        y=Vvod();

        sum = x + y;
        mul = x * y;
        System.out.println("sum = " + sum + "; mul = " + mul);
    }


    public static int Vvod (){
        int x;
        Scanner conin = new Scanner(System.in);
        System.out.println("Введите число: ");
        while (!conin.hasNextInt()) {
            conin.next();
        }
        return x= conin.nextInt();
    }

}