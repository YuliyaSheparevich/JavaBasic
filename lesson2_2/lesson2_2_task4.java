package lesson2_2;


import java.util.Scanner;

public class lesson2_2_task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myMonth;
        Month theMonth;
        System.out.print("напишите номер месяца: ");
        myMonth = sc.next();

        System.out.println("1. myDay = " + myMonth);
        myMonth = myMonth.toUpperCase();

        System.out.println("2. myDay = " + myMonth);
        theMonth = Month.valueOf(myMonth);

        if (theMonth == Month.TRHEE || theMonth == Month.FOUR || theMonth == Month.FIVE) {
            System.out.println(" - это весенний месяц.");
        } else {
            if (theMonth == Month.SIX || theMonth == Month.SEVEN || theMonth == Month.EIGHT) {
                System.out.println(" - это летний месяц.");
            } else {
                if (theMonth == Month.NINE || theMonth == Month.TEN || theMonth == Month.ELEVEN) {
                    System.out.println(" - это осенний месяц.");
                } else {
                    if (theMonth == Month.ONE || theMonth == Month.TWO || theMonth == Month.TWELVE) {
                        System.out.println(" - это зимний месяц.");
                    } else {
                        System.out.println("такого мес€ца не существует.");
                    }
                }

            }

        }

    }
    public enum Month {
        ONE, TWO, TRHEE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE
    }

}