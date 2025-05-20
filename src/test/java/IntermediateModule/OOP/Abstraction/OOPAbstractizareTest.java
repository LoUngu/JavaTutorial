package IntermediateModule.OOP.Abstraction;

import org.testng.annotations.Test;

public class OOPAbstractizareTest {

    @Test
    public void testAbstraction(){

        Circle circle = new Circle();
        circle.setRadius(10);
        circle.calculateArea();

        Square square = new Square(5);
        square.calculateArea();

    }
}
