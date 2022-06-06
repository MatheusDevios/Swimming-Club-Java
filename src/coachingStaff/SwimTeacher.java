/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coachingStaff;

import staff.CoachStaff;
import staff.CoachType;

/**
 *  Method that extend CoachStaff Class and is used to call CoachStaff to create the Staff as Swim Teacher
 * @author matheusdiniz
 */
public class SwimTeacher extends CoachStaff{

    public SwimTeacher(String name, String staffName) {
        
        super(name, staffName, CoachType.SWIMTEACHER);
    
    }
}
