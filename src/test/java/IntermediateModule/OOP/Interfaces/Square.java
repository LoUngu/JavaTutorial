package IntermediateModule.OOP.Interfaces;

public class Square implements GeometricShapes{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea(){
        System.out.println("Calculate square area." + side  * side);
    }

    @Override
    public void draw() {
        System.out.println("Draw square");
    }
}
