import java.util.*;

public class Avrage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int l1 = sc.nextInt();
        int l2 = sc.nextInt();

        int arr[] = new int[5];

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < 5; i++){
            if(arr[i] > l1 && arr[i] < l2){
                sum += arr[i];
                cnt++;
            }
        }

        if(cnt > 0){
            System.out.println("Average = " + (sum/cnt));
        }
        else{
            System.out.println("No numbers between given limits");
        }

        sc.close();
    }
}