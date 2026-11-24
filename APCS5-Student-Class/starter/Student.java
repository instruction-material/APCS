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
        // Improve the grade by one only while the student is in grades 1–12.
    }

    public String getSchoolType() {
        // Return the school type for this grade using the stated boundaries.
        return "School type pending";
    }
}
