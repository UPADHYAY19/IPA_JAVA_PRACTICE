import java.util.Scanner;

public class Frist_Non_Repeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int [] arr = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch  : s.toCharArray()){
            int ind = ch -'a';
            if(arr[ind]==1){
                System.out.println(ch);
                break;
            }
        }

        sc.close();
    }
    
}
