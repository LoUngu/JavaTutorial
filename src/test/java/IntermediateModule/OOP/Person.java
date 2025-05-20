package IntermediateModule.OOP;

public class Person {
    //4 principii: mostenire, incapsulare, polimorfism, asbtractizare
    //Mostenirea = conceptul prin care o clasa(copil) mosteneste o alta clasa (parinte)
    //in Java putem mosteni o singura clasa
    //in momentul in care o clasa mosteneste o alta clasa, clasa copil trebuie sa apeleze constructorul din parinte
    //in momentul in care se aplica mostenirea, copilul are vizibilitate asupra variabilelor/metodelor din parinte
    //constructorul din parinte in copil se apeleaza cu super

    //Incapsularea = proccesul prin care tinem departe anumite informatii ca ele sa nu poata fi modiifcate
    //facem variabilele/metodele din public in private

    //Polimorfism = procesul prin care definim mai multe implementari pentru o metoda
    //poate fi de 2 feluri dinamic (override) si static (overload)
    //polimorfismul dinamic = intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite


    //Polimorfismul static = posibilitatea prin care o metoda are mai mule implementari prin diferentierea numarului sau tipului de parametri

    //Abstractizarea = reducerea unui element compleax la un element mai simplu (reducerea completa a implementarii metodelor, lasand doar numele
    // functiilor, parametrii si tipul returnat

    //Asbtractizarea se poate obtine prin clase abstracte si/sau interfete
    //Clasele abstracte sunt folosite pentru adeclara caracteristici comune ale unor subclase
    //O clasa abstracta nu poate fi instantiata.
    //Ea poate fi utilizata doar ca superclasa pentru alte clase care extind clasa abstracta
    //O clasa abstracta poate sa contina atribute si metode

    //interfata ofera raspuns lipsei mostenirii multiple
    //interfata creaza un protocol comun pe care clasele trebuie sa il implementeze
    //interfata are toate metodele abstracte


    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //definim prima implementare pentru o metoda (polimorfism dinamic)
    public void eat(){
        System.out.println("A person can eat.");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void personInfo(){
        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " + lastName);
        System.out.println("Age is: " + age);
    }
}
