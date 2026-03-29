import java.util.Scanner;

public class Prime {

    static boolean check(int n ){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
        while(n > 0){
            int d = n % 10;
            if(check(d)) cnt++;
            n/=10;
        }
        System.out.println(cnt);
        sc.close();
    }
    
}
