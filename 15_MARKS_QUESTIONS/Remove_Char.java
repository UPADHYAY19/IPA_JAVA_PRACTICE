import java.util.HashSet;
import java.util.Scanner;

public class Remove_Char {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        int n = s.length();
        String ans ="";
       
        for(int i=0;i<n;i++){
            if(s.charAt(i)==ch){
                continue;
            }
            else{
                ans+=s.charAt(i);
            }
            
            
        }
        System.out.println(ans);
    }
    
}
