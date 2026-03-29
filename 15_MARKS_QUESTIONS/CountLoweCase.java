import java.util.Scanner;

public class CountLoweCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                cnt++;
                System.out.println((char)(ch-'a' + 'A'));
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
