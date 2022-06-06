/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coachingStaff;

import staff.CoachStaff;
import staff.CoachType;

/**
 *  Method that extend CoachStaff Class and is used to call CoachStaff to create the Staff as Head Coach
 * @author matheusdiniz
 */
public class HeadCoach extends CoachStaff{

    public HeadCoach(String name, String staffName, int staffQualification) {
        
        super(name, staffName, staffQualification, CoachType.HEADCOACH);
    
    }
    
}
