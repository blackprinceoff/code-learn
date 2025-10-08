package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayList_HashSet_HashMap {
    public static void main(String[] args) {
        //ArrayList динамічно виділяє память
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Opel");
        cars.add("Toyota");
        System.out.println(cars);

        //HashSet немає дублікатів, непередбачуване сортування
        HashSet<String> cars1 =new HashSet<String>();
        cars1.add("Volvo");
        cars1.add("BMW");
        cars1.add("Ford");
        cars1.add("BMW"); // дублікат, який не покажеться
        System.out.println(cars1);

        //HashMap ключ-значення
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Ukraine", "Kyiv");
        capitalCities.put("France", "Paris");
        System.out.println(capitalCities);

        //iterator для ArrayList
        Iterator<String> iterator = cars.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
