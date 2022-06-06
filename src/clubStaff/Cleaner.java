/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubStaff;

import staff.AdminType;
import staff.AdminStaff;

/**
 * Method that extend AdminStaff Class and is used to call AdminStaff to create the Staff as Cleaner
 * @author matheusdiniz
 */
public class Cleaner extends AdminStaff {
    
    public Cleaner(String cargoName, String staffName) {
        
        super(cargoName, staffName, AdminType.CLEANER);
    }
}
