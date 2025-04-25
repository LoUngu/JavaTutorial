package ObjectConstructor;

public class Airplane {

    public String type;
    public String brand;
    public String model;
    public Integer capacity;
    public String fuelType;
    public Integer luggageNumber;

    public Airplane(String type, String brand, String model, Integer capacity, String fuelType) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.fuelType = fuelType;
    }

    public Airplane(String type, String brand, String model, Integer capacity, String fuelType, Integer luggageNumber) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.luggageNumber = luggageNumber;
    }

    public void airplanePresentation(){
        System.out.println("Airplane type: " + type);
        System.out.println("Airplane brand: " + brand);
        System.out.println("Airplane model: " + model);
        System.out.println("Airplane capacity: " + capacity);
        System.out.println("Airplane fuel type: " + fuelType);
        if(luggageNumber != null){
            System.out.println("Luggage number " + luggageNumber);
        }else {
            System.out.println("No luggage info");
        }
    }
}
