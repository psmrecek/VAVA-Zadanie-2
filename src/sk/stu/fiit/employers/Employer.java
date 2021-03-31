/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.employers;

import javax.swing.ImageIcon;

/**
 *
 * @author PeterSmrecek
 */
public class Employer {
    
    private String name;
    private String field;
    private int numberOfEmployees;
    private ImageIcon icon;

    public Employer(String name, String field, int numberOfEmployees, ImageIcon icon) {
        this.name = name;
        this.field = field;
        this.numberOfEmployees = numberOfEmployees;
        this.icon = icon;
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
    
}
