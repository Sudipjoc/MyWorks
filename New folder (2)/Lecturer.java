public class Lecturer extends Teacher {
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    public Lecturer(String teacherId, String teacherName, String address, String workingType, String employmentStatus,
                    String department, int yearsOfExperience) {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
    }

    public void setGradedScore(int gradedScore) {
        this.gradedScore = gradedScore;
    }

    public void gradeAssignment(int score, String department, int yearsOfExperience) {
        if (!hasGraded && yearsOfExperience >= 5 && this.department.equals(department)) {
            if (score >= 70) {
                gradedScore = score;
            } else if (score >= 60) {
                gradedScore = 60;
            } else if (score >= 50) {
                gradedScore = 50;
            } else if (score >= 40) {
                gradedScore = 40;
            } else {
                gradedScore = 0;
            }
            hasGraded = true;
        } else {
            System.out.println("Assignment not graded yet or not eligible to grade.");
        }
    }

    public boolean hasGraded() {
        return hasGraded;
    }
    public class Main {
        public static void main(String[] args) {
            // Example for Lecturer class
            Lecturer lecturer = new Lecturer("L001", "Jane Smith", "456 Oak St", "Part-time", "Contract",
                    "Computer Science", 7);
            lecturer.gradeAssignment(75, "Computer Science", 7);

            // Display details of Lecturer
            System.out.println("Details of Lecturer:");
            lecturer.display();
            System.out.println("\n---------------------------------\n");

            // Example for Tutor class
            Tutor tutor = new Tutor("T002", "Alice Johnson", "789 Pine St", "Full-time", "Temporary",
                    25, 3000.0, "Mathematics", "MSc in Math", 8);
            tutor.setSalaryAndCertify(3200.0, 8);

            // Display details of Tutor
            System.out.println("Details of Tutor:");
            tutor.display();
        }
    }

}
