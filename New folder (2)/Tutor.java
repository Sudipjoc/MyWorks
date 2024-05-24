public class Tutor extends Teacher {
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    public Tutor(String teacherId, String teacherName, String address, String workingType, String employmentStatus,
                 double workingHours, double salary, String specialization, String academicQualifications, int performanceIndex) {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.setWorkingHours(workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }

    public void setSalaryAndCertify(double newSalary, int newPerformanceIndex) {
        if (newPerformanceIndex > 5 && getWorkingHours() > 20) {
            double appraisalPercentage;
            if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) {
                appraisalPercentage = 5;
            } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) {
                appraisalPercentage = 10;
            } else {
                appraisalPercentage = 20;
            }

            double appraisal = (appraisalPercentage / 100) * salary;
            this.salary = salary + appraisal;
            this.isCertified = true;
        } else {
            System.out.println("Salary cannot be approved. Tutor not eligible.");
        }
    }

    public void removeTutor() {
        if (!isCertified) {
            this.salary = 0;
            this.specialization = "";
            this.academicQualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;
        } else {
            System.out.println("Cannot remove a certified tutor.");
        }
    }

    @Override
    public void display() {
        super.display();
        if (isCertified) {
            System.out.println("Salary: " + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualifications: " + academicQualifications);
            System.out.println("Performance Index: " + performanceIndex);
        }
    }
}
