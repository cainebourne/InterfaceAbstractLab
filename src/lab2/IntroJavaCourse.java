package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
  public class IntroJavaCourse extends IntroToProgrammingCourse implements CourseInfo  {
//    private String courseName;
//    private String courseNumber;
//    double credits;
    private String prerequisites;

    public IntroJavaCourse(String prerequisites, String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCredits(credits); 
        setPrerequisites(prerequisites);
        
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

//    @Override
//    public void enroll() {
//        System.out.println("enrolled in Intro to Java");
//    }    

//    public String getCourseNumber() {
//        return courseNumber;
//    }
//
//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }
//
//    public double getCredits() {
//        return credits;
//    }
//
//    public void setCredits(double credits) {
//        this.credits = credits;
//    }
//
//    public String getPrerequisites() {
//        return prerequisites;
//    }
//
//    public void setPrerequisites(String prerequisites) {
//        this.prerequisites = prerequisites;
//    }
//
//    
}
