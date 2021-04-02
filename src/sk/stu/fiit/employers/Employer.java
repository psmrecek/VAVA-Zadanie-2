/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.employers;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import sk.stu.fiit.hires.Hire;

/**
 *
 * @author PeterSmrecek
 */
public class Employer {
    
    private String name;
    private String field;
    private ArrayList<Hire> listOfHires;
    private int numberOfEmployees = 0;
    private ImageIcon icon;

    public Employer(String name, String field, ImageIcon icon) {
        this.name = name;
        this.field = field;
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

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
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
        numberOfEmployees = 0;
        for (Hire hire : listOfHires) {
            numberOfEmployees += hire.getNumberOfHired();
        }
    }
}
