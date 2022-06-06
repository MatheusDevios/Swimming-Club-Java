/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package groups;

import Club.NameGenerator;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

/**
 * Gets called by the group factory to create the group with its type and its properties and then create a new group object which will be added to the groups ArrayList
 * @author matheusdiniz
 */
public enum GroupType {
    
	DOLPHIN{

            /**
             * returns a new object calling the Dolphin and retrieving it to the creatGroup() and get added to the groups ArrayList
             * give its name plus once every time it get called to create a new group with the same type
             * get a random weekday
             * call the getName() to get the coach's name
             * create a Hashtable to store the swimmer's name and their age within the same index
             * gets a random number of swimmers with is used on the Hashtable function getSwimmers to get their names and ages.
             */
            @Override
            public Groups getGroup() {
                
                String name = "Dolphin ";
                name = name + count1++;
                Random r = new Random();
                Weekdays[] types = Weekdays.values();
                int number = r.nextInt(types.length);
                String weekDay = types[number].toString();
                int numberSwimmers = r.nextInt(3, 15);
                
                return new Dolphin(name, weekDay, getName(),getSwimmers(numberSwimmers), numberSwimmers);
            }
            @Override
            public String toString() {
			
                return "Dolphin";
            }
		
		
	},
	
	PIRANHA{
            
            /**
             * returns a new object calling the Piranha and retrieving it to the creatGroup() and get added to the groups ArrayList
             * give its name plus once every time it get called to create a new group with the same type
             * get a random weekday
             * call the getName() to get the coach's name
             * create a Hashtable to store the swimmer's name and their age within the same index
             * gets a random number of swimmers with is used on the Hashtable function getSwimmers to get their names and ages.
             */

            @Override
            public Groups getGroup() {
                
                String name = "Piranha ";
                name = name + count2++;
                Random r = new Random();
                Weekdays[] types = Weekdays.values();
                int number = r.nextInt(types.length);
                String weekDay = types[number].toString();
                int numberSwimmers = r.nextInt(3, 15);
                
                return new Piranha(name, weekDay, getName(),getSwimmers(numberSwimmers), numberSwimmers);
                
            }
            @Override
            public String toString() {
			
                return "Piranha";
            }
		
		
	},
	
	SEALS{

            /**
             * returns a new object calling the Seals and retrieving it to the creatGroup() and get added to the groups ArrayList
             * give its name plus once every time it get called to create a new group with the same type
             * get a random weekday
             * call the getName() to get the coach's name
             * create a Hashtable to store the swimmer's name and their age within the same index
             * gets a random number of swimmers with is used on the Hashtable function getSwimmers to get their names and ages.
             */
            
            @Override
            public Groups getGroup() {
                
                String name = "Seals ";
                name = name + count3++;
                Random r = new Random();
                Weekdays[] types = Weekdays.values();
                int number = r.nextInt(types.length);
                String weekDay = types[number].toString();
                int numberSwimmers = r.nextInt(3, 15);
                
                return new Seals(name, weekDay, getName(),getSwimmers(numberSwimmers), numberSwimmers);
                
            }
            @Override
            public String toString() {
			
                return "Seals";
            }
		
		
	},
        
        SHARK{
            
            /**
             * returns a new object calling the Shark and retrieving it to the creatGroup() and get added to the groups ArrayList
             * give its name plus once every time it get called to create a new group with the same type
             * get a random weekday
             * call the getName() to get the coach's name
             * create a Hashtable to store the swimmer's name and their age within the same index
             * gets a random number of swimmers with is used on the Hashtable function getSwimmers to get their names and ages.
             */

            @Override
            public Groups getGroup() {
                
                String name = "Shark ";
                name = name + count4++;
//                Random r = new Random();
                Weekdays[] types = Weekdays.values();
                int number = r.nextInt(types.length);
                String weekDay = types[number].toString();
                int numberSwimmers = r.nextInt(3, 15);
                
                return new Shark(name, weekDay, getName(),getSwimmers(numberSwimmers), numberSwimmers);
                
            }
            @Override
            public String toString() {
			
                return "Shark";
            }
            
        },
        
        TURTLE{
            
            /**
             * returns a new object calling the Turtle and retrieving it to the creatGroup() and get added to the groups ArrayList
             * give its name plus once every time it get called to create a new group with the same type
             * get a random weekday
             * call the getName() to get the coach's name
             * create a Hashtable to store the swimmer's name and their age within the same index
             * gets a random number of swimmers with is used on the Hashtable function getSwimmers to get their names and ages.
             */

            @Override
            public Groups getGroup() {
                
                String name = "Turtle ";
                name = name + count5++;
                Random r = new Random();
                Weekdays[] types = Weekdays.values();
                int number = r.nextInt(types.length);
                String weekDay = types[number].toString();
                int numberSwimmers = r.nextInt(3, 15);
                
                return new Turtle(name, weekDay, getName(),getSwimmers(numberSwimmers), numberSwimmers);
                
            }
            @Override
            public String toString() {
			
                return "Turtle";
            }
            
        }

        ;
	
        Random r = new Random();
	int count1 = 1;
        int count2 = 1;
        int count3 = 1;
        int count4 = 1;
        int count5 = 1;
        
        protected  NameGenerator NG;
	public abstract Groups getGroup();
	
        /**
         * gets the coach's name responsible for the respective group
         * @return 
         */
	public static String getName() {
		
		NameGenerator NG = new NameGenerator();
		return (NG.getRandomName());
	}
        
        /**
         * Method called to create the swimmers Hashtable to contain their names and a random age within the same List index.
         * @param number number of swimmers registered on the group
         * @return 
         */
        public Hashtable<String, String> getSwimmers(int number) {

                Hashtable<String, String> swimmers = new Hashtable<String, String>();
		NameGenerator NG = new NameGenerator();
                for (int i = 0; i < number; i++) {
                    String s=String.valueOf(r.nextInt(4, 70));
                    swimmers.put(NG.getRandomName()+" ", " "+s + " Years Old");

                }
		return swimmers;
	}
        
       /**
        * 
        * @return all types of group created
        */
	public static String listGroupTypes() {
			
            String list = "";
            GroupType[] types = GroupType.values();
			
            for( int counter = 0; counter<types.length; counter++) {
			
		list = list.concat((counter + 1) + ": " + types[counter].toString() + "\n");
            }
			
            return list;
	}
	
}
