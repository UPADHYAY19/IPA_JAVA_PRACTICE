import java.util.Scanner;

public class Count_Palindrom {
    static boolean check(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (String temp : words) {
            if (check(temp)) {
                System.out.println(temp);
            }
        }
        sc.close();

    }
}
