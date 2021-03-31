/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.agency;

import java.util.ArrayList;
import sk.stu.fiit.employers.Employer;
import sk.stu.fiit.hires.Hire;
import sk.stu.fiit.specialists.Administrator;
import sk.stu.fiit.specialists.Consultant;
import sk.stu.fiit.specialists.Programmer;

/**
 *
 * @author PeterSmrecek
 */
public class Agency {
    
    private ArrayList<Programmer> listProgrammers = new ArrayList<>();
    private ArrayList<Consultant> listConsultants = new ArrayList<>();
    private ArrayList<Administrator> listAdministrators = new ArrayList<>();
    
    private ArrayList<Employer> listEmployers = new ArrayList<>();
    
    private ArrayList<Hire> listHires = new ArrayList<>();
    
    public void addProgrammer(Programmer programmer){
        listProgrammers.add(programmer);
    }
    
    public void addConsultant(Consultant consultant){
        listConsultants.add(consultant);
    }
    
    public void addAdministrator(Administrator administrator){
        listAdministrators.add(administrator);
    }
    
    public void addEmployer(Employer employer){
        listEmployers.add(employer);
    }
    
    public void addHire(Hire hire){
        listHires.add(hire);
    }
    
    public void removeHire(Hire hire){
        listHires.remove(hire);
    }
    
    public void removeHire(int id){
        listHires.remove(id);
    }
    
    public ArrayList<Programmer> getListProgrammers() {
        return listProgrammers;
    }

    public ArrayList<Consultant> getListConsultants() {
        return listConsultants;
    }

    public ArrayList<Administrator> getListAdministrators() {
        return listAdministrators;
    }

    public ArrayList<Employer> getListEmployers() {
        return listEmployers;
    }

    public ArrayList<Hire> getListHires() {
        return listHires;
    }
    
}
