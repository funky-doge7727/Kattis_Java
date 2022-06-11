import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numstr = sc.nextLine().split(" ");
        for (int i = 1; i < Integer.parseInt(numstr[2]) + 1; i++) {
            System.out.print(i % Integer.parseInt(numstr[0]) == 0 ? "Fizz" : "");
            System.out.print(i % Integer.parseInt(numstr[1]) == 0 ? "Buzz" : "");
            if (i % Integer.parseInt(numstr[0]) > 0 && i % Integer.parseInt(numstr[1]) > 0) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
