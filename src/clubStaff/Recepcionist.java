/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubStaff;

import staff.AdminType;
import staff.AdminStaff;

/**
 * Method that extend AdminStaff Class and is used to call AdminStaff to create the Staff as Recepcionist
 * @author matheusdiniz
 */
public class Recepcionist extends AdminStaff {
    
    public Recepcionist(String cargoName, String staffName) {
        
        super(cargoName, staffName, AdminType.RECEPCIONIST);
    }
    
}
