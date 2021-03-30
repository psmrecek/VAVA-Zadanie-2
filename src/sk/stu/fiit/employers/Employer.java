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
    private String number_of_employees;
    private ImageIcon icon;

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

    public String getNumber_of_employees() {
        return number_of_employees;
    }

    public void setNumber_of_employees(String number_of_employees) {
        this.number_of_employees = number_of_employees;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
    
}
