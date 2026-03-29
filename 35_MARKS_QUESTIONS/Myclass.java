 import java.util.*;
 class RRT {

    private int ticketNo;
    private String raisedBy;
    private String assignedTo;
    private int priority;
    private String project;
    public RRT(int ticketNo, String raisedBy, String assignedTo, int priority, String project){
        this.ticketNo = ticketNo;
        this.raisedBy = raisedBy;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.project = project;
    }

    // Getter and Setter for ticketNo
    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    // Getter and Setter for raisedBy
    public String getRaisedBy() {
        return raisedBy;
    }

    public void setRaisedBy(String raisedBy) {
        this.raisedBy = raisedBy;
    }

    // Getter and Setter for assignedTo
    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    // Getter and Setter for priority
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    // Getter and Setter for project
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
public class Myclass{
    static RRT getHighestPriorityTicket(RRT[]arr,String s){
        RRT ans = null;
        int p = Integer.MAX_VALUE;
        for(RRT it : arr){
            if(it.getProject().equalsIgnoreCase(s) && it.getPriority()<p){
                p=it.getPriority();
                ans=it;

            }
        }
        return ans;
    
    } 
    public static void main(String[] args) {
     Scanner sc  = new Scanner(System.in);
     int n = sc.nextInt();
     RRT[] arr = new RRT[n];
     for(int i=0;i<n;i++){
        int a = sc.nextInt();sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        int d = sc.nextInt();sc.nextLine();
        String e = sc.nextLine();
         arr[i] = new RRT(a,b,c,d,e);

     }
     String p = sc.nextLine();
     RRT res = getHighestPriorityTicket(arr, p);
     System.out.println("printing the output of the program : ");
     if(res!=null){
        System.out.println(res.getTicketNo());
        System.out.println(res.getRaisedBy());
        System.out.println(res.getAssignedTo());
        
     }
     else{
        System.out.println("faaa.....");
     }
     sc.close();
        
    }
}