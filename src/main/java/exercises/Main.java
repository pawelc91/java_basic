package exercises;

import exercises.model.Engine;
import exercises.model.Fuel;
import exercises.model.controller.AutoController;

// Command line  Interface
public class Main {
    public static void main(String[] args) {
        AutoController ac = new AutoController();
        //dodanie 3 aut do zamówienia
        ac.addAuto("vw", "passat", Engine.v2_0, Fuel.diesel, 12000);
        ac.addAuto("vw", "golf", Engine.v1_9, Fuel.diesel, 9000);
        ac.addAuto("vw", "tiguan", Engine.v3_0, Fuel.hybrid, 18000);
        // wypisz listę aut
        ac.printAllAutos();
    }
}
