public class Teacher {
    private String teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private double workingHours;

    public Teacher(String teacherId, String teacherName, String address, String workingType, String employmentStatus) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getAddress() {
        return address;
    }

    public String getWorkingType() {
        return workingType;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void display() {
        System.out.println("Teacher Id: " + teacherId);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Address: " + address);
        System.out.println("Working Type: " + workingType);
        System.out.println("Employment Status: " + employmentStatus);

        if (workingHours > 0) {
            System.out.println("Working Hours: " + workingHours);
        } else {
            System.out.println("Working Hours not assigned.");
        }
    }

    public static void main(String[] args) {
        // Example for Lecturer class
        Lecturer lecturer = new Lecturer("L001", "Jane Smith", "456 Oak St", "Part-time", "Contract",
                "Computer Science", 7);

        // Display details of Lecturer
        System.out.println("Details of Lecturer:");
        lecturer.display();
        System.out.println("\n---------------------------------\n");

        // Example for Tutor class
        Tutor tutor = new Tutor("T002", "Alice Johnson", "789 Pine St", "Full-time", "Temporary",
                25, 3000.0, "Mathematics", "MSc in Math", 8);

        // Display details of Tutor
        System.out.println("Details of Tutor:");
        tutor.display();
        System.out.println("\n---------------------------------\n");
    }

}
