import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        int ele = 0;

        // Step 1: Find candidate
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                ele = arr[i];
                cnt = 1;
            } else if (arr[i] == ele) {
                cnt++;
            } else {
                cnt--;
            }
        }

        // Step 2: Verify
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println(ele);
        } else {
            System.out.println("No majority element");
        }

        sc.close();
    }
}