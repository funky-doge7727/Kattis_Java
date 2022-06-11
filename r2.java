import java.util.Scanner;

public class r2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] output = sc.nextLine().split(" ");
        System.out.println(Integer.parseInt(output[1]) * 2 - Integer.parseInt(output[0]));
    }
}
