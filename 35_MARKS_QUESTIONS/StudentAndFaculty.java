import java.util.*;

class Person {

    private String firstName;
    private String lastName;
    private int age;
    private char gender;

    Person(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    String getFirstName() { return firstName; }
    void setFirstName(String firstName) { this.firstName = firstName; }

    String getLastName() { return lastName; }
    void setLastName(String lastName) { this.lastName = lastName; }

    int getAge() { return age; }
    void setAge(int age) { this.age = age; }

    char getGender() { return gender; }
    void setGender(char gender) { this.gender = gender; }
}

class Student extends Person {

    private String rollNo;
    private String course;
    private int semester;
    private double GPA;

    Student(String firstName, String lastName, int age, char gender,
            String rollNo, String course, int semester, double GPA) {

        super(firstName, lastName, age, gender);
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
        this.GPA = GPA;
    }

    String getRollNo() { return rollNo; }
    void setRollNo(String rollNo) { this.rollNo = rollNo; }

    String getCourse() { return course; }
    void setCourse(String course) { this.course = course; }

    int getSemester() { return semester; }
    void setSemester(int semester) { this.semester = semester; }

    double getGPA() { return GPA; }
    void setGPA(double GPA) { this.GPA = GPA; }
}

class Faculty extends Person {

    private String employeeId;
    private String department;
    private String designation;
    private double salary;

    Faculty(String firstName, String lastName, int age, char gender,
            String employeeId, String department, String designation, double salary) {

        super(firstName, lastName, age, gender);
        this.employeeId = employeeId;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    String getEmployeeId() { return employeeId; }
    void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    String getDepartment() { return department; }
    void setDepartment(String department) { this.department = department; }

    String getDesignation() { return designation; }
    void setDesignation(String designation) { this.designation = designation; }

    double getSalary() { return salary; }
    void setSalary(double salary) { this.salary = salary; }
}

public class StudentAndFaculty {

    public static Student findHighestGPAStudent(Student[] students) {

        if(students.length == 0) return null;

        Student maxStudent = students[0];

        for(Student s : students){
            if(s.getGPA() > maxStudent.getGPA()){
                maxStudent = s;
            }
        }

        return maxStudent;
    }

    public static Faculty findHighestPaidFaculty(Faculty[] faculty) {

        if(faculty.length == 0) return null;

        Faculty maxFaculty = faculty[0];

        for(Faculty f : faculty){
            if(f.getSalary() > maxFaculty.getSalary()){
                maxFaculty = f;
            }
        }

        return maxFaculty;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[2];

        for(int i=0;i<2;i++){

            String fn = sc.nextLine();
            String ln = sc.nextLine();
            int age = sc.nextInt(); sc.nextLine();
            char g = sc.nextLine().charAt(0);

            String rn = sc.nextLine();
            String course = sc.nextLine();
            int sem = sc.nextInt(); sc.nextLine();
            double gpa = sc.nextDouble(); sc.nextLine();

            students[i] = new Student(fn, ln, age, g, rn, course, sem, gpa);
        }

        Faculty[] faculty = new Faculty[2];

        for(int i=0;i<2;i++){

            String fn = sc.nextLine();
            String ln = sc.nextLine();
            int age = sc.nextInt(); sc.nextLine();
            char g = sc.nextLine().charAt(0);

            String id = sc.nextLine();
            String dept = sc.nextLine();
            String des = sc.nextLine();
            double salary = sc.nextDouble(); sc.nextLine();

            faculty[i] = new Faculty(fn, ln, age, g, id, dept, des, salary);
        }

        Student topStudent = findHighestGPAStudent(students);

        if(topStudent == null){
            System.out.println("Sorry - No student is available");
        }else{
            System.out.println(topStudent.getRollNo());
            System.out.println(topStudent.getCourse());
            System.out.println(topStudent.getGPA());
        }

        Faculty topFaculty = findHighestPaidFaculty(faculty);

        if(topFaculty == null){
            System.out.println("Sorry - No faculty is available");
        }else{
            System.out.println(topFaculty.getEmployeeId());
            System.out.println(topFaculty.getDepartment());
            System.out.println(topFaculty.getSalary());
        }

    }
}