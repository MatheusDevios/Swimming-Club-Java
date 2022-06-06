/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff;

import groups.GroupType;
import java.util.ArrayList;
import java.util.Random;

/**
 * Method that gets called when the createAdminStaff() or createCoachingStaff() is called on the main class, responsible to call the AdminType and CoachType enum and get the correct type of staff with its properties
 * @author matheusdiniz
 */
public class StaffFactory {

    /**
     * 
     * @return a specific adminStaff type and call it on the enum AdminType to get the properties for it.
     */
    public AdminStaff getAdminStaff() {
        
        Random r = new Random();
        AdminType[] types = AdminType.values();
		
        int number = r.nextInt(types.length);
        
        return types[number].getAdminStaff();
    }

    /**
     * 
     * @return a specific coachStaf type and call it on the enum CoachType to get the properties for it.
     */
    public CoachStaff getCoachStaff() {
       
        Random r = new Random();
        CoachType[] types = CoachType.values();
		
        int number = r.nextInt(1, 3);
        
        return types[number].getCoachStaff();
    
    }
    
}
