import java.util.Scanner;

public class MAX_PRIME {
    static boolean check(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {

            if (check(mat[i][i])) {
                maxi = Math.max(maxi, mat[i][i]);
            }
            if (check(mat[i][n - 1 - i])) {
                maxi = Math.max(maxi, mat[i][n - 1 - i]);
            }

        }
        System.out.println(maxi);
    }
}
