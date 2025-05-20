package IntermediateModule.ObjectConstructor;

import org.testng.annotations.Test;

public class AirplaneTest {

    @Test
    public void testmethod(){
        Airplane airplane1 = new Airplane("Passengers", "Boeing", "B-127", 260, "Kerosen" );
        airplane1.airplanePresentation();

        Airplane airplane2 = new Airplane("Passengers", "Boeing", "B-180", 360, "Eco" );
        airplane2.airplanePresentation();

        Airplane airplane3 = new Airplane("Passengers", "Boeing", "B-180", 360, "Eco", 100 );
        airplane3.airplanePresentation();
    }
}
