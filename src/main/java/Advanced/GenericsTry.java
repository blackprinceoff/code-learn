package Advanced;

import java.util.ArrayList;

public class GenericsTry {
    public static void main(String[] args) {
        /*
         Дженерики дозволяють писати класи, інтерфейси та методи, які працюють з різними типами даних, без необхідності заздалегідь вказувати точний тип.
         Це робить ваш код більш гнучким, повторно використовуваним та типобезпечним. 

         Чому варто використовувати генерики?
Повторне використання коду: Напишіть один клас або метод, який працює з різними типами даних.
Безпека типів: перехоплення помилок типів під час компіляції, а не під час виконання.
Чистіший код: Немає потреби в кастингу під час отримання об'єктів.
         */

         //1. Create a Box to hold a String
         Box<String> stringBox = new Box<>();
         stringBox.set("Hello");
         System.out.println("Value: " + stringBox.get());

         // Array of Strings
         String [] names = {"Myroslav", "Natusia"};

         // Array of Integers
         Integer [] numbers = {1, 2, 3};

         //2. Call the generic method with both arrays
        printArray(names);
        printArray(numbers);

        //3. Use with Integer
        Integer[] intNums = {1, 2, 3, 4};
        Stats<Integer> intStats = new Stats<>(intNums);
        System.out.println("Integer average: " + intStats.average());

        // Use with Double
        Double[] doubleNums = {1.3, 1.6, 1.9};
        Stats<Double> doubleStats = new Stats<>(doubleNums);
        System.out.println("Double average: " + doubleStats.average());


        /*
        Загальні колекції
        
        Колекції Java подібні до генеричних типів ArrayListта HashMapвикористовують їх внутрішньо:
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        String fruit = list.get(0); // No need to cast



     }

    // Приклад загального методу
    // Generic method: works with any type T
         public static <T> void printArray(T[] array){
            for (T item : array) {
                System.out.println(item);
            }
            /*
            Пояснення прикладу
<T>є параметром універсального типу — це означає, що метод може працювати з будь-яким типом: String, Integer, Double, тощо.
Метод printArray()приймає масив типу Tта друкує кожен елемент.
Коли ви викликаєте метод, Java визначає, що Tмає бути змінено на основі переданого вами аргументу.
Це корисно, коли ви хочете написати один метод, який працює з кількома типами, замість повторення коду для кожного з них.
             */
        }
}

// Приклад універсального класу
class Box<T> {
    T value; // T is a placeholder for any data type

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

    /*
    T є параметром універсального типу. Він подібний до тимчасового поля для типу даних.

Коли ви створюєте Box<String>, Tстає String.
Коли ви створюєте Box<Integer>, Tстає Integer.
Таким чином, один і той самий клас можна використовувати повторно з різними типами даних без переписування коду.
     */
}

class Stats<T extends Number> {
    T[] nums;

    Stats(T[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }

    /*
     Навіть якщо intв першому випадку використовуються значення, .doubleValue()метод перетворює їх на double, тому результат відображається з десятковою комою.

Пояснення прикладу
<T extends Number>Обмежує Tроботу лише з числовими типами, такими як Integer, Doubleабо Float.
.doubleValue()Перетворює будь-яке число на a doubleдля обчислення.
Працює для будь-якого масиву чисел, якщо елементи є підкласами Number.
     */
}


/*
 Короткий зміст
Дженерики роблять ваш код гнучким та типобезпечним.
Використовуйте √ Tабо іншу літеру для визначення заповнювача типу.
Дженерики можна застосовувати до класів, методів та інтерфейсів.
Використовуйте межі, щоб обмежити дозволені типи.
 */
