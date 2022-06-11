import java.util.Scanner;

public class triarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] output = sc.nextLine().split(" ");
        double res = 0.5;
        for (String i: output) {
            res *= Integer.parseInt(i);
        }
        System.out.println(res);
    }
}
