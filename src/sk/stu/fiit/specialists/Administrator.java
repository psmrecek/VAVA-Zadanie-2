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
public class Administrator extends Specialist{
    
    private String type;
    private String platform;

    public Administrator(String type, String platform, String name, Double man_day, String length_practise, String education, ArrayList<String> certificates) {
        super(name, man_day, length_practise, education, certificates);
        super.setPositionSpecialist("Administrátor");
        this.type = type;
        this.platform = platform;
    }
    
    @Override
    public String printInfoSpecialist(){
        String informations = this.getBasicInfo().getAll() + "\n" + this.type + "\n" + this.platform;
        return informations;
    }
    
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
