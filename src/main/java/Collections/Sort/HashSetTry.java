package Collections.Sort;

import java.util.HashSet;
import java.util.Set;

public class HashSetTry {
    public static void main(String[] args) {
        // HashSet - набір елементів, де кожен елемент унікальний
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Mercedes");
        System.out.println(cars); // BMW виведе 1 раз

        System.out.println(cars.contains("BMW"));

        System.out.println(cars.size()); // Дублікати значень не враховуються — у розмір враховуються лише унікальні елементи

        for(String car : cars){
            System.out.println(car);
        }

        cars.remove("Ford");
        System.out.println(cars);

        cars.clear();
        System.out.println(cars);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for (int i = 1; i <= 10; i++) {
            if(numbers.contains(i)){
                System.out.println(i + " was found in the set");
            } else {
                System.out.println(i + " was not found in the set");
            }
        }

        // без var
        HashSet<String> cars2 = new HashSet<>();

        // з var
        var cars3 = new HashSet<String>();

        // Іноді ви побачите обидва позначення Set, й, HashSet у коді Java
        Set<String> cars4 = new HashSet<>();
    }
}
