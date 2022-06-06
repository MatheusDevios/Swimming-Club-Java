/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coachingStaff;

import staff.AdminType;
import staff.CoachStaff;
import staff.CoachType;

/**
 * Method that extend CoachStaff Class and is used to call CoachStaff to create the Staff as Assistent Coach
 * @author matheusdiniz
 */
public class AssistentCoach extends CoachStaff {
    
    public AssistentCoach(String name, String staffName) {
        
        super(name, staffName, CoachType.ASSITENTCOACH);
    }

}
