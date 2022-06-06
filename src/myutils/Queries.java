/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myutils;

import Club.SwimmingClub;
import groups.Groups;
import staff.AdminStaff;
import staff.AdminType;
import staff.CoachStaff;
import staff.CoachType;

/**
 *
 * @author matheusdiniz
 */
public class Queries {
    AdminType[] types = AdminType.values();
    SwimmingClub myClub = new SwimmingClub();
    CoachType[] coachTypes = CoachType.values();
    
    /**
     * 
     * @return the list of all groups created
     */
    public String listAllGroups(){

        String list = "";
           
	for( Groups p: myClub.groups) {
			
            list = list.concat(p.toString());
	}
		
       return list;
    }
    
    /**
     * 
     * @return the list of all Admin Staff created
     */
    public String listAdminStaff(){
           
        String list = "";
           
	for( AdminStaff p: myClub.adminStaff) {
			
            list = list.concat(p.toString());
	}
		
       return list;
    }
    
    /**
     * 
     * @return the list of all Coach Staff created
     */
    public String listCoachStaff(){
           
        String list = "";
           
	for( CoachStaff p: myClub.coachStaff) {
	
            list = list.concat(p.toString());
                        
	}
		
        return list;
    } 
    
}
