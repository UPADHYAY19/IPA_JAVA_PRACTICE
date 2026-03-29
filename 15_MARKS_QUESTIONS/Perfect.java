import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("no");
            return;
        }

        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {   // optimized loop
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n)
            System.out.println("yes");
        else
            System.out.println("no");

        sc.close();
    }
}