import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть N: ");
        int N = scanner.nextInt();
        for (int i = 1; i < N; i++) {
            int res = N + i;
        }
        // System.out.println("Сума чисел від 1 до " + N + " = " + res);
    }
}
