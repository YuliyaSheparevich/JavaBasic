package lesson2_2;

import java.util.Scanner;

public class lesson2_2_task2 {
    public static void main(String[] args) {
        String month;
        int year;
        int numDays = 0;
        month = Month();
        year = Year();

        switch (month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                numDays = 31;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                numDays = 30;
                break;
            case "February":
                numDays = Visokosn(year);


                break;
            default:
                System.out.println("несуществующий месяц");
                break;
        }
        System.out.println("число дней = " + numDays);
    }

    public static String Month() {
        String month;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите месяц: ");
        month = sc.next();

        return month;
    }

    public static int Year() {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        while (!sc.hasNextInt()) {
            System.out.println("Введи год, а не что-то другое");
            sc.next();
        }
        year = sc.nextInt();
        return year;
    }

    public static int Visokosn(Integer year) {
        int numDays = 0;

        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
            numDays = 29;
        } else {
            numDays = 28;
        }
        return numDays;
    }
}
