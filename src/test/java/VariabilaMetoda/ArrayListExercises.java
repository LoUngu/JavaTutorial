package VariabilaMetoda;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExercises {

    public static void main(String[] args) {

        ArrayList<String> nume = new ArrayList<>();

        nume.add("Ana");
        nume.add("Bob");
        nume.add("Carl");

        nume.get(1);

        nume.set(0, "David");

        nume.remove("Carl");

        System.out.println(nume.size());

        nume.clear();

        //array
        //Dimensiunea este fixa
        //putem stoca elemente de acelasi tip

        //arrayList
        //Dimensiunea este dinamica
        //putem stoca elemente de acelasi tip

        ArrayList<String> nume1 = new ArrayList<>(Arrays.asList("Eva", "Irina", "Ana"));
    }
}
