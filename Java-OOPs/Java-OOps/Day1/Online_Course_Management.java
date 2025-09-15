public class Online_Course_Management {
    static String instituteName = "BridgeLabz";
    private String courseName;
    private int duration;
    private double fee;

    public Online_Course_Management(String courseName, int duration, double fee) {
        this.courseName = courseName;
    
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
