
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_of_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character,Integer>mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
         for(Map.Entry<Character,Integer> entry: mp.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        sc.close();
    }
}
