package IntermediateModule.OOP;

import org.testng.annotations.Test;

public class OOPTest {

    @Test
    public void testMethod(){
        Student Cristi = new Student("Popescu", "Cristian", 22, "UBB", "2", true);
        Cristi.studentInfo();
        Cristi.eat();

        Employee Tudor = new Employee("Ionescu", "Tudor", 30, "Endava", 5, 30);
        Tudor.employeeInfo();
        Tudor.promotion();
        Tudor.eat();
        Tudor.raise();
        Tudor.raise(10);
        Tudor.raise("Technician");
    }
}
