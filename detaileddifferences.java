import java.util.*;

public class detaileddifferences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            String aStr = sc.next();
            String bStr = sc.next();
            String[] a = aStr.split("");
            String[] b = bStr.split("");
            System.out.println(aStr);
            System.out.println(bStr);
            for (int j = 0; j < b.length; j++) {
                    System.out.print(a[j].equals(b[j]) ? "." : "*");
            }
            System.out.println();
        }

    }

}
