/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package groups;

import java.util.Random;

/**
 * Method that gets called when the createGroup is called on the main class, responsible to call the GroupType enum and get the correct group with its properties
 * @author matheusdiniz
 */
public class GroupFactory {

    /**
     * 
     * @return return a specific group type and call it on the enum GroupType to get the properties for it.
     */
    public Groups getGroup() {
        
        Random r = new Random();
        GroupType[] types = GroupType.values();
		
        int number = r.nextInt(types.length);
        
        return types[number].getGroup();
    
    }
}
