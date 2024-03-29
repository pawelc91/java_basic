package oop;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;
import java.util.Scanner;

// klasa główna - uruchumieniowa
public class Main {
    public static void main(String[] args) {
        // utworzenie obiektu
        User userOne = new User();
        // odwołanie do pola klasowego
        userOne.name = "Michał";
        userOne.lastName = "Kruczkowski";
        userOne.activated = true;
        userOne.salary_net = 10100;
        userOne.gender = 'M';
        // wywołanie metody
        userOne.printUser();

        User userTwo = new User("Adam","Kowalski",'M',false,4000);
        userOne.printUser();

        User userThree = new User("Paweł", "Cieślak", 'M',false,3000);
        userThree.printUser();

        userOne.salary_net = 95000;
        System.out.println("===============================");
        userOne.printUser();
        userTwo.printUser();
        userThree.printUser();
        System.out.println("===============================");

        double salaryGross = userOne.calculateSalaryGross();
        System.out.println("salaryGross = " + salaryGross);
        System.out.println("Calculated calary gross: " + userTwo.calculateSalaryGross());
        System.out.println("===============================");
        System.out.println(userThree.modifyUserParameters(15000,true));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź imię");
        String name = scanner.nextLine();
        System.out.println("Wprowadź nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("Wprowadź płeć");
        char gender = scanner.nextLine().charAt(0);
        System.out.println("Wprowadź pensję");
        double salary_net = scanner.nextDouble();
        User userFour = new User(name, lastName, gender, true,salary_net);
        userFour.printUser();
    }

}
