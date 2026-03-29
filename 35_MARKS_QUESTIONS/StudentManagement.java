import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Student {
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;

    // Constructor
    public Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }

    // Getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getScore() {
        return score;
    }

    public boolean isDayScholar() {
        return dayScholar;
    }

    // Setter methods
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setDayScholar(boolean dayScholar) {
        this.dayScholar = dayScholar;
    }
}
public class StudentManagement {
    static int  findCountOfDayscholarStudents(Student[] arr){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].isDayScholar() && arr[i].getScore() > 80.0){
                cnt++;
            }
        }
        return cnt>0?cnt:0;
    }
    static Student findStudentwithSecondHighestScore(Student[]arr){
        ArrayList<Student> list = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      
        list.add(arr[i]);
    }

    if (list.size() < 2) {
      return null;
    }

      Collections.sort(list,(a,b)->Double.compare(b.getScore(), a.getScore())); // is line me sorting + comparator hai

    return list.get(1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[]arr = new Student[n];
        for(int i=0;i<n;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            Double d = sc.nextDouble();
            sc.nextLine();
            Boolean e = sc.nextBoolean();
            sc.nextLine();
            arr[i] = new Student(a,b,c,d,e);
        }
        int cnt = findCountOfDayscholarStudents(arr);
        System.out.println(cnt);
        Student shs = findStudentwithSecondHighestScore(arr);
        System.out.println(shs.getRollNo());
        System.out.println(shs.getName());
        System.out.println(shs.getScore());

        sc.close();
    }
}
