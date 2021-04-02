/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.specialists;

import java.util.ArrayList;
import sk.stu.fiit.hires.Hire;

/**
 *
 * @author PeterSmrecek
 */
public abstract class Specialist {
    
    private BasicInfo basicInfo;
    private boolean hired = false;
    private Hire hire;

    public Specialist(String name, Double man_day, String length_practise, String education, ArrayList<String> certificates) {
        this.basicInfo = new BasicInfo("Špecialista", name, man_day, length_practise, education, certificates);
    }
    
    public void setPositionSpecialist(String position){
        this.basicInfo.setPosition(position);
    }
    
    public String printInfoSpecialist(){
        return basicInfo.getAll();
    }

    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfo basic_info) {
        this.basicInfo = basic_info;
    }

    public boolean isHired() {
        return hired;
    }

    public void setHired(boolean hired) {
        this.hired = hired;
    }

    public Hire getHire() {
        return hire;
    }

    public void setHire(Hire hire) {
        this.hire = hire;
    }
    
    public String isHiredText(){
        if(hired){
            return "Najatý";
        }
        
        return "Voľný";
    }
    
}
