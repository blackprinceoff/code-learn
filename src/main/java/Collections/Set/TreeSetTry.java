package Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTry {
    public static void main(String[] args) {
         /*TreeSet — це колекція, яка зберігає унікальні елементи в відсортованому порядку
         На відміну від HashSet, який не має порядку, TreeSet його елементи сортуються автоматично.

         HashSet проти TreeSet
         Використовуйте HashSet, коли вам потрібна швидкість, і TreeSet коли вам потрібні відсортовані елементи.*/

        TreeSet<String> cars = new TreeSet<>();
        // Додати елементи
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Audi");

        System.out.println(cars); // Дублікати, такі як «BMW», з’являться лише один раз.

        // Розмір набору дерев
        System.out.println(cars.size()); // Дублікати значень не враховуються — у розмір враховуються лише унікальні елементи.

        // Перевірити, чи існує елемент
        System.out.println(cars.contains("Audi"));

        // Видалити елемент
        cars.remove("Audi");
        System.out.println(cars);

        // Видалити всі елементи
        cars.clear();
        System.out.println(cars);

        // Перехід через TreeSet
        TreeSet<String> cars2 = new TreeSet<>();
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Toyota");
        cars2.add("Mercedes");
        cars2.add("Audi");

        for(String car : cars2){
            System.out.println(car);
        }

        // Використання TreeSet з числами
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        for(Integer number : numbers){
            System.out.println(number); // Числа будуть виведені у відсортованому порядку (10, 20, 30, 40).
        }

        //Ключове слово var
        // Without var
        TreeSet<String> cars3 = new TreeSet<String>();

        // With var
        var cars4 = new TreeSet<String>();

        Set<String> cars5 = new TreeSet<>();

    }
}
