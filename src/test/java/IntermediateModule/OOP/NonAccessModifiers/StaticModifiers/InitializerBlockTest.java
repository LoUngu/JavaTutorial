package IntermediateModule.OOP.NonAccessModifiers.StaticModifiers;

public class InitializerBlockTest {

    private String name = "Lori";

    {
        System.out.println("Setting fields");
//        name = "Test";
    }

    public InitializerBlockTest(){
        name = "Serena";
        System.out.println("Setting constructor");
    }

    public static void main(String[] args) {
        InitializerBlockTest test = new InitializerBlockTest();
        System.out.println(test.name);
    }




}
