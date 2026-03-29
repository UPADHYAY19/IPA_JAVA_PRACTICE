import java.util.Scanner;

public class Count_Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                cnt++;
            }
        }
        System.out.println(cnt);

        sc.close();
    }
    
}
