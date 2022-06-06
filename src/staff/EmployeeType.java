/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package staff;

/**
 * enum used to list all the staff on the swimming club 
 * @author matheusdiniz
 */
public enum EmployeeType {
    HEADCOACH{
        @Override
        public String toString() {
        
                return "Head Coach";
        }
    },
    ASSITENTCOACH{
        @Override
        public String toString() {
        
                return "Assitent Coach";
        }
    },
    SWIMTEACHER{
        @Override
        public String toString() {
        
                return "Swim Teacher";
        }
    },
    CLEANER{
        @Override
        public String toString() {
        
                return "Cleaner";
        }
    },
    RECEPCIONIST{
        @Override
        public String toString() {
        
                return "Recepcionist";
        }
    }
    ;
    
    
    
//    private int staff_ID;
    private static int currentStaffID = 0;
    
    
    /**
     * 
     * @param roleNum number of the role regarding to the order of the ENUM
     * @return the employeeType depending to the number received from the method
     */
    public static EmployeeType getType(int roleNum){
        
        EmployeeType[] jobs = EmployeeType.values();
        
        return jobs[roleNum];
    }
    
    /**
     * 
     * @return the list of all types of Employee on the Swimming Club
     */
    public static String listAllTypes(){
        
        String list = "";
	EmployeeType[] types = EmployeeType.values();
			
	for( int counter = 0; counter<types.length; counter++) {
			
            list = list.concat((counter + 1) + ": " + types[counter].toString() + "\n");
	}
			
	return list;
                
    }
    
    /**
     *
     * @return create and return the staff's ID which is unique and is incremented automatically
     */
    public static int generateID(){
        
        currentStaffID++;
	return currentStaffID;
    }
    
}
