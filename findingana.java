import java.util.Scanner;

public class findingana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.substring(str.indexOf("a")));
    }
}
