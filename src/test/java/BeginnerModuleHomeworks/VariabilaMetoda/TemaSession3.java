package BeginnerModuleHomeworks.VariabilaMetoda;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TemaSession3 {

    //Loop through numbers 1 to 20. If the number is even skip it. Stop if the number is grater than 15
    @Test
    public void tryContinueBreak(){

        for(int i = 1; i <= 20; i++){
            if(i % 2 == 0)
                continue;
            if(i > 15)
                break;
            System.out.println(i);
        }

    }

    @Test
    public void tryArrays(){
        int[] numbers = {1, 2, 3, 4, 5};
        char[] characters = {'a', 'b', 'c', 'd'};
        String[] pets = {"dog", "cat", "fish"};

        for(int number : numbers){
            System.out.print(number + " ");
        }

        System.out.println();
        for(char c : characters){
            System.out.print(c + " ");
        }

        System.out.println();
        for(int i = 0; i < pets.length; i++){
            System.out.print(pets[i] + " ");
        }
    }

    @Test
    public void tryArrayLists(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd'));
        ArrayList<String> pets = new ArrayList<>(Arrays.asList("dog", "cat", "fish"));

        numbers.forEach(System.out::println);
        characters.forEach(System.out::println);
        pets.forEach(System.out::println);
    }
}
