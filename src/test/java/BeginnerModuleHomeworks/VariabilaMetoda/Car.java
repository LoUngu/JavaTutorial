package BeginnerModuleHomeworks.VariabilaMetoda;

import org.testng.annotations.Test;

public class Car {

    public String brand;
    public String model;
    public Integer manufactureYear;

    @Test
    public void testMethod(){
        carInfo("Audi", "Q7", 2024);
        carInfo("BMW", "X3", 2023);
    }

    public void carInfo(String param1, String param2, Integer param3){
        brand = param1;
        model = param2;
        manufactureYear = param3;

        System.out.println("Car brand is: " + brand);
        System.out.println("Car model is: " + model);
        System.out.println("Manufacture year is: " + manufactureYear);

    }
}
