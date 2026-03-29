import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int f = map.get(ch);
                ans += ch;
                ans += String.valueOf(f);
                map.remove(ch);
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
