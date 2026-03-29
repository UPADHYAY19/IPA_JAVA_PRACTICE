
import java.util.*;

class Course {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    int getcourseId() {
        return courseId;
    }

    void setcourseId(int courseId) {
        this.courseId = courseId;
    }

    String getcourseName() {
        return courseName;
    }

    void setcourseName(String courseName) {
        this.courseName = courseName;
    }

    String getcourseAdmin() {
        return courseAdmin;
    }

    void setcourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    int getquiz() {
        return quiz;
    }

    void setquiz(int quiz) {
        this.quiz = quiz;
    }

    int gethandson() {
        return handson;
    }

    void sethandson(int handson) {
        this.handson = handson;
    }

}

public class CourseProgram {
    // "implement two static methods-
    // findAvgOfQuizByAdmin method:this method will take array
    // of Course objects and a String value as input parameters.
    // This method will find out Average (as int) of Quiz questions
    // for given Course Admin (String parametre passed)
    // This method will return Average if found.if there is no course
    // that matches then the method should return 0."

    static int findAvgOfQuizByAdmin(Course[] arr, String S) {
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getcourseAdmin().equals(S)) {
                sum += arr[i].getquiz();
                cnt++;
            }
        }
        if (cnt == 0) {
            return 0;
        }
        return sum / cnt;
    }

    // "sortCourseByHandsOn method:
    // This method will take an Array of Course Objects and int
    // value as input parameters.
    // This methods should return an Array of Course objects in an
    // ascending order of their handson which are less than the
    // given handson(int parameter passed) value. if there is no
    // such course then the method should return null."

    static Course[] sortCourseByHandsOn(Course[] arr, int h) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].gethandson() < h) {
                cnt++;
            }
        }
        if (cnt == 0)
            return null;

        Course[] res = new Course[cnt];
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].gethandson() < h) {
                res[ind++] = arr[i];
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length - i - 1; j++) {
                if (res[j].gethandson() > res[j + 1].gethandson()) {
                    Course temp = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = temp;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] arr = new Course[4];
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // clear buffer

            String cn = sc.nextLine();
            String ca = sc.nextLine();

            int q = sc.nextInt();
            int h = sc.nextInt();

            arr[i] = new Course(id, cn, ca, q, h);
        }

        // 🔥 VERY IMPORTANT (only once here)
        sc.nextLine();
        String cAdmin = sc.nextLine();
        int avgOfQuiz = findAvgOfQuizByAdmin(arr, cAdmin);

        int h = sc.nextInt();
        Course[] res = sortCourseByHandsOn(arr, h);

        System.out.println("Output.......");
        if (avgOfQuiz == 0) {
            System.out.println("No course found");
        } else {
            System.out.println(avgOfQuiz);
        }
        if (res == null) {
            System.out.println("No Course found with mentioned attribute. ");
        } else {
            for (int i = 0; i < res.length; i++) {
                System.out.println(res[i].getcourseName());
            }
        }

        
        sc.close();

    }
}