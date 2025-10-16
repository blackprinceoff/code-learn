package Advanced.Threads;

public class ThreadsTry extends Thread implements Runnable {
    public static void main(String[] args) {
        /*
        Потоки дозволяють програмі працювати ефективніше, виконуючи кілька речей одночасно.

Потоки можна використовувати для виконання складних завдань у фоновому режимі, не перериваючи основну програму.
         */

        //Запуск потоків
        //Якщо клас розширює Thread клас, потік можна запустити, створивши екземпляр класу та викликавши його start()метод:

        ThreadsTry thread = new ThreadsTry();
        thread.start();
        System.out.println("This code is outside of the thread");

        //Якщо клас реалізує Runnable інтерфейс, потік можна запустити, передавши екземпляр класу Thread конструктору об'єкта, а потім викликавши метод потоку start():

        ThreadsTry obj =  new ThreadsTry();
        Thread thread1 = new Thread(obj);
        thread1.start();
        System.out.println("This code is outside of the thread");

        //Різниця між "розширенням" та "впровадженням" потоків
        //
        //Основна відмінність полягає в тому, що коли клас розширює клас Thread, ви не можете розширити будь-який інший клас, але реалізуючи інтерфейс Runnable, можна розширювати його також з іншого класу, наприклад: class MyClass extends OtherClass implements Runnable.
    }

    public void run() {
        //Створення теми
        /*
        Існує два способи створення нитки.

Його можна створити, розширивши Thread клас та перевизначивши його run() метод:
Інший спосіб створити потік – це реалізація Runnable інтерфейсу:
         */
        System.out.println("This code is running in a thread");
    }

}
