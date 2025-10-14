package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AlgorithmsTry {
    public static void main(String[] args) {

        // Алгоритми використовуються для вирішення проблем шляхом сортування, пошуку та маніпулювання структурами даних.

        // Пошук
        // Для пошуку елементів у списку Java надає допоміжні методи. Найпоширенішим є Collections.binarySearch(), який здійснює пошук у відсортованому списку :
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Julie");
        names.add("Angie");

        Collections.sort(names);
        int index =  Collections.binarySearch(names, "John");
        System.out.println("John is at index: " + index);

        // Сортування
        // Сортування є одним із найпоширеніших алгоритмів. За допомогою ArrayList можна використовувати Collections.sort() для сортування елементів:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        Collections.sort(numbers);
        System.out.println(numbers);

        // Ви також можете сортувати у зворотному порядку за допомогою Collections.sort(list, Collections.reverseOrder()):
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);

        // Ітерація
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        for(String color : colors){
            System.out.println(color);
        }

        Iterator<String> it = colors.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Інші корисні алгоритми
        /*
        Клас Collections містить багато інших алгоритмів, таких як:

Collections.max()- знайти найбільший елемент
Collections.min()- знайти найменший елемент
Collections.shuffle()- випадкове перемішування елементів
Collections.frequency()- підрахувати, скільки разів з'являється елемент
Collections.swap()- поміняти місцями два елементи у списку
         */

        // У цьому прикладі ми використовуємо Collections.max()та , Collections.min()щоб знайти найбільший та найменший елемент у ArrayList:
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(5);
        numbers2.add(1);
        numbers2.add(7);
        numbers2.add(3);
        numbers2.add(9);

        System.out.println("Max: " + Collections.max(numbers2));
        System.out.println("Min: " + Collections.min(numbers2));

        // Випадковим чином перетасуйте ArrayList
        ArrayList<String> cards = new ArrayList<>();
        cards.add("Ace");
        cards.add("King");
        cards.add("Queen");
        cards.add("Jack");

        Collections.shuffle(cards);
        System.out.println(cards);

        // Collections.frequency() підраховує, скільки разів елемент з'являється у списку:
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");

        int count = Collections.frequency(fruits, "Banana");
        System.out.println("Banana appears: " + count + " times");

        Collections.swap(fruits, 0, 2); // Swap first and third element
        System.out.println(fruits);

        /*
        Алгоритм – це процедура для вирішення проблеми.
        Java надає вбудовані алгоритми в Collections класі.
        До поширених алгоритмів належать пошук, сортування, ітерація та знаходження мінімуму/максимуму.
        Алгоритми працюють разом зі структурами даних (такими як ArrayList, HashSet тощо), щоб зробити ваші програми потужнішими та ефективнішими.
         */
    }
}
