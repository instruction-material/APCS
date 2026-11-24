public class Student {
    private final String firstName;
    private final String lastName;
    private int grade;

    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println(firstName + " " + lastName + ", grade " + grade);
    }

    public void passGrade() {
        if (grade < 13) {
            grade++;
        }
    }

    public String getSchoolType() {
        if (grade < 6) {
            return "elementary school";
        }
        if (grade < 9) {
            return "middle school";
        }
        if (grade < 13) {
            return "high school";
        }
        return "college";
    }
}
