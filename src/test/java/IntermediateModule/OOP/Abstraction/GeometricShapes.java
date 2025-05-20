package IntermediateModule.OOP.Abstraction;

public abstract class GeometricShapes {
    public String color = "blue";

    public abstract void calculateArea();

    public void draw(){
        System.out.println("Draw shape");
    }
}
