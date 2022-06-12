import java.util.*;

public class countthevowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String word = sc.next();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int numVowels = 0;
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(Character.toLowerCase(word.charAt(i)))) {
                numVowels += 1;
            }
        }
        System.out.print(numVowels);
    }
}
