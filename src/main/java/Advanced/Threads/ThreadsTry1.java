package Advanced.Threads;

public class ThreadsTry1 extends Thread {
    private static int amount = 0;

    public static void main(String[] args) {
        //Проблеми паралельності
        //Оскільки потоки виконуються одночасно з іншими частинами програми, немає можливості дізнатися, в якому порядку виконуватиметься код. Коли потоки та основна програма читають та записують одні й ті ж змінні, значення непередбачувані. Проблеми, що виникають у результаті цього, називаються проблемами паралельності.
        //Приклад коду, де значення змінної amount є непередбачуваним:
        ThreadsTry1 thread = new ThreadsTry1();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
        // Тут працює так, що невідомо коли потік виконається, тому може бути різний результат, 0 1, 0 2, 1 2


        // Щоб уникнути проблем паралельності, найкраще використовувати якомога менше атрибутів між потоками. Якщо атрибути потрібно використовувати спільно, одним із можливих рішень є використання isAlive() методу потоку для перевірки завершення роботи потоку, перш ніж використовувати будь-які атрибути, які потік може змінити.
        // Використовуйте isAlive() для запобігання проблемам паралельності:
        ThreadsTry1 thread2 = new ThreadsTry1();
        thread2.start();
        // Wait for the thread to finish
        while (thread2.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }

    public void run() {
        amount++;
    }


}
