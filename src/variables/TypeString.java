package variables;

import javax.sound.midi.Soundbank;

public class TypeString {
    public static void  main (String[] args) {
        String text = "Dowolny napis 1 1.234";
        System.out.println("text = " + text);
        System.out.println("pierwszy znak napisu: " + text.charAt(0));
        System.out.println("ostatni znak napisu: " + text.charAt(text.length() -1));

        System.out.println("y znajduje się na indeksie: " + text.indexOf('y'));
        System.out.println("spacja znajduje się na indeksie: " + text.indexOf(' '));
        System.out.println("napis znajduje się na indeksie: " + text.indexOf("napis"));

        System.out.println("Długość napisu w zmiennej text: " + text.length());

        //jak wydobyć i zapisać w nowej zmiennej słowo napis ze zmiennej text
        String  napis = text.substring(8,13);
        System.out.println(napis);

        String cite = "Być albo nie być!";
        String updatedCite = cite.replaceAll("ć","c");
        System.out.println(updatedCite);

        String name1 = "Ala";
        String name2 = "ala";
        System.out.println(name1.equals(name2)); // porównianie dwóch zmiennych
        System.out.println(name1.length() >= name2.length());

        // typ string jest niezmienny
        String name = "Michał";
        System.out.println("Przed: " + name);
        // name.charAt(name.length() - 1) = 'l'; -> typ string jest niezmienny
        name = name.replace("ł","l");
        System.out.println("Po" + name);
        // name + abc
        name = name + "abc";
        System.out.println("po złączeniu z abc: " + name);

        // Sprawdzenie czy napis jest palidromem
        String txt = "KAJAK";
        System.out.println(txt);
        // utworzyliśmy obiekt klasy StringBuffer --> edytowalny String
        StringBuffer editableTxt = new StringBuffer(txt);
        // odwrócenie kolejności liter w napisie
        editableTxt.reverse();
        // przypisanie odwórconego napisu do zmiennej String --> nieedytowalnej
        String txtReversed = editableTxt.toString();
        System.out.println(editableTxt);

        System.out.println("Czy napis jest palindromem: " + txt.equals(txtReversed));

        //inny sposób
        for(int index = 0; index <= txt.length() -1; index = index + 1) {
            if (txt.charAt(index) != txt.charAt(txt.length() - 1 - index)) {
                System.out.println("nie jest palindromem");
                break;
            }
            System.out.println("index: " + index + " jest równy: " + (txt.length() - 1 - index));
            }



        String login = "MikiKru";

        System.out.println("małe litery: " + login.toLowerCase());
        System.out.println("oryginał: " + login);
        System.out.println(login.equals("mikikru"));
        System.out.println(login.toUpperCase().equals("mikikru".toUpperCase()));




        String sentence = "Być albo nie być oto jest pytanie";
        // podziel zdanie na wyrazy
        // seperator -> spacja
        String [] words = sentence.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);
        System.out.println(words[5]);
        System.out.println(words[6]);
    }
}

