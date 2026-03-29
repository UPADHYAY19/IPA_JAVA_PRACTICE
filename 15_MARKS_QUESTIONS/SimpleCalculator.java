import java.util.Scanner;

class SimpleCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();
        if(op.equals("+")){
            System.out.println(a+b);
        }
        else if(op.equals("-")){
               System.out.println(a-b);
        }
        else if(op.equals("*")){
             System.out.println(a*b);
        }
        else if(op.equals("/")){
               if(b==0){
                 System.out.println("Division by 0 gives INFINITY");
               }
               else{
                System.out.println(a/b);
               }
        }
        else{
            System.out.println("INVALID OPERATOR");
        }
        }
        catch(Exception e){
              System.out.println("give only numeric values pls");
        }
        

        sc.close();
    }
}