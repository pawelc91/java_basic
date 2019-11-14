package java_introduction;

//  cmd + /             --> komentarz jednowersowy
//  cmd + shift + /     --> komentarz blokowy /* + */
//  psvm                --> public static void main(String [] args) {}
//  sout                --> System.out.println("");
//  ctrl + Shift + r    --> RUN program w macu inne
//  CMD + D             --> duplikowanie lini


import java.util.Arrays;

public class Introduction {
    // metoda uruchomieniowa
    // -> automatycznie wywoływana jako pierwsza w trakcie uruchomiania projektu
    public static void main(String [] args) {
        // polecenie wypisujące wartości podane w argumencie na standardowym wyjściu
        System.out.println("Hello world!");
        // pobranie numeru wersji JRE
        System.out.println(System.getProperty("java.runtime.version"));
        // pobranie numer java
        System.out.println(System.getProperty("java.version"));


        // typy danych
        //byte mySmallNumber = 5555555;  --> błąd zbyt mała precyzja typu byte
        int myFirstNumber = 50;
        System.out.println("myFirstNumber = " + myFirstNumber);
        System.out.println("Dodawanie liczb: " + (100 + myFirstNumber));
        double salaryNet = 9150.99;
        int vatTax = 23;
        System.out.println("Kwota netto: " + salaryNet + "zł");
        System.out.println("Kwota brutto: " + (salaryNet * (1+(vatTax/100.0))) + "zł" );
        // formatowanie wyjścia
        System.out.printf("Kwota brutto: %.2f zł\n", salaryNet * (1+(vatTax/100.0))) ;
        System.out.printf("%.2fzł netto to % .2fzł brutto\n", salaryNet, salaryNet * (1+(vatTax/100.0)));

        System.out.printf("Liczba: %20.2f\n", salaryNet);

        char smallLetter = 'a';
        char bigLetter = 'A';
        char dotChar = '.';

        System.out.println(smallLetter);
        System.out.println((char) (bigLetter + 10)); //char traktuje jako znak w ASCII
        System.out.printf("wypisz ten znak z formatowaniem: %c\n", dotChar);
        System.out.printf("Znak: %c ma %d numer ASCII\n", dotChar, (int)dotChar);

        boolean isActivated = true;
        System.out.println(isActivated);
        System.out.println(!isActivated);




    }

}
