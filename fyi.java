import java.util.Scanner;

public class fyi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next().substring(0,3).equals("555") ? 1 : 0);
    }
}
