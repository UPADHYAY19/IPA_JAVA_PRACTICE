import java.util.Scanner;

public class LargestWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] w = s.split(" ");
        String res="";
        for(String it : w){
            String temp = it;
            if(temp.length()>res.length()){
                res = temp;
            }

        }
        System.out.println(res);
        sc.close();
    }
    
}
