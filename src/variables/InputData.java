package variables;

import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        // utworzenie obiektu Scanner
        Scanner scanner = new Scanner(System.in);
        // wprowadzam liczbę
        System.out.println("Wprowadź liczbę zmiennoprzecinkową: ");
        double number = scanner.nextDouble(); // Wprowadzasz int i Enter -> \n
        // aby skonsumować ENTER wykonujemy metodę nextLine
        String enter = scanner.nextLine();
        //wprowadzam napis
        System.out.println("Wprowadź napis: ");
        String text = scanner.nextLine();
        System.out.printf("Wprowadziłeś: %f i %s\n", number, text);
        System.out.printf("Skonsumowano: /n", enter);
        //zamknięcie połaczenia
        scanner.close();
    }
}
