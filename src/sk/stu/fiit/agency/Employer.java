/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.agency;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import sk.stu.fiit.agency.Hire;

/**
 *
 * @author PeterSmrecek
 */
public class Employer {
    
    private String name;
    private String field;
    private ArrayList<Hire> listOfHires;
    private int agencyNumberOfEmployees = 0;
    private int givenNumberOfEmployees;
    private ImageIcon icon;

    public Employer(String name, String field, int givenNumberOfEmployees, ImageIcon icon) {
        this.name = name;
        this.field = field;
        this.givenNumberOfEmployees = givenNumberOfEmployees;
        this.icon = icon;
        this.listOfHires = new ArrayList<>();
        calculateNumberOfEmployees();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getAgencyNumberOfEmployees() {
        return agencyNumberOfEmployees;
    }

    public void setAgencyNumberOfEmployees(int agencyNumberOfEmployees) {
        this.agencyNumberOfEmployees = agencyNumberOfEmployees;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public ArrayList<Hire> getListOfHires() {
        return listOfHires;
    }

    public void setListOfHires(ArrayList<Hire> listOfHires) {
        this.listOfHires = listOfHires;
        calculateNumberOfEmployees();
    }
    
    public void addHire(Hire hire){
        listOfHires.add(hire);
        calculateNumberOfEmployees();
    }
    
    public void removeHire(Hire hire){
        listOfHires.remove(hire);
        calculateNumberOfEmployees();
    }
    
    public void calculateNumberOfEmployees(){
        agencyNumberOfEmployees = 0;
        for (Hire hire : listOfHires) {
            agencyNumberOfEmployees += hire.getNumberOfHired();
        }
    }

    public int getGivenNumberOfEmployees() {
        return givenNumberOfEmployees;
    }

    public void setGivenNumberOfEmployees(int givenNumberOfEmployees) {
        this.givenNumberOfEmployees = givenNumberOfEmployees;
    }
}
