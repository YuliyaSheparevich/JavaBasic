package lesson1_2;

        import java.util.Scanner;
        import static java.lang.Math.pow;


public class lesson1_2_task7 {
    public static void main(String[] args) {

        double a, b, c;
        Scanner sc = new Scanner(System.in);



        for (int i=0; i<3; i++){

            System.out.println("Введи  значение #" + (i+1));
            while (!sc.hasNextDouble()) {
                System.out.println("Введи целое число!");
                sc.next();
            }
            a = sc.nextDouble();

            if (a>=0) {
                a=pow(a,3);
                System.out.println("куб =" + a);
            }

            if(a<0){
                a=pow(a,4);
                System.out.println("4яя степень =" + a);

            }

        }
    }
}

