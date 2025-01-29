package VariabilaMetoda;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] note = {1,2,3,4,5};
        String[] nume = {"Ana", "Mihai"};

        System.out.println(note.length);
        Arrays.sort(nume, Collections.reverseOrder());
        System.out.println(Arrays.toString(nume));

        String[] nume2 = {"Mihai", "Ana"};
        System.out.println("Sunt array-urile egale? " + Arrays.equals(nume, nume2));

        nume[0] = "Andrada";
        System.out.println(Arrays.toString(nume));
    }
}
