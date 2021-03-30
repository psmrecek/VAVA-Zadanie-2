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
public abstract class Specialist {
    
    private Basic_info basic_info;

    public Specialist(String name, Double man_day, Double length_practise, String education, ArrayList<String> certificates) {
        this.basic_info.setPosition("Špecialista");
        this.basic_info.setName(name);
        this.basic_info.setMan_day(man_day);
        this.basic_info.setLength_practise(length_practise);
        this.basic_info.setEducation(education);
        this.basic_info.setCertificates(certificates);
    }
    
    public void setPositionSpecialist(String position){
        this.basic_info.setPosition(position);
    }
    
    public String print_info_specialist(){
        return basic_info.get_all();
    }

    public Basic_info getBasic_info() {
        return basic_info;
    }

    public void setBasic_info(Basic_info basic_info) {
        this.basic_info = basic_info;
    }
    
}
