package Projects.CourseRegistrationSystem.model;

public class Course {
    private String courseId;
    private String courseName;
    private int credits;

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayCourse() {
        System.out.println("CourseId    " + courseId);
        System.out.println("CourseName     " + courseName);
        System.out.println("Credits     " + credits);
    }
}
