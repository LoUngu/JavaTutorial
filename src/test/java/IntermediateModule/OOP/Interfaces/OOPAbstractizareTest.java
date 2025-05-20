package IntermediateModule.OOP.Interfaces;


import org.testng.annotations.Test;

public class OOPAbstractizareTest {

    @Test
    public void testAbstraction(){

        Circle circle = new Circle();
        circle.setRadius(10);
        circle.calculateArea();
        circle.draw();

        Square square = new Square(5);
        square.calculateArea();
        square.draw();
    }
}
