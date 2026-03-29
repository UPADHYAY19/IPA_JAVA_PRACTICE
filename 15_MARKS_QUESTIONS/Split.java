import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 String [] data = s.split("-");
		 if(data.length!=5){
		     System.out.println("faaa !!!!");
		 }
		 else{
		     int i=0;
            System.out.println("GSI Prefix: "+data[i++]);
            System.out.println("Group Identifier: "+data[i++]);
            System.out.println("Publisher Code: "+data[i++]);
            System.out.println("Item Number: "+data[i++]);
            System.out.println("Check Digit: "+data[i++]);
		 }
		 
		 sc.close();
    }
}
