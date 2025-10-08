package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTry {
    public static void main(String[] args) {
        // ArrayList String
        ArrayList<String> cars = new ArrayList<>(); // записує в масив значення
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Ford");

        cars.add(0, "Mazda");
        System.out.println(cars + "\n" + cars.get(1) );// виводить 2 значення

        System.out.println(cars.size());// виводить число усіх значень

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i)); // виводить усі значення але без масиву
        }
        System.out.println("\n");


        Collections.sort(cars); // alphabetical or numerical sorting
        for (String i : cars){
            System.out.println(i); // вивід посортованих значень
        }
        System.out.println("\n");

        Collections.sort(cars, Collections.reverseOrder()); // зворотнє сортування
        for (String i : cars){
            System.out.println(i);
        }
        System.out.println("\n");

        System.out.println(cars.remove(2)); // виводить значення яке видаляє (Ford)

        cars.clear(); // видаляє все з масиву
        System.out.println(cars);

        //ArrayList Integer
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);
        for (int i : myNumbers){
            System.out.println(i);
        }

        List<String> cars1 = new ArrayList<>();
        cars1.add("BMW");
        cars1.add("Volvo");
        cars1.add("Ford");
        cars1.add("Mazda");

        Collections.sort(cars1, Collections.reverseOrder());

        for (String i : cars1){
            System.out.println(i);
        }

        ArrayList<Integer> myNumbers2 = new ArrayList<>();
        myNumbers2.add(33);
        myNumbers2.add(15);
        myNumbers2.add(20);
        myNumbers2.add(34);
        myNumbers2.add(8);
        myNumbers2.add(12);

        Collections.sort(myNumbers2, Collections.reverseOrder());

        for (int i : myNumbers2){
            System.out.println(i);
        }
    }

}
