package IntermediateModule.OOP.Interfaces;

public interface GeometricShapes {
    //permite doar constante si nu fielduri care nu sunt initializate;
    public static final String color = "green";

    void calculateArea();
    void draw();
}
