import java.util.Scanner;

public class Consonent_Odd {
    static boolean check(char ch){
        if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u'&& 
        ch!='A'&& ch!='E'&& ch!='I'&& ch!='O'&& ch!='U'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(i%2!=0 && check(s.charAt(i)) ){
                System.out.print(s.charAt(i));
            }
        }
        sc.close();
    }
    
}
