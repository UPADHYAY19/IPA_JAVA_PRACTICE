import java.util.Scanner;

public class Count_sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int sum=0,cnt=0;
        for(int i=r1;i<=r2;i++){
            if((i % 2==0) && (i%3==0)){
                sum+=i;
                cnt++;
            }
        }
        System.out.println(sum);
        System.out.println(cnt);
        sc.close();
    }
    
}
