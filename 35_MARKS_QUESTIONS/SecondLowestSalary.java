import java.util.*;

class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private char gender;
    private double salary;

    private static Set<Integer> usedIds = new HashSet<>();

    Employee(int employeeId, String employeeName, int age, char gender, double salary) {

        if (usedIds.contains(employeeId)) {
            throw new IllegalArgumentException("Duplicate Employee ID!");
        }

        usedIds.add(employeeId);

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class SecondLowestSalary {
    static Employee[] getEmployeeWithSecondHeighestSalary(Employee[] arr) {
        double high = Double.MIN_VALUE;
        double second = Double.MIN_VALUE;

        for (Employee e : arr) {
            double sal = e.getSalary();

            if (sal > high) {
                second = high;
                high = sal;
            } else if (sal != high && sal > second) {
                second = sal;
            }
        }
        if (second == Double.MIN_VALUE)
            return null;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() == second) {
                cnt++;
            }
        }
        Employee[] res = new Employee[cnt];
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() == second) {
                res[ind++] = arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // employeeId - int
        // employeeName - String
        // age - int
        // gender - char
        // salary - double
        Employee[] arr = new Employee[n];
        for (int i = 0; i < n; i++) {
            int eid = sc.nextInt();
            sc.nextLine();
            String ename = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            char g = sc.nextLine().charAt(0);
            double s = sc.nextDouble();
            sc.nextLine();
            arr[i] = new Employee(eid, ename, age, g, s);

        }
        Employee[] res = getEmployeeWithSecondHeighestSalary(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i].getEmployeeName());
        }

        sc.close();
    }
}