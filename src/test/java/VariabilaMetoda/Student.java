package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //clasa = sablon care defineste proprietatile si comportamentul unei entitati specifice
    //intr-un fisier Java putem avea mai multe clase dieferentiate pe baza numelui
    //intr-o clasa putwm defii proprietatile si actiunile entitatii
    //variabila = proprietatea unei clase
    //variabilele pot fi de 2 feluri: globale si locale
    //variabilele glbale sunt vizibile peste tot in proiect
    //variabilele locale  sunt vizibile doar in locul in care sunt declarate
    //ca sa definim o variabila globala avem nevoie de: modificator de acces (acess control), tip variabila, nume variabila
    //in momentul in care definim o variabila, nu este obligatoriu sa o initializam
    //exista 2 tipuri de metode: void si return

    public String firstName;
    public String lastName;
    public Integer age;
    public String address;
    public Double height;
    public Float weight;
    public Character gender;
    public Boolean hasDiploma;

    public Student(String fname, String lname, Integer age){
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
    }

    @Test
    public void studentPresentation(){
        lastName = "Ungureanu";
        firstName = "Loredana";
        age = 33;
        address = "Traian, 17";
        height = 1.65;
        weight = 58.0f;
        gender = 'F';
        hasDiploma = true;
        System.out.println("Numele studentului este: " + firstName + " " + lastName);
        calculateAvg();
    }

    public void calculateAvg(){
        Integer grade1 = 10;
        Integer grade2 = 9;
        Integer grade3 = 8;
        Integer avg = (grade1 + grade2 + grade3)/3;

        System.out.println("Average grade is: "  + avg);
    }

    public void setFirstName(String fname){
        this.firstName = fname;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getAddress() {
        return address;
    }
}
