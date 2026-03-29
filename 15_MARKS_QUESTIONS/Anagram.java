import java.util.*;

public class Anagram {

      static boolean check(String s1,String s2){
        if (s1.length() != s2.length()) {
            return false;
        }
        int arr[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {

            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
               return false;
            }
        }
         return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        boolean f = check(s1,s2);

        if(f){
            System.out.println("ANAGRAM");
        }
        else{
            System.out.println("NOT A ANAGRAM");
        }
        sc.close();
    }

}
