import java.util.Scanner;

public class Sum_of_Words {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
         int n= s.length();
         int sum=0;
         String temp="";
         for(int i=0;i<n;i++){
           char ch = s.charAt(i);
           if(ch>='0' && ch<='9'){
             temp+=ch;
           }
           else{
            if(!temp.equals("")){
                sum+=Integer.parseInt(temp);
            temp="";
            }
           }
         }
         if(temp.length()>0){
            sum+=Integer.parseInt(temp);
         }
		 System.out.println(sum);
		 sc.close();
    }
}
