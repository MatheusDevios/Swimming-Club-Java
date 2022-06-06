/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Club;

import java.util.Random;

/**
 * Method used to create Random names, which are used to populated the swimmer's name, and Staff's name
 * @author matheusdiniz
 */
public class NameGenerator {
    
    private String[] firstNames = {"Matheus", "Debora", "Liam", "Noah", "Oliver", "Renata", "Luiza", "Eliane", "Andre", "James", "Wiliam", "Benjamin", "Lucas", "Henry", "Teo", "Jack", "Levi", "Mateo"};
    private String[] surnames = {"Costa","Diniz","Carvalho","Silva","Garcia","Smith", "Johson", "Brown", "Jones", "Miller", "Aurelio", "Lopez", "Taylor", "Martin", "Moore", "Lee", "Hariz", "Clark"};
	
        /**
         * Generates a random name using firstnames and surnames
         * @return the name as a String
         */
	public String getRandomName() {
				
            Random r = new Random();
            String firstName = this.firstNames[r.nextInt(firstNames.length)];
            String secondName = this.surnames[r.nextInt(surnames.length)];	
            
            return(firstName + " " + secondName);
	}  
}
