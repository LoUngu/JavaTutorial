package IntermediateModule.OOP.Interfaces;

public class Circle implements GeometricShapes{

    private int radius;

    @Override
    public void calculateArea() {
        System.out.println("Calculate circle area: " + Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
