package IntermediateModule.OOP.Abstraction;

public class Square extends GeometricShapes{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea(){
        System.out.println("Calculate square area." + side  * side);
    }
}
