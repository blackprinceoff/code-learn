package Collections.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapTry {
    public static void main(String[] args) {
        /*
        LinkedHashMap зберігає ключі та значення в тому ж порядку, в якому ви їх розмістили.
        Використовуйте LinkedHashMap, коли потрібен передбачуваний порядок ітерацій (порядок вставки).

        Використовуйте, LinkedHashMap якщо потрібно, щоб карта запам’ятала порядок додавання записів.
         */

        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<String, String>();
        // Додати елементи
        capitalCities.put("England", "London");
        capitalCities.put("France", "Paris");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Italy", "Rome");
        capitalCities.put("Italy", "Rome");
        capitalCities.put("USA", "Washington");

        System.out.println(capitalCities); // Дублікати, такі як «Норвегія», ігноруються.

        // Розмір LinkedHashMap
        System.out.println(capitalCities.size());

        // Перехід через LinkedHashMap
        // keySet()отримати всі ключі
        for (String i :  capitalCities.keySet()) {
            System.out.println(i);
        }
        // values()отримати всі значення
        for (String i :  capitalCities.values()) {
            System.out.println(i);
        }
        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("Key: " + i + " Value: " + capitalCities.get(i));
        }
        // Доступ до елемента
        System.out.println(capitalCities.get("France"));

        // Видалити елемент
        capitalCities.remove("France");
        System.out.println(capitalCities);
        capitalCities.clear();

        // Without var
        LinkedHashMap<String, String> capitalCities1 = new LinkedHashMap<String, String>();

        // With var
        var capitalCities2 = new LinkedHashMap<String, String>();
    }
}
