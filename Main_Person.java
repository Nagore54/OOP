package OOP;

import java.util.Scanner;

public class Main_Person {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя = ");
        String name = scanner.nextLine();

        System.out.print("Введите отчество = ");
        String middleName = scanner.nextLine();

        System.out.print("Введите фамилию = ");
        String familyName = scanner.nextLine();

        System.out.print("Введите год рождения = ");
        String yearOfBirth = scanner.nextLine();

        Person person = new Person(name, middleName, familyName, yearOfBirth);

        System.out.println("Объект класса Person был создан = " + person);
    }
}
