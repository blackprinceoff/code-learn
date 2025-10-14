package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTry {
    public static void main(String[] args) {
        /*
        Iterator — це об'єкт, який можна використовувати для циклічного переходу по колекціях, таких як ArrayList та HashSet.
        Його називають «ітератором», оскільки «ітерація» – це технічний термін для позначення циклу.
        */

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Honda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        //Перебір колекції
        //Щоб перебрати колекцію в циклі, використовуйте методи hasNext()та next()методу Iterator
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Видалення елементів з колекції
        // Ітератори розроблені для легкої зміни колекцій, які вони проходять циклом. remove()Метод може видаляти елементи з колекції під час циклу.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        Iterator<Integer>  it2 = numbers.iterator();
        while(it2.hasNext()){   // Спроба видалити елементи за допомогою циклу for або циклу for-each працюватиме неправильно, оскільки розмір колекції змінюється одночасно з виконанням циклу коду.
            Integer i = it2.next();
            if(i < 10) {
                it2.remove();
            }
        }
        System.out.println(numbers);

        // Without var
        Iterator<String> it3 = cars.iterator();

        // With var
        var i4 = cars.iterator();
    }
}
