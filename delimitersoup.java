import java.util.*;

public class delimitersoup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.nextInt();
        String[] puncs = sc.next().split("");
        Stack<String> st = new Stack<>();
        Map<String, String> puncsMap = new HashMap<>();
        puncsMap.put("}","{");
        puncsMap.put(")","(");
        puncsMap.put("]","[");
        boolean broken = false;
        for (int i = 0; i < puncs.length; i++) {
            if (puncs[i].equals(" ")) continue;
            if (puncsMap.containsKey(puncs[i])) {
                if (st.size() == 0 || !puncsMap.get(puncs[i]).equals(st.pop())) {
                    broken = true;
                    System.out.printf("%s %d", puncs[i], i);
                    break;
                }
            } else {
                st.add(puncs[i]);
            }
        }
        if (broken == false) System.out.println("ok so far");
    }

}
