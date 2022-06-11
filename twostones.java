import java.util.Scanner;

public class twostones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numstr = sc.next();
        System.out.println(Integer.parseInt(numstr) % 2 == 1 ? "Alice" : "Bob");
    }
}
