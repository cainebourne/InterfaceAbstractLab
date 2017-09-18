/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Cainebourne
 */
/**
         * bad time
         * "In mathematics, a Square is a Rectangle. Indeed it is a specialization of a rectangle. 
         * The "is a" makes you want to model this with inheritance. However if in code you made 
         * Square derive from Rectangle, then a Square should be usable anywhere you expect a Rectangle. 
         * This makes for some strange behavior.

           Imagine you had SetWidth and SetHeight methods on your Rectangle base class; this seems perfectly 
         * logical. However if your Rectangle reference pointed to a Square, then SetWidth and SetHeight 
         * doesn't make sense because setting one would change the other to match it. In this case Square 
         * fails the Liskov Substitution Test with Rectangle and the abstraction of having Square inherit from Rectangle is a bad one."
         * Uncle Bob Podcast
         * good time
         * Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it.
         */
public class StartupProgrammingClassesLab2 {
    
   
     public static void main(String[] args) {
        
        IntroToProgrammingCourse course1 = new IntroToProgrammingCourse("IntroToProgrammingCourse", "5001", 2);
        IntroJavaCourse course2 = new IntroJavaCourse("Intro To Programming", "IntroJavaCourse", "5002", 4); 
        AdvancedJavaCourse course3 = new AdvancedJavaCourse("Intro To Java", "Advanced Java", "5003", 4);
        
        course1.enroll();
        course2.enroll();
        course3.enroll();
     }
}
