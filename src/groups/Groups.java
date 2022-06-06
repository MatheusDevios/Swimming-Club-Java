/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groups;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

/**
 *
 * @author matheusdiniz
 */
public class Groups {
    
    private String groupName;
    private GroupType type;
    private int numSwimmers;
    private String coachName;
    private String weekDay;
    private Random r = new Random();
    Hashtable<String, String> swimmers = new Hashtable<String, String>();
    
    /**
     * Create a group object which has the following properties, and will be added to the groups ArrayList
     * @param name name of the group
     * @param weekDay day of the week
     * @param coachName name of the coach
     * @param swimmers store the swimmers as a Hashtable because we can use it to store 2 values in each index, such as the name and age of each swimmer, as if it was an ArrayList with 2 values on each index
     * @param numberSwimmers number of swimmers on each group
     * @param type type of the group
     */
    public Groups (String name, String weekDay, String coachName, Hashtable<String, String> swimmers,int numberSwimmers, GroupType type){
        this.groupName = name;
        this.type = type;
        this.coachName = coachName;
        this.weekDay = weekDay;
        this.numSwimmers = numberSwimmers;
        this.swimmers = swimmers;
    }

    /**
     * Method used to display the group created
     * @return returns the group's name, coach's name, number of swimmers the the weekday they have classes and the name of the swimmers registered to that group
     */
    @Override 
    public String toString() {

        String details;
        details = "\n NAME OF THE GROUP: " + this.groupName + "\n NAME OF THE COACH RESPONSABLE: " + this.coachName + "\n NUMBERS OF SWIMMERS: " + this.numSwimmers + "\n WEEKDAY: " + this.weekDay +"\n SWIMMERS: " +swimmers+"\n";  
        return details ;
    }
    
    /**
     * Method used to display the name of the group and the coach's name with the number of swimmers
     * @return return the group's name, coach's name and the number of swimmers registered on it
     */
    public String getCoachAndSwimmerNumber(){
        String details;
        details = "\n NAME OF THE GROUP: " + this.groupName + "\n NAME OF THE COACH RESPONSABLE: " + this.coachName + "\n NUMBERS OF SWIMMERS: " + this.numSwimmers +"\n";  
        return details ;
    }
    
    /**
    * Method used to return the name of the group when needed 
    * @return return the group's name
    */
    public String getName() {
		
        return this.groupName;
    }
    
    /**
    * Method used to return the weekday that the group has classes when needed 
    * @return return the group's name
     */
    public String getWeekday(){
        return this.weekDay;
    }
    
    /**
    * Method used to return the group's type when needed 
    * @return return the group's name 
     */
    public GroupType getType() {
        return this.type;
    }
    
}
