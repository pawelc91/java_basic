package conditional_instructions;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SimplyInstructions {
    public static void main(String[] args) {
        int age = 7555;
        if(age >= 0 && age <= 120){
            System.out.println("CZŁOWIEK - sprawdzam dalej");
            if(age > 18){
                System.out.println("CZŁOWIEK DOROSŁY");
            } else if(age == 18){
                System.out.println("CZŁOWIEK 18 LAT");
            } else {
                System.out.println("CZŁOWIEK NIEPEŁNOLETNI");
            }
        } else {
            System.out.println("ROBOT");
        }
        // Sprawdź czy liczba podana przez użytkownika jest parzysta jest parzysta
        // jeśli tak wypisz parzysta
        // jeśli nie wypisz nieparzysta
        // jeśli zero wypisz zero

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Wprowadź liczbę");
        int number = scanner.nextInt();

        if (number == 0)
        {
            System.out.println("Zero");
        }
        else if (number % 2 == 0)
        {
            System.out.println("Parzysta");
        }
        else
        {
            System.out.println("Nieparzysta");
        }
    }
}
