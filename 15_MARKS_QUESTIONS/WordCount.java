
import java.util.Scanner;

public class WordCount {
    static boolean check(String s) {

        for (int i = 1; i < s.length(); i++) {
            if ((s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u')
                    && (s.charAt(i - 1) == 'a'
                            || s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'i' || s.charAt(i - 1) == 'o' ||
                            s.charAt(i - 1) == 'u'))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }

            StringBuilder w = new StringBuilder();
            while (i < s.length() && s.charAt(i) != ' ') {
                w.append(s.charAt(i));
                i++;
            }
            boolean f = check(w.toString());
            if (f)
                cnt++;

        }

        System.out.println(cnt);

        sc.close();
    }

}
