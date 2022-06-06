/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package groups;


/**
 * Enum created to retrieve the respective day od the week needed for each Groups
 * @author matheusdiniz
 */
public enum Weekdays {
    
    MONDAY{
        @Override
        public String toString() {
            return "Monday";
        }
        
    },
    TUESDAY{
        @Override
        public String toString() {
            return "Tuesday";
        }
        
    },
    WEDNESDAY{
        @Override
        public String toString() {
            return "Wednesday";
        }
        
    },
    THURSDAY{
        @Override
        public String toString() {
            return "Thursday";
        }
        
    },
    FRIDAY{
        @Override
        public String toString() {
            return "Friday";
        }
        
    },
    SATURDAY{
        @Override
        public String toString() {
            return "Saturday";
        }
        
    },
    SUNDAY{
        @Override
        public String toString() {
            return "Sunday";
        }
        
    }
    ;
    
    public abstract String toString();
    
    /**
     * 
     * @return list all the weekdays to the user
     */
    public static String listWeekdays() {

        String list = "";
	Weekdays[] types = Weekdays.values();
			
	for( int counter = 0; counter<types.length; counter++) {
			
            list = list.concat((counter + 1) + ": " + types[counter].toString() + "\n");
	}
			
	return list;
    }
}
