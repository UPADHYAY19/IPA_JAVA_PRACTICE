import java.util.*;

public class First_Non_Repeated_Substring {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        String ans ="";
        HashSet<Character>st = new HashSet<>();
        for(int i=0;i<n;i++){
            if(!st.contains(s.charAt(i))){
                ans+=s.charAt(i);
                st.add(s.charAt(i));
            }
            else{
                break;
            }
            
        }
        System.out.println(ans);
        sc.close();
    }
}
