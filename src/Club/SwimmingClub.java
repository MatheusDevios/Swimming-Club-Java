/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Club;

import groups.GroupFactory;
import groups.GroupType;
import groups.Groups;
import groups.Weekdays;
import java.util.ArrayList;
import myutils.MyUtils;
import myutils.Queries;
import staff.StaffFactory;
import staff.AdminStaff;
import staff.CoachStaff;
import staff.CoachType;
import staff.EmployeeType;

/**
 *
 * @author matheusdiniz
 */
public class SwimmingClub {
    
    //Creating ArrayList to store groups, coachStaff and adminStaff
    public static ArrayList<CoachStaff> coachStaff;
    public static ArrayList<Groups> groups;
    public static ArrayList<AdminStaff> adminStaff;
        
    /**
     * method to call the creations of the groups and staffs
     */
    public SwimmingClub() {
		
        this.groups = new ArrayList<>();
        createGroup(50);
        this.adminStaff = new ArrayList<>();
        createAdminStaff(10);
        this.coachStaff = new ArrayList<>();
        createCoachingStaff(30);
        
                	
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        MyUtils input = new MyUtils();
        Queries query = new Queries();
        int optionChosen; 
        //do-while to run the main code, menu and structure
        do {
            //calls the menu
            input.getMenu();
            //asks the user for an input between 1 and 8
            optionChosen = input.getUserMenu("Pick an option.", 1, 6);
             //in each case the user chooses an option, it does the respective one
            switch(optionChosen){
                case 1:
                    //shows all the staffs calling the lisf of Admin staff and Coach Staff
                    System.out.println(query.listAdminStaff());
                    System.out.println(query.listCoachStaff());
                    break;
                case 2:
                    //print the list of all Employee type we have
                    System.out.println(EmployeeType.listAllTypes());
                    //call the utility method and store its value inside staffCategory to check it within the switch case
                    int staffCategory = input.getUserIntValue("Select the number corresponding to the category job you want to see.", 1, EmployeeType.values().length);
                    //shows the staffs regarding to the list of category showed to the user, check if the method getCargoName on the item within the coachStaff ArrayList has the desired category
                    switch(staffCategory){
                        case 1:
                            for (CoachStaff p: coachStaff) {
                                if (p.getCargoName().contains("Head Coach")) {
                                    System.out.println(p.toString());
                                }          
                            }
                            break;
                        case 2:
                            for (CoachStaff p: coachStaff) {
                                if (p.getCargoName().contains("Assistent Coach")) {
                                    System.out.println(p.toString());
                                }          
                            }
                            break;
                        case 3:
                            for (CoachStaff p: coachStaff) {
                                if (p.getCargoName().contains("Swim Teacher")) {
                                    System.out.println(p.toString());
                                }          
                            }
                            break;
                        case 4:
                            for (AdminStaff p: adminStaff) {
                                if (p.getCargoName().contains("Cleaner")) {
                                    System.out.println(p.toString());
                                }          
                            }
                            break;
                        case 5:
                            for (AdminStaff p: adminStaff) {
                                if (p.getCargoName().contains("Recepcionist")) {
                                    System.out.println(p.toString());
                                }          
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                    // displays all groups with the number os swimmers on it and its Coach 
                case 3:
                    for (Groups p: groups) {
                        System.out.println(p.getCoachAndSwimmerNumber());        
                    }
                    break;
                    // 
                case 4:
                    //print the list of all Group type we have
                    System.out.println(GroupType.listGroupTypes());
                    //call the utility method and store its value inside groupCategory to check it within the switch case
                    int groupCategory = input.getUserIntValue("Select the number corresponding to the group type you want to see.", 1, GroupType.values().length);
                    //shows the groups regarding to the list of group types showed to the user, check if the method getName(which gets the category name of the group)...
                    //...on the item within the groups ArrayList has the desired category
                    switch(groupCategory){
                        case 1:
                            for (Groups p: groups) {
                                if (p.getName().contains("Dolphin")) {
                                     System.out.println(p.toString());
                                 }          
                            }
                            break;
                        case 2:
                            for (Groups p: groups) {
                                if (p.getName().contains("Piranha")) {
                                     System.out.println(p.toString());
                                 }          
                            }
                            break;
                        case 3:
                            for (Groups p: groups) {
                                if (p.getName().contains("Seals")) {
                                     System.out.println(p.toString());
                                 }          
                            }
                            break;
                        case 4:
                            for (Groups p: groups) {
                                if (p.getName().contains("Shark")) {
                                     System.out.println(p.toString());
                                 }          
                            }
                            break;
                        case 5:
                            for (Groups p: groups) {
                                if (p.getName().contains("Turtle")) {
                                     System.out.println(p.toString());
                                 }          
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    //print the list of all days of the week we have classes
                    System.out.println(Weekdays.listWeekdays());
                    //call the utility method and store its value inside groupCategory to check it within the switch case
                    int weekdays = input.getUserIntValue("Select the number corresponding to the group type you want to see.", 1, Weekdays.values().length);
                    switch(weekdays){
                        //goes through the groups ArrayList method containing the days of the week and seach for each groups which have classes on that day and display it
                        case 1:
                            for (Groups p: groups) {
                                if (p.getWeekday().contains("Monday")) {
                                     System.out.println(p.toString());
                                 }          
                            }
                            break;
                        case 2:
                            for (Groups p: groups) {
                                if (p.getWeekday().contains("Tuesday")) {
                                     System.out.println(p.toString());
                                 }          
                            }
                            break;
                        case 3:
                            for (Groups p: groups) {
                                if (p.getWeekday().contains("Wednesday")) {
                                     System.out.println(p.toString());
                                 }          
                            }
                            break;
                        case 4:
                            for (Groups p: groups) {
                                if (p.getWeekday().contains("Thursday")) {
                                     System.out.println(p.toString());
                                 }          
                            }
                            break;
                        case 5:
                            for (Groups p: groups) {
                                if (p.getWeekday().contains("Friday")) {
                                     System.out.println(p.toString());
                                 }          
                            }
                            break;
                        case 6:
                            for (Groups p: groups) {
                                if (p.getWeekday().contains("Saturday")) {
                                     System.out.println(p.toString());
                                 }          
                            }
                            break;
                        case 7:
                            for (Groups p: groups) {
                                if (p.getWeekday().contains("Sunday")) {
                                     System.out.println(p.toString());
                                 }          
                            }
                            break;
                        default:
                            break;
                    }
                    break;   
                case 6:
                    //Close the menu and shows a message to the user saying that they chose to finish it.
                    System.out.println("\nYou have decided to Exit/Quit the application.");
                    break;
            default:
                System.out.println("Unknown Error -- the system didn't find what you typed!");
                break;
            }
          //condition to run until the option chosen from the user is 6 and if it is 6, finish the application.   
        } while (optionChosen != 6);
    }
    
    /**
     * Method to create the groups and add it to the groups ArrayList
     * @param numOfGroups number of groups desired to be created
     */
    private void createGroup(int numOfGroups) {
		
        GroupFactory myGroupFactory = new GroupFactory();
		
        for (int i=0; i<numOfGroups; i++) {
			
            Groups group = myGroupFactory.getGroup();
            this.groups.add(group);	 
                        
        }
    }

        /**
         * Method to create the Coach Staff and add it to the groups ArrayList
         * @param numStaff - the number of Coach StaffMembers desired to be created
         */
    private void createCoachingStaff(int numStaff) {
        
       StaffFactory myStaffFactory = new StaffFactory();
//       CoachType[] types = CoachType.values();
       this.coachStaff.add(CoachType.HEADCOACH.getCoachStaff());
       
       for (int i=1; i<numStaff; i++) {
			
           CoachStaff newStaff = myStaffFactory.getCoachStaff();
           
           this.coachStaff.add(newStaff);
				
	} 
    }
    /**
         * Method to create the Admin Staff and add it to the groups ArrayList
         * @param numStaff - the number of Admin StaffMembers desired to be created
         */
    private void createAdminStaff(int numStaff) {
        
       StaffFactory myStaffFactory = new StaffFactory();
       
       for (int i=0; i<numStaff; i++) {
			
           AdminStaff newStaff = myStaffFactory.getAdminStaff();
           
           this.adminStaff.add(newStaff);
				
	}
    }
}
