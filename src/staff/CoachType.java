/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package staff;

import Club.NameGenerator;
import coachingStaff.AssistentCoach;
import coachingStaff.HeadCoach;
import coachingStaff.SwimTeacher;

/**
 * Gets called by the Staff factory to create the CoachStaff with its type and its properties and then create a new CoachStaff object which will be added to the coachStaff ArrayList
 * @author matheusdiniz
 */
public enum CoachType {
    
    /**
     * returns a new object calling the Head Coach and retrieving it to the createCoachingStaff() and get added to the coachStaff ArrayList
     * give its name
     * call the getName() to get the staff's name
     * get the qualification to its coach staff type
     * and create a new object with those properties.
    */
   HEADCOACH{
        @Override
        public CoachStaff getCoachStaff() {
            
            String name = "Head Coach ";
            String staffName = getName();
            int staffQualification = 5;
            return new HeadCoach(name, staffName, staffQualification);
        }
        @Override
            public String toString() {
			
                return "Head Coach";
            }
    },
   
   /**
     * returns a new object calling the Assistent Coach and retrieving it to the createCoachingStaff() and get added to the coachStaff ArrayList
     * give its name
     * call the getName() to get the staff's name
     * get the qualification to its coach staff type
     * and create a new object with those properties.
    */
    ASSITENTCOACH{
        @Override
        public CoachStaff getCoachStaff() {
            
            String name = "Assistent Coach ";
            String staffName = getName();
            return new AssistentCoach(name, staffName);
        }
        @Override
            public String toString() {
			
                return "Assistent Coach";
            }
    },
    
    /**
     * returns a new object calling the Swim Teacher and retrieving it to the createCoachingStaff() and get added to the coachStaff ArrayList
     * give its name
     * call the getName() to get the staff's name
     * get the qualification to its coach staff type
     * and create a new object with those properties.
    */
    SWIMTEACHER {
       @Override
       public CoachStaff getCoachStaff() {
           String name = "Swim Teacher ";
           String staffName = getName();
           return new SwimTeacher(name, staffName);
           
       }
       @Override
            public String toString() {
			
                return "Swim Teacher";
            }
        
    }

    ;

    protected  NameGenerator NG;
    public abstract CoachStaff getCoachStaff();
    
    /**
     * 
     * @return the name of the coach randomly 
     */
    public static String getName() {
		
	NameGenerator NG = new NameGenerator();
	return (NG.getRandomName());
    }
}
