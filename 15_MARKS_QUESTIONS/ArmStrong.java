import java.util.Scanner;

class ArmStrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         int temp = num;
         int sum=0;
         while(temp>0){
            int d = temp % 10;
            sum+=(d*d*d);
            temp = temp/10;

         }
         if(sum==num) System.out.println("is a Arm number");
         else System.out.println("not a arm number");
        sc.close();
    }
}