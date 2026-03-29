import java.util.Scanner;

public class Largest_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int [] arr = new int[n];
         for(int i=0;i<n;i++){
            System.out.println("Enter the " + (i+1) + "th element");
            arr[i]=sc.nextInt();
         }
         int maxi = Integer.MIN_VALUE;
         int mini = Integer.MAX_VALUE;
         for(int i=0;i<n;i++){
            maxi = Math.max(maxi,arr[i]);
            mini = Math.min(mini,arr[i]);
         }
         System.out.println(maxi);
         System.out.println(mini);
         

        sc.close();
    }
}
