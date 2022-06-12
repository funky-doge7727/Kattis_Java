import java.util.*;

public class lastfactorialdigit {
    static int factorial(int x) {
        if (x == 1) return 1;
        return x * factorial(x - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) System.out.println(factorial(sc.nextInt()) % 10);
    }
}
