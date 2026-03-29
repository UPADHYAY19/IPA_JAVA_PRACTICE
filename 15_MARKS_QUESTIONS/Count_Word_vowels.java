import java.util.Scanner;

public class Count_Word_vowels {
    static boolean check(char ch) {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] w = s.split(" ");
        int cnt = 0;
        for (String it : w) {
            if (check(it.charAt(0))) {
                cnt++;
            }
        }
        System.out.println(cnt);

        sc.close();
    }
}
