import java.util.*;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character>st = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(!st.contains(ch)){
                System.out.println(ch);
                st.add(ch);
            }
        }
        sc.close();
    }
    
}
