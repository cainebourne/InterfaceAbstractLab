/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Cainebourne
 */
public class StartupProgrammingClasses {
    public static void main(String[] args) {
        
        CourseInfo course1 = new IntroToProgrammingCourse("IntroToProgrammingCourse", "5001", 2);
        CourseInfo course2 = new IntroJavaCourse("Intro To Programming", "IntroJavaCourse", "5002", 4); 
        CourseInfo course3 = new AdvancedJavaCourse("Intro To Java", "Advanced Java", "5003", 4);
        
        
    }
}
