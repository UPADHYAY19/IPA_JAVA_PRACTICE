import java.util.*;
class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
class Company {
    private String companyName;
    private Employee[] employees;
    private int numEmployees;

    Company(String companyName, Employee[] employees, int numEmployees) {
        this.companyName = companyName;
        this.employees = employees;
        this.numEmployees = numEmployees;
    }

    // Average Salary
    public double getAverageSalary() {
        double sum = 0;
        for (Employee e : employees) {
            sum += e.getSalary();
        }
        return sum / numEmployees;
    }

    // Max Salary
    public double getMaxSalary() {
        double max = Double.MIN_VALUE;
        for (Employee e : employees) {
            if (e.getSalary() > max) {
                max = e.getSalary();
            }
        }
        return max;
    }

    // Filter by designation
    public Employee[] getEmployeesByDesignation(String designation) {
        int count = 0;

        // count
        for (Employee e : employees) {
            if (e.getDesignation().equalsIgnoreCase(designation)) {
                count++;
            }
        }

        if (count == 0) return null;

        Employee[] result = new Employee[count];
        int index = 0;

        // store
        for (Employee e : employees) {
            if (e.getDesignation().equalsIgnoreCase(designation)) {
                result[index++] = e;
            }
        }

        return result;
    }
}


public class EmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String companyName = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();
            String designation = sc.nextLine();

            double salary = sc.nextDouble();
            sc.nextLine();

            employees[i] = new Employee(id, name, designation, salary);
        }

        Company company = new Company(companyName, employees, n);

        // Output
        System.out.println("Average salary: " + company.getAverageSalary());
        System.out.println("Max salary: " + company.getMaxSalary());

        String searchDesignation = sc.nextLine();

        Employee[] result = company.getEmployeesByDesignation(searchDesignation);

        System.out.println("Employees with designation: " + searchDesignation);

        if (result != null) {
            for (Employee e : result) {
                System.out.println(
                    "ID: " + e.getId() +
                    ", Name: " + e.getName() +
                    ", Designation: " + e.getDesignation() +
                    ", Salary: " + e.getSalary()
                );
            }
        }

        sc.close();
    }
}
