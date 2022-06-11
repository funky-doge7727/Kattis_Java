import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String s[] = scanner.nextLine().split(" ");
        for (int i = 0; i < s.length; i++) {
            sum += Integer.parseInt(s[i]);
        }
        System.out.println(sum);
    }
}
