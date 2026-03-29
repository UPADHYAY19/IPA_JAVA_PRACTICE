import java.util.Scanner;

public class CHN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ind = s.indexOf("CHN");
        if (ind != -1) {
            for (int j = s.length() - 1; j > ind + 2; j--) {
                System.out.print(s.charAt(j));
            }

        } else {
            System.out.println("No match found");
        }

        sc.close();
    }

}
