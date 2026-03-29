import java.util.Scanner;

public class DigitSum {

    static int sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        while(n>9){
            n=sum(n);
        }
        System.out.println(n);
        sc.close();
    }
    
}
