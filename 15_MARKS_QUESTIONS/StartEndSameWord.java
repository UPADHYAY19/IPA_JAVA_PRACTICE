import java.util.Scanner;

public class StartEndSameWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s=s.toLowerCase();
        String[] w = s.split(" ");

        int cnt = 0;

        for (String it : w) {
            String temp = it;
            if(temp.charAt(0)==temp.charAt(temp.length()-1)){
                cnt++;
            }
            
        }

        System.out.println(cnt);

        sc.close();
    }
}