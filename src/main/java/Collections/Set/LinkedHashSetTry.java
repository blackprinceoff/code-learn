package Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTry {
    public static void main(String[] args) {
        /*
        LinkedHashSet — це колекція, яка зберігає унікальні елементи та запам'ятовує порядок їх додавання
        Використовуйте, LinkedHashSetякщо вам потрібен набір, який не дозволяє дублікати та зберігає оригінальний порядок вставки.

        HashSet проти LinkedHashSet
        Використовуйте HashSet, коли вам важливі лише унікальність та швидкість. Використовуйте LinkedHashSet, коли важливий порядок.
        */

        // Створення LinkedHashSet
        LinkedHashSet<String> cars = new LinkedHashSet<>();
        // Додати елементи
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Mercedes");

        System.out.println(cars); // Дублікати, такі як «BMW», ігноруються.

        // Розмір LinkedHashSet
        System.out.println(cars.size()); // Дублікати значень не враховуються — у розмір враховуються лише унікальні елементи.

        // Перевірити, чи існує елемент
        System.out.println(cars.contains("BMW"));

        // Видалити елемент
        cars.remove("BMW");
        System.out.println(cars);

        // Видалити всі елементи
        cars.clear();
        System.out.println(cars);

        // Перехід через LinkedHashSet
        LinkedHashSet<String> cars2 = new LinkedHashSet<>();
        cars2.add("BMW");
        cars2.add("Toyota");
        cars2.add("Mercedes");

        for(String car : cars2) {
            System.out.println(car);
        }

        // Ключове слово var
        // Without var
        LinkedHashSet<String> cars3 = new LinkedHashSet<String>();

        // With var
        var cars4 = new LinkedHashSet<String>();

        // Інтерфейс набору
        Set<String> cars5 = new LinkedHashSet<>();
    }
}
