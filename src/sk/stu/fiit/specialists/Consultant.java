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
public class Consultant extends Specialist{
    
    private boolean auditor_nbu;

    public Consultant(boolean auditor_nbu, String name, Double man_day, String length_practise, String education, ArrayList<String> certificates) {
        super(name, man_day, length_practise, education, certificates);
        super.setPositionSpecialist("Bezpečnostný konzultant a špecialista");
        this.auditor_nbu = auditor_nbu;
    }
    
    @Override
    public String printInfoSpecialist() {
        String informations;
        
        if (this.auditor_nbu) {
            informations = this.getBasicInfo().getAll() + "\n Je je audítor kybernetickej bezpečnosti NBU";
        } else {
            informations = this.getBasicInfo().getAll() + "\n Nie je audítor kybernetickej bezpečnosti NBU";
        }
        
        return informations;
    } 
    
    public boolean isAuditor_nbu() {
        return auditor_nbu;
    }

    public void setAuditor_nbu(boolean auditor_nbu) {
        this.auditor_nbu = auditor_nbu;
    }

}
