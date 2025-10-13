package Collections.Map;

import java.util.HashMap;

public class HashMapTry {
    public static void main(String[] args) {
        /*
        HashMap зберігає елементи у парах ключ/значення , де кожен ключ відповідає певному значенню
        Замість доступу до елементів за індексом (як у випадку з ArrayList), ви використовуєте ключ для отримання пов'язаного з ним значення .

        HashMap може зберігати багато різних комбінацій, таких як:

        String ключі та Integer значення
        String ключі та String значення

        */

        // Створіть хеш-карту
        HashMap<String, String> capitalCities = new HashMap<>();
        // Додати елементи
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
        /*
        У наведеному вище прикладі, якщо той самий ключ (наприклад, «Норвегія»)
        додається більше одного разу, останнє значення перезапише попереднє,
        оскільки ключі в a HashMap мають бути унікальними.
        */

        // Розмір хеш-карти
        System.out.println(capitalCities.size());

        //Доступ до елемента
        System.out.println(capitalCities.get("England"));

        // вивід ключі
        for (String i :  capitalCities.keySet()) {
            System.out.println(i);
        }
        // вивід значення
        for (String i :  capitalCities.values()) {
            System.out.println(i);
        }
        // вивід ключі + значення
        for (String i :  capitalCities.keySet()) {
            System.out.println("Key: " + i + " value: " +  capitalCities.get(i));
        }

        // Видалити елемент
        capitalCities.remove("England");
        System.out.println(capitalCities);
        capitalCities.clear();
        System.out.println(capitalCities);

        // Приклад
        // HashMap об'єкт з назвою people, який зберігатиме String ключі та Integer значення
        HashMap<String, Integer> people =  new HashMap<>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }

        // Without var
        HashMap<String, String> capitalCities1 = new HashMap<String, String>();

        // With var
        var capitalCities2 = new HashMap<String, String>();
    }

}
