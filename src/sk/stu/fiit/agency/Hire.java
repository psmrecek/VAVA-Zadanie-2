/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.agency;

import java.util.ArrayList;
import sk.stu.fiit.inputs.InputSanitizer;
import sk.stu.fiit.specialists.Specialist;

/**
 *
 * @author PeterSmrecek
 */
public class Hire {
    
    private Employer employer;
    private ArrayList<Specialist> specialists;
    private String dateString;

    public Hire(ArrayList<Specialist> specialists, Employer employer) {
        this.specialists = specialists;
        this.employer = employer;
        this.dateString = InputSanitizer.createDateString();
        
        for (Specialist specialist : specialists) {
            specialist.setHire(this);
            specialist.setHired(true);
        }

        employer.addHire(this);
        
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public ArrayList<Specialist> getSpecialists() {
        return specialists;
    }

    public void setSpecialists(ArrayList<Specialist> specialists) {
        this.specialists = specialists;
    }
    
    public int getNumberOfHired(){
        return specialists.size();
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }
    
}

