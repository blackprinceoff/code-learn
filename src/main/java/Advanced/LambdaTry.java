package Advanced;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaTry {
    public static void main(String[] args) {
        /*
        Лямбда-вирази були додані в Java 8.

Лямбда -вираз — це короткий блок коду, який приймає параметри та повертає значення. Лямбда-вирази схожі на методи, але їм не потрібне ім'я, і ​​їх можна записати безпосередньо всередині тіла методу.

Синтаксис
Найпростіший лямбда-вираз містить один параметр та вираз:

parameter -> expression
Щоб використовувати більше одного параметра, візьміть їх у дужки:

(parameter1, parameter2) -> expression
Прості вирази повинні повертати значення негайно. Вони не можуть містити кілька операторів, таких як цикли або ifумови. Для виконання складнішої роботи використовуйте блок коду з фігурними дужками. Якщо лямбда-вираз має повертати значення, використовуйте returnключове слово:

(parameter1, parameter2) -> {
  // code block
  return result;
}
         */

        //1. Використання лямбда-виразів
        // Лямбда-вирази часто передаються як аргументи методам. Наприклад, ви можете використовувати лямбда-вираз у forEach()методі об'єкта ArrayList:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        numbers.forEach((n) -> {System.out.println(n);});



        //2. Лямбда-вирази у змінних
        /*
        Лямбда-вираз можна зберігати у змінній. Тип змінної має бути інтерфейсом лише з одним методом ( функціональний інтерфейс ). Лямбда має відповідати параметрам цього методу та типу повернення.

Java містить багато вбудованих функціональних інтерфейсів, таких як Consumer(з java.util пакета), що використовується зі списками.
         */

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(5);
        numbers2.add(9);
        numbers2.add(8);
        numbers2.add(1);

        Consumer<Integer> method = (n) -> {System.out.println(n);};
        numbers2.forEach(method);

        //3. Лямбда-вирази як параметри методу
        // Ви також можете передати лямбда-вираз методу. Параметр методу має бути функціональним інтерфейсом. Виклик методу інтерфейсу призведе до виконання лямбда-виразу:
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello ", exclaim);
        printFormatted("Hello ", ask);

        //4. Анонімний клас проти лямбда-виразу
        // У Java 8+ часто можна замінити анонімний клас лямбда-виразом, але лише якщо інтерфейс є функціональним інтерфейсом (один абстрактний метод).
        //Приклад: Те саме завдання, два способи (інтерфейс з одним методом):
        // Анонімний клас
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from anonymous class");
            }
        };
        g.sayHello();

        // Лямбда-вираз
        Greeting g2 = () -> System.out.println("Hello from lambda");
        g2.sayHello();

        // Емпіричне правило: використовуйте a lambda для коротких інтерфейсів з одним методом. Використовуйте анонімний клас, коли вам потрібно перевизначити кілька методів, додати поля або розширити клас.
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}

interface Greeting {
    void sayHello();
}

interface StringFunction {
    String run(String str);
}


