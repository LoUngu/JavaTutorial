package IntermediateModule.OOP.NonAccessModifiers.FinalModifier;
//a final class cannot be extended
public final class FinalExample {

    //a final field cannot be re-assigned
    static final int a = 123;

    //a final method cannot be overridden
    public final void print(){
        System.out.println("Print!");
    }
}
