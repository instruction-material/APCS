public class Main {
    public static void main(String[] args) {
        checkAdvancement(5);
        checkAdvancement(8);
        checkAdvancement(12);
        checkAdvancement(13);
    }

    private static void checkAdvancement(int grade) {
        Student record = new Student("Sample", "Student", grade);
        record.printInfo();
        System.out.println("Before advancement: " + record.getSchoolType());
        record.passGrade();
        System.out.println("After advancement: " + record.getSchoolType());
    }
}
