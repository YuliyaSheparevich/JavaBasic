package lesson2_2;

import java.time.Month;
import java.util.Scanner;


public class lesson2_2_task3 {
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
        System.out.print(theMonth);

        switch (theMonth) {
            case TRHEE:
            case FOUR:
            case FIVE:
                System.out.println(" - это весенний месяц.");
                break;
            case SIX:
            case SEVEN:
            case EIGHT:
                System.out.println(" - это летний месяц.");
                break;
            case NINE:
            case TEN:
            case ELEVEN:
                System.out.println(" - это осенний месяц.");
                break;
            case ONE:
            case TWO:
            case TWELVE:
                System.out.println(" - это зимний месяц.");
                break;
            default:
                System.out.println("“такого месяца не существует.");


        }

    }

    public enum Month {
        ONE, TWO, TRHEE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE
    }

}