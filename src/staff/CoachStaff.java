/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staff;

import java.util.Random;

/**
 *
 * @author matheusdiniz
 */
public class CoachStaff {
    
    public String cargoName;
    public String staffName;
    private int staff_ID;
    private CoachType role; 
    private int staffQualification;
    private Random r = new Random();
    private static int currentStaffID = 0;

    /**
     * 
     * @param cargoName
     * @param staffName
     * @param role 
     */
    public CoachStaff(String cargoName, String staffName, CoachType role){
        
        
        this.cargoName = cargoName;
        this.staffName = staffName;
        this.staff_ID = getStaffID();
        this.role = role;
        this.staffQualification = staffQualification();  
    }
    
    /**
     * 
     * @param cargoName name of the category job the Staff is
     * @param staffName staff's name
     * @param staffQualification professional qualification of each coach staff
     * @param role the role type
     */
    public CoachStaff(String cargoName, String staffName, int staffQualification, CoachType role){
        
        this.cargoName = cargoName;
        this.staffName = staffName;
        this.staff_ID = getStaffID();
        this.role = role;
        this.staffQualification = staffQualification;  
    }

    /**
     * Method used to display the coach Staff created
     * @return returns Name of the staff, the role the staff holds and the staff qualification level which is generated automatically(on the Head Coach is predefined as 5) and the staff ID 
     */
    @Override 
    public String toString() {
		
	String details;
	details = "\n NAME OF THE STAFF: " + this.staffName +"\n CARGO: "+ this.cargoName + "\n STAFF QUALIFICATION LEVEL: " + this.staffQualification + "\n STAFF ID: " + this.staff_ID +"\n";
	return details;
    }
    
    /**
     * 
     * @return the staff qualification between 1 and 4
     */    
    private int staffQualification(){
        int number = r.nextInt(1, 5);
        return number;
    }
    
    /**
     * 
     * @return return the staff ID from EmployeeType when it's needed
     */
    public int getStaffID(){
        return EmployeeType.generateID();
    }
    
    /**
     * 
     * @return the type of the role the staff holds
     */
    public CoachType getRole() {
		
	return this.role;
    }
    
    /**
     * 
     * @return the staff's name
     */
    public String getStaffName(){
        return this.staffName;
    }
    
    /**
     * 
     * @return the role's name as string
     */
    public String getCargoName() {
		
	return this.cargoName;
    }
    
}
