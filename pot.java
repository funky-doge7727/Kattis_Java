import java.util.*;

public class pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        int times = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < times; i++) {
            double num = sc.nextDouble();
            sum += (Math.pow((int) num/10, num % 10));
        }
        System.out.println(sum);
    }
}
