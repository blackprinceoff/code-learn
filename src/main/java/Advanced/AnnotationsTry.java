package Advanced;

import java.util.ArrayList;

public class AnnotationsTry {

    /*
     Анотації Java
Анотації – це спеціальні примітки, які ви додаєте до свого коду Java. Вони починаються з @символу .

Вони не змінюють те, як працює ваша програма , але надають додаткову інформацію компілятору або інструментам.

Вбудовані анотації
Java містить кілька вбудованих анотацій. Ось деякі з найбільш часто використовуваних:

Annotation	Description
@Override	Indicates that a method overrides a method in a superclass
@Deprecated	Marks a method or class as outdated or discouraged from use
@SuppressWarnings	Tells the compiler to ignore certain warnings
     */


     // Анотація @SuppressWarnings
     //Анотація @SuppressWarnings повідомляє компілятору про необхідність ігнорувати певні попередження, такі як "unchecked" або "deprecation":
     @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();

        oldMethod();

        ArrayList cars = new ArrayList();
        cars.add("Volvo");
        System.out.println(cars);

        /*
        Використання необроблених типів, таких як , ArrayListбез вказівки типу (наприклад ArrayList<String>), зазвичай призводить до попередження "не перевірено".

Анотація @SuppressWarnings("unchecked") повідомляє компілятору про необхідність ігнорувати це попередження. Це корисно під час роботи зі старим кодом або коли ви впевнені, що операція безпечна.

Однак, замість того, щоб приховувати попередження, ви можете виправити це ось так:
         */
        ArrayList<String> cars2 = new ArrayList<>();
    }

    // @Застаріла анотація
    @Deprecated
    static void oldMethod() {
        System.out.println("This method is outdated.");

        /*
         * Навіть якщо метод виконується та виводить повідомлення, більшість IDE або компіляторів відображатимуть таке попередження:

warning: [deprecation] oldMethod() in Main has been deprecated
         */
    }
}

/*
 @Override Анотація
Анотація @Overrideдопомагає компілятору перевірити, чи метод дійсно перевизначає метод із суперкласу.

Це не обов'язково, але дуже рекомендується, оскільки допомагає виявляти помилки.

У цьому прикладі ми чітко вказуємо, що перевизначаємо метод:
 */

 class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }

    /*
     Якщо ви випадково напишете неправильну назву методу (наприклад, makesound()), компілятор покаже помилку типу:
     Main.java:8: error: method does not override or implement a method from a supertype
  @Override
  ^
1 error

    У цьому і полягає сила @Override— вона запобігає мовчазним помилкам.

Якщо ви спробуєте видалити @Overrideрядок у наведеному вище прикладі, компілятор не попередить вас, і метод нічого не перевизначить. Ваша програма може все ще працювати, але вона може поводитися непередбачувано, оскільки призначений метод насправді ніколи не перевизначався.
     */
}