package lesson2_2;

import java.util.Scanner;

public class lesson2_2_task5 {

    public static void main(String[] args) {
        String str1;
        String str2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку1 : ");
        str1 = sc.next();

        System.out.print("Введите строку2 : ");
        str2 = sc.next();

        if(str1.equals(str2))
        {
            System.out.println("str1 equal str2 - значения объектов равны");
        }
        else {
            System.out.println("str1 not equal str2 - значения объектов не равны");
        }

        if(str1==str2)
        {
            System.out.println("str1 == str2 - ссылки указывают на один объект");
        }
        else {
            System.out.println("str1 =/= str2  - ссылки указывают на разные объекты");
        }
    }
}