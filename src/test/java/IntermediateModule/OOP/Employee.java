package IntermediateModule.OOP;

public class Employee extends Person{

    //public - codul poate fi accesat de oriunde si de orice clasa
    //private - codul se poate accesa doar din acceasi clasa
    //protected - codul se paote accesa doar din pachetul in care s-a scris codul, dar si  subclase
    //defualt - codul se paote accesa doar din pachetul in care s-a scris codul - intra pe default daca nu se specifica un modificator de acces


    private String company;
    private Integer experience;
    private Integer annualLeaveDays;

    public Employee(String firstName, String lastName, Integer age, String company, Integer experience, Integer annualLeaveDays) {
        super(firstName, lastName, age);
        this.company = company;
        this.experience = experience;
        this.annualLeaveDays = annualLeaveDays;
    }

    public String getCompany() {
        return company;
    }

    public Integer getAnnualLeaveDays() {
        return annualLeaveDays;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public void setAnnualLeaveDays(Integer annualLeaveDays) {
        this.annualLeaveDays = annualLeaveDays;
    }

    public void employeeInfo(){
        personInfo();
        System.out.println("Company is: " + company);
        System.out.println("Experience is: " + experience);
        System.out.println("Has " + annualLeaveDays + " days of annual leave");
    }

    //definim a 2a implementare pentru o metoda (polimorfism dinamic)
   @Override
    public void eat(){
        System.out.println("An employee can eat.");
    }

    //Polimorfisumul static
    public void raise(){
        System.out.println("No budget for raises.");
    }

    public void raise(Integer percentage){
        System.out.println("The employee has received a raise of " + percentage + " percent.");
    }

    public void raise(String grade){
        System.out.println("The employee has received standard raise for " + grade + ".");
    }

    public void promotion(){
        System.out.println();
    }
}
