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
public class AdminStaff {
    
    private String cargoName;
    public String staffName;
    private int staff_ID;
    private AdminType role; 
    private Random r = new Random();
    private static int currentStaffID = 0;
    
    /**
     * 
     * @param cargoName name of the category job the Staff is
     * @param staffName staff's name
     * @param role the role type
     */
    public AdminStaff(String cargoName, String staffName, AdminType role){
        
        this.cargoName = cargoName;
        this.staffName = staffName;
        this.staff_ID = getStaffID();
        this.role = role;
        
    }
    
    /**
     * Method used to display the Admin Staff created
     * @return returns Name of the staff, the role the staff holds and the staff id which is generated automatically
     */
    @Override 
    public String toString() {
		
	String details;
	details = "\n NAME OF THE STAFF: "+ this.staffName + "\n CARGO: " + this.cargoName + "\n STAFF ID: " + this.staff_ID +"\n";
	return details;
    }

    /**
     * 
     * @return return the staff ID from EmployeeType when it's needed
     */
    public int getStaffID(){
        return EmployeeType.generateID();
//        return this.staff_ID;
    }
    
    /**
     * 
     * @return returns the staff's Role when needed
     */
    public AdminType getRole() {
		
	return this.role;
    }
    
    /**
     * 
     * @return returns the staff's name when needed
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
