/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groups;

import java.util.ArrayList;
import java.util.Hashtable;
import staff.CoachStaff;

/**
 *  Method that extend Groups Class and is used to call Groups to create a Groups with Shark type
 * @author matheusdiniz
 */
public class Shark extends Groups {
    public Shark(String name, String weekDay, String coachName, Hashtable<String, String> swimmers, int numberSwimmers) {
        super(name, weekDay, coachName, swimmers, numberSwimmers, GroupType.SHARK);
    }
}