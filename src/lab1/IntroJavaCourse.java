package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Troy Wadina
 * @version     1.00
 */
public class IntroJavaCourse extends IntroToProgrammingCourse {
//    private String courseName;
//    private String courseNumber;
//    double credits;
    private String prerequisites;

    public IntroJavaCourse(String prerequisites, String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
        setPrerequisites(prerequisites);
        
    }

   

//    public String getCourseName() {
//        return courseName;
//    }
//
//    public final void setCourseName(String courseName) {
//        if(courseName == null || courseName.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: courseName cannot be null of empty string");
//            System.exit(0);
//        }
//        this.courseName = courseName;
//    }
//
//    
//    public String getCourseNumber() {
//        return courseNumber;
//    }
//
//    public final void setCourseNumber(String courseNumber) {
//        if(courseNumber == null || courseNumber.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: courseNumber cannot be null of empty string");
//            System.exit(0);
//        }
//        this.courseNumber = courseNumber;
//    }
//
//    public double getCredits() {
//        return credits;
//    }
//    
//    public final  void setCredits(double credits) {
//        if(credits < 0 || credits > 5.0) {
//            System.out.println(
//                    "Error: credits must be in the range 0.5 to 4.0");
//            System.exit(0);
//        }
//        this.setCredits(credits);
//    }
//    
//
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

        

}
