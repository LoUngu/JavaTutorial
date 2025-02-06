package HashMaps;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class HashMapsHomework {

    public static void main(String[] args) {

        HashMap<String, String> locations = new HashMap<>();
        addElementsToHashMap(locations, "Ana" , "Iasi");
        addElementsToHashMap(locations, "Ion", "Cluj");
        addElementsToHashMap(locations, "Costel", "Timisoara");

        printHashMapElements1(locations);

        HashMap<String, String> prices = new HashMap<>();
        addElementsToHashMap(prices, "apa" , "3 RON");
        addElementsToHashMap(prices, "lapte", "5 RON");
        addElementsToHashMap(prices, "mere", "10 RON");
        printHashMapElements2(prices);

        getValueForGivenKey(prices,"lapte");

        System.out.println(checkIfTheMapContainsGivenKey(locations, "Ana"));

        removeKeyValuePair(locations,"Ana", "Iasi");

        replaceKeyValuePair(prices, "mere", "11 RON");
        printHashMapElements2(prices);

    }

    public static void addElementsToHashMap(HashMap<String, String> yourHashMap, String key, String value){
        yourHashMap.put(key, value);
    }

    public static void  getValueForGivenKey(HashMap<String, String> yourHashMap, String key){
        System.out.println(yourHashMap.get(key));
    }

    public static boolean checkIfTheMapContainsGivenKey(HashMap<String, String> yourHashMap, String key){
        return yourHashMap.containsKey(key);
    }

    public static void removeKeyValuePair(HashMap<String, String> yourHashMap, String key, String value){
        yourHashMap.remove(key, value);
        if(!checkIfTheMapContainsGivenKey(yourHashMap, key)){
            System.out.println("Element removed successfully");
        }
    }

    public static void replaceKeyValuePair(HashMap<String, String> yourHashMap, String key, String value){
        yourHashMap.replace(key, value);
        if (checkIfTheMapContainsGivenKey(yourHashMap, key)){
            System.out.println("Value replaced successfully");
        }
    }

    public static void printHashMapElements1(HashMap<String, String> yourHashMap){
        for(Map.Entry<String, String> entry : yourHashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void printHashMapElements2(HashMap<String, String> yourHashMap){
        yourHashMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
