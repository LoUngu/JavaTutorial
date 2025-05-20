package IntermediateModule.OOP.Abstraction;

public class Circle extends GeometricShapes{

    private int radius;

    @Override
    public void calculateArea() {
        System.out.println("Calculate circle area: " + Math.PI * Math.pow(radius, 2));
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
