import java.util.*;
public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer>st = new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(arr[i]);
        }
        for(int i=1;i<=n;i++){
            if(!st.contains(i)){
                System.out.print(i+" ");
            }
        }

    }
    
}
