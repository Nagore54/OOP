package OOP.java.org.OOP;

import java.time.LocalDate;
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

        System.out.print("Введите возраст = ");
        String age = scanner.nextLine();


        Person person = new Person(name, middleName, familyName, age);

        System.out.println("Объект класса Person был создан = " + person);
    }
}