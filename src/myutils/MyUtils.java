/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Ken Healy
 */
public class MyUtils {
    /**
     * Display the menu to the user.
     */
    public void getMenu(){
        System.out.println("\nPlease choose an option bellow to proceed.\n"
                + "Option 1 = List all staff.\n"
                + "Option 2 = List staff in a particular category.\n"
                + "Option 3 = List all Groups, showing the coach and the number of swimmers in the group.\n"
                + "Option 4 = List Groups of a particular type.\n"
                + "Option 5 = List Groups based on the weekday they train.\n"  
                + "Option 6 = Exit.\n");
    }

    /**
    * Prompt for the user to enter the value into the query
    * and make sure the user entered a valid input. 
     * @param prompt what is showed to the user.
     * @return the user's input checked.
     */
    public String getUserText(String prompt){
        
        Scanner myKB = new Scanner(System.in);
                    
        String userInput = "";
        
        //prompt user until input is valid
        do{
            
            System.out.println(prompt);
            System.out.println("You must enter letters only.");
            
            userInput = myKB.nextLine();
            
            
        }while (!userInput.matches("[a-zA-Z ]+"));
        
        //userInput must be text now
        
        return (userInput);
    }
    
        /**
         * 
         * @param prompt to let the user only type the range allowed
         * @param minValue minimum value that the user can enter
         * @param maxValue maximum value the user can enter
         * @return returns 
         */
        public int getUserMenu(String prompt, int minValue, int maxValue){
        
        Scanner myKB = new Scanner(System.in);
        boolean valid = false;
        int userInput=-1; //defaulted to -1 because it needs to have a value
        
        do{
            
            System.out.println(prompt);
            
            //confirm range to user
            System.out.println("You must choose a option between " + minValue + " and " + maxValue + ".");
            
            try {
                userInput = Integer.parseInt(myKB.nextLine());
                
                //check that the value is allowed by checking range
                if ( (userInput < minValue) || ( userInput > maxValue) ){
                    
                getMenu();
                    
                }
                else {
                    //must be OK
                    valid = true;
                }
                
            }catch(NumberFormatException e){
                // this will be if the parseInt threw an error -- so the user did not enter a number
                System.out.println("\nThat was not a number! please type a number!");
                getMenu();
               
            }
            catch (NoSuchElementException NSe) {
                
                System.out.println("Something weird happened -- the system didn't find what you typed!");
            }
            
            
        }while (!valid);
        
        //userInput must be text now
        
        return (userInput);
        
    }
        public int getUserIntValue(String prompt, int minValue, int maxValue){
        
        Scanner myKB = new Scanner(System.in);
        boolean valid = false;
        int userInput=-1; //defaulted to -1 because it needs to have a value
        
        do{
            
            System.out.println(prompt);
            
            //confirm range to user
            System.out.println("The range allowed is between " + minValue + " and " + maxValue);
            
            try {
                userInput = Integer.parseInt(myKB.nextLine());
                
                //check that the value is allowed by checking range
                if ( (userInput < minValue) || ( userInput > maxValue) ){  
                    System.out.println("Invalid value entered. Please enter a number within the range specified");
                }
                else {
                    //must be OK
                    valid = true;
                }
                
            }catch(NumberFormatException e){
                // this will be if the parseInt threw an error -- so the user did not enter a number
                System.out.println("\nThat was not a number! please type a number!");
               
            }
            catch (NoSuchElementException NSe) {
                
                System.out.println("Something weird happened -- the system didn't find what you typed!");
            }
            
            
        }while (!valid);
        
        //userInput must be text now
        
        return (userInput);
        
    }
    
}
