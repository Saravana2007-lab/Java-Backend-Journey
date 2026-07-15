package Projects.CourseRegistrationSystem2;

public class Course {
    private String courseId;
    private String courseName;
    private int credits;
    private String faculty;

    public Course(String courseId, String courseName, int credits, String faculty) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.faculty = faculty;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public String getFaculty() {
        return faculty;
    }

    
    public String toString() {
        return "-----------------\n" +
               "Course ID: " + courseId + "\n" +
               "Course Name: " + courseName + "\n" +
               "Credits: " + credits + "\n" +
               "Faculty: " + faculty + "\n";
    }
}
