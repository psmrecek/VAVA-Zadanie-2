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
import sk.stu.fiit.specialists.Specialist;

/**
 *
 * @author PeterSmrecek
 */
public class Agency<T extends Specialist> {
    
    private ArrayList<T> listProgrammers = new ArrayList<>();
    private ArrayList<T> listConsultants = new ArrayList<>();
    private ArrayList<T> listAdministrators = new ArrayList<>();
    
    private ArrayList<Employer> listEmployers = new ArrayList<>();
    
    private ArrayList<Hire> listHires = new ArrayList<>();
    
    public void addProgrammer(Programmer programmer){
        listProgrammers.add((T) programmer);
    }
    
    public void addConsultant(Consultant consultant){
        listConsultants.add((T) consultant);
    }
    
    public void addAdministrator(Administrator administrator){
        listAdministrators.add((T) administrator);
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
        return (ArrayList<Programmer>) listProgrammers;
    }

    public ArrayList<Consultant> getListConsultants() {
        return (ArrayList<Consultant>) listConsultants;
    }

    public ArrayList<Administrator> getListAdministrators() {
        return (ArrayList<Administrator>) listAdministrators;
    }

    public ArrayList<Employer> getListEmployers() {
        return listEmployers;
    }
    
    public Employer getEmployer(int id) {
        return listEmployers.get(id);
    }

    public ArrayList<Hire> getListHires() {
        return listHires;
    }
    
    public Programmer getProgrammer(int id){
        return (Programmer) listProgrammers.get(id);
    }
    
    public Consultant getConsultant(int id){
        return (Consultant) listConsultants.get(id);
    }
    
    public Administrator getAdministrator(int id){
        return (Administrator) listAdministrators.get(id);
    }
    
}
