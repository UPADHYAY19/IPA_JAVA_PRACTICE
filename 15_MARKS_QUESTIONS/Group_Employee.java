import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Group_Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, ArrayList<String>> mp = new HashMap<>();

        int n = sc.nextInt();
        sc.nextLine(); // ✅ fix

        for(int i = 0; i < n; i++){
            System.out.println("Enter the name:");
            String name = sc.nextLine();

            System.out.println("Enter the city:");
            String city = sc.nextLine();

            if (!mp.containsKey(city)) {
                mp.put(city, new ArrayList<>());
            }

            mp.get(city).add(name);
        }

        // ✅ Correct iteration + printing
        for(Map.Entry<String, ArrayList<String>> entry : mp.entrySet()){
            String city = entry.getKey();
            ArrayList<String> names = entry.getValue();

            System.out.println(city + ": " + String.join(",", names));
        }

        sc.close();
    }
}