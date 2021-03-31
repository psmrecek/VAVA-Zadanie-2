/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.specialists;

import java.util.ArrayList;

/**
 *
 * @author PeterSmrecek
 */
public class Programmer extends Specialist{
    
    private String field;

    public Programmer(String field, String name, Double man_day, String length_practise, String education, ArrayList<String> certificates) {
        super(name, man_day, length_practise, education, certificates);
        super.setPositionSpecialist("Programátor");
        this.field = field;
    }

    @Override
    public String printInfoSpecialist() {
        String informations = this.getBasicInfo().getAll() + "\n" + this.field;
        return informations;
    }
    
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
    
}
