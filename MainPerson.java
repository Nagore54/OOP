package org.OOP;

import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя = ");
        String name = scanner.nextLine();

        System.out.print("Введите отчество = ");
        String middleName = scanner.nextLine();

        System.out.print("Введите фамилию = ");
        String familyName = scanner.nextLine();

        System.out.print("Введите Ваш возраст = ");
        Byte age = scanner.nextByte();

        Person person = new Person(name, middleName, familyName);


        System.out.println("Объект класса Person был создан = " + person);
        System.out.println("Год рождения = " + (2023-age) );
    }
    }