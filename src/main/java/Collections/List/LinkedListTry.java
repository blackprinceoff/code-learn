package Collections.List;

import java.util.LinkedList;

public class LinkedListTry {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        cars.addFirst("Mercedes"); // додає на початок масиву
        System.out.println(cars);

        cars.addLast("Toyota"); //додає вкінець масиву
        System.out.println(cars);

        cars.removeFirst(); // видаляє 1 ел масиву
        System.out.println(cars);

        cars.removeLast(); // видаляє ост ел масиву
        System.out.println(cars);

        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
    }
}
