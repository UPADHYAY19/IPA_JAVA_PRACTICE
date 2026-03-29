import java.util.HashSet;
import java.util.Scanner;

public class Count_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] w = s.split("\\s+");

        HashSet<String>st = new HashSet<>();
        for(int i=0;i<w.length;i++){
           st.add(w[i]);
        }
        System.out.println(st.size());
        sc.close();
    }
}
