package IntermediateModule.OOP;

public class Student extends Person{

    private String university;
    private String year;
    private Boolean scholarship;

    public Student(String firstName, String lastName, Integer age, String university, String year, Boolean scholarship) {
        super(firstName, lastName, age);
        this.university = university;
        this.year = year;
        this.scholarship = scholarship;
    }

    public String getUniversity() {
        return university;
    }

    public String getYear() {
        return year;
    }

    public Boolean getScholarship() {
        return scholarship;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setScholarship(Boolean scholarship) {
        this.scholarship = scholarship;
    }

    public void studentInfo(){
        personInfo();
        System.out.println("Univeristy is: " + university);
        System.out.println("Year is: " + year);
        System.out.println("Has scholarship: " + scholarship);
    }

    @Override
    //definim a 3a implementare pentru o metoda (polimorfism dinamic)
    public void eat(){
        System.out.println("A student can eat.");
    }

}
