import java.util.*;
class Sim {

    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    // Parameterized Constructor
     Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    // Getter and Setter for simId
    public int getSimId() {
        return simId;
    }

    public void setSimId(int simId) {
        this.simId = simId;
    }

    // Getter and Setter for customerName
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter and Setter for ratePerSecond
    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    // Getter and Setter for circle
    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}
public class SimManagement{
    static Sim[]transferCustomerCircle(Sim[]arr,String s1 , String s2){
        int cnt=0;
       
        for(Sim it : arr){
            if(it.getCircle().equalsIgnoreCase(s1)){
                cnt++;
                
            }
        }

        Sim[] res = new Sim[cnt];
        
        int ind=0;
        for(Sim it : arr){
            if(it.getCircle().equalsIgnoreCase(s1)){
                it.setCircle(s2);
                res[ind++]=it;
            }
        }
        Arrays.sort(res,(a,b)->Double.compare(b.getRatePerSecond(),a.getRatePerSecond()));
        return res;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Sim[]arr = new Sim[n];
        for(int i=0;i<n;i++){
           int a = sc.nextInt();
           sc.nextLine();
           String b = sc.nextLine();
           double c = sc.nextDouble();
           sc.nextLine();
           double d = sc.nextDouble();
           sc.nextLine();
           String e = sc.nextLine();
           arr[i]= new Sim(a,b,c,d,e);

        }
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        Sim[] res = transferCustomerCircle(arr, s1, s2);
        System.out.println("printing the output:.....");
        for(Sim it : res){
            System.out.println(it.getSimId());
            System.out.println(it.getCustomerName());
            System.out.println(it.getCircle());
            System.out.println(it.getRatePerSecond());
        }

        sc.close();
    }
}