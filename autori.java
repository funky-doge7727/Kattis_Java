import java.util.Scanner;

public class autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] output = sc.nextLine().split("-");
        for (String i: output) {
            System.out.print(i.charAt(0));
        }
    }
}
