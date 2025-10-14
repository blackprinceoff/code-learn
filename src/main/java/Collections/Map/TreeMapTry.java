package Collections.Map;

import java.util.TreeMap;

public class TreeMapTry {
    public static void main(String[] args) {
        /*
        TreeMap— це колекція, яка зберігає пари ключ/значення у відсортованому порядку за ключем
        Порада: На відміну від HashMap, який не підтримує порядок, TreeMap зберігає свої ключі відсортованими.

        Використовуйте HashMap для підвищення продуктивності та TreeMap коли вам потрібні відсортовані ключі.
         */

        TreeMap<String, String> capitalCities = new TreeMap<>();
        // Додати елементи
        capitalCities.put("England", "London");
        capitalCities.put("France", "Paris");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Italy", "Rome");
        capitalCities.put("Italy", "Rome");
        capitalCities.put("USA", "Washington");


        System.out.println(capitalCities); // Дублікати, такі як «Норвегія», з’являться лише один раз.

        // Розмір TreeMap
        System.out.println(capitalCities.size()); // Розмір враховує лише унікальні ключі. Якщо ключ додається більше одного разу, зберігається лише останнє значення.

        // Доступ до елемента
        System.out.println(capitalCities.get("France"));

        // Перехід через TreeMap
        // keySet() метод , якщо вам потрібні лише ключі
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        // values()якщо вам потрібні лише значення
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        // Print keys and values
        for(String i : capitalCities.keySet()){
            System.out.println("Key: " + i + " Value: " + capitalCities.get(i));
        }

        // Видалити елементи
        capitalCities.remove("France");
        System.out.println(capitalCities);

        capitalCities.clear();

        // Without var
        TreeMap<String, String> capitalCities1 = new TreeMap<String, String>();

        // With var
        var capitalCities2 = new TreeMap<String, String>();
    }
}
