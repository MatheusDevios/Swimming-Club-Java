/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package staff;

import Club.NameGenerator;
import clubStaff.Cleaner;
import clubStaff.Recepcionist;

/**
 * Gets called by the Staff factory to create the AdminStaff with its type and its properties and then create a new AdminStaff object which will be added to the adminStaff ArrayList
 * @author matheusdiniz
 */
public enum AdminType {
    
    /**
     * returns a new object calling the Cleaner and retrieving it to the createAdminStaff() and get added to the adminStaff ArrayList
     * give its name
     * call the getName() to get the staff's name
     * and create a new object with those properties.
    */
    
    CLEANER{
        @Override
        public AdminStaff getAdminStaff() {
            
            String name = "Cleaner ";
            String staffName = getName();
            return new Cleaner(name, staffName);
        }
        @Override
            public String toString() {
			
                return "Cleaner";
            }
        
    },
    
    /**
     * returns a new object calling the Recepcionist and retrieving it to the createAdminStaff() and get added to the adminStaff ArrayList
     * give its name
     * call the getName() to get the staff's name
     * and create a new object with those properties.
    */
    RECEPCIONIST{
        @Override
        public AdminStaff getAdminStaff() {
            
            String name = "Recepcionist ";
            String staffName = getName();
            return new Recepcionist(name, staffName);
        }
        @Override
            public String toString() {
			
                return "Recepcionist";
            }
        
    }

    ;

    protected  NameGenerator NG;
    public abstract AdminStaff getAdminStaff();
    
    /**
     * 
     * @return the name of the admin staff
     */
    public static String getName() {
		
		NameGenerator NG = new NameGenerator();
		return (NG.getRandomName());
	}
    
    /**
     * 
     * @return list all admin types when called
     */
    public static String listAdminTypes() {

        String list = "";
	AdminType[] types = AdminType.values();
			
	for( int counter = 0; counter<types.length; counter++) {
			
            list = list.concat((counter + 1) + ": " + types[counter].toString() + "\n");
	}
			
	return list;
    }
    
}
