import Arithmetic.Arithmetic;
import Map.MyMap;

public class Main {
    public static void main(String[] args) {
        Arithmetic<Integer, Double> arithmetic = new Arithmetic<>(15, 2.2);
        Object result = arithmetic.getMax();
        System.out.println(result.getClass() + "\n" + result);

        MyMap<String, Integer> myMap = new MyMap<>();
        myMap.put("Test", 123);
        myMap.put("Test3", 56);
        myMap.put("Test4", 4);
        System.out.println(myMap);
        System.out.println(myMap.get("Test2"));
        System.out.println(myMap.get("Test"));
        System.out.println(myMap.remove("Test2"));
        myMap.put("Test4", 456);
        System.out.println(myMap);
        System.out.println(myMap.remove("Test"));
        System.out.println(myMap.remove("Test3"));
        System.out.println(myMap);
    }
}