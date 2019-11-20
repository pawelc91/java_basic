package variables;

// CTRL + ALT + L --> autoformatowanie

import java.util.Scanner;

public class Operators {
    // psvm
    public static void main(String[] args) {
        int i = 5;
        int j = 4;

        System.out.println(i++);
        // po wypisaniu zmienna jest inkrementowana
        System.out.println(i);

        // pre dekrementacja
        System.out.println(--j);
        // po wypisaniu
        System.out.println(j);
        // jaki wynik -> i = 6 j = 3

        System.out.println(((j++)*(--i + j--) + (++i)));
        // 3 * (5 + 4) + (6) = 33

        //Sprawdź czy użytkownik jest pełnoletni
        // --> jeżeli jego wiek jest >= 18 lat to wypisz jesteś pełnoletni
        // --> w przciwnym razie wypisz nie jesteś pełnoletni
/*        //int age = 44;
        String isMature = age >= 18 ? "jestś dorosły" : "nie jesteś dorosły";
        System.out.println("Twój wiek to: " + age + " - " + isMature);
        System.out.printf("Twój wiek to: %d - %s\n", age, isMature);
*/

/*         int age;
        //Utworzenie obiektu Scanner pozwalającego na wprowadzenie wartości do konsoli --> System.in
        Scanner scanner = new Scanner(System.in);
        //Użytkownik wprowadza wartość do zmiennej age typu int metodą nextInt()
        System.out.println("Wprowadź swóje wiek: ");
        age = scanner.nextInt();
        String isMature = age >= 18 ? "jesteś dorosły" : "nie jesteś dorosły";
        //System.out.println("Twój wiek to; " + age + " - " + isMature);
        System.out.printf("Twój wiek to: %d - %s\n", age, isMature);
*/


        //Sprawdź czy użytkownik jest pełnoletni
        // jeżeli wiek zawiera się w przedziale od 0 do 120 to sprawdzam czy jesteś dorosły
        // --> jeżeli jego wiek jest >= 18 lat to wypisz jesteś pełnoletni
        // --> w przeciwnym razie wypisz nie jesteś pełnoletni
        // w przeciwnym razie --> komunikat nie jesteś człowiekiem
/*
        int age;
        //Utworzenie obiektu Scanner pozwalającego na wprowadzenie wartości do konsoli --> System.in
        Scanner scanner = new Scanner(System.in);
        //Użytkownik wprowadza wartość do zmiennej age typu int metodą nextInt()
        System.out.println("Wprowadź swóje wiek: ");
        age = scanner.nextInt();
        // sprawdzenie czy jesteś człowiekiem
        boolean isHuman = age >= 0 && age <= 120 ? true : false;
        // sprawdzenie
        String isMature = age >= 18 ? "jesteś dorosły" : "nie jesteś dorosły";

        System.out.println(isHuman ? isMature : "Robot");


*/







    }
}
