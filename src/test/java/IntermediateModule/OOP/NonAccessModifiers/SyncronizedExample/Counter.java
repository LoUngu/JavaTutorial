package IntermediateModule.OOP.NonAccessModifiers.SyncronizedExample;

public class Counter {
     int count;

     //synchronized is used for thread safety
     synchronized void increment(){
         count++;
     }
}
