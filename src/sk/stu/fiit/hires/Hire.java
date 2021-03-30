/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.hires;

import java.util.ArrayList;
import sk.stu.fiit.employers.Employer;
import sk.stu.fiit.specialists.Specialist;

/**
 *
 * @author PeterSmrecek
 */
public class Hire {
    
    private ArrayList<Specialist> specialists;
    private Employer employer;

    public Hire(ArrayList<Specialist> specialists, Employer employer) {
        this.specialists = specialists;
        this.employer = employer;
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
    
}
