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
public class BasicInfo {
    
    private String position;
    private String name;
    private Double man_day;
    private String length_practise;
    private String education;
    private ArrayList<String> certificates;

    public BasicInfo(String position, String name, Double man_day, String length_practise, String education, ArrayList<String> certificates) {
        this.position = position;
        this.name = name;
        this.man_day = man_day;
        this.length_practise = length_practise;
        this.education = education;
        this.certificates = certificates;
    }
    
    public String getAll(){
        return "";
    }
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMan_day() {
        return man_day;
    }

    public void setMan_day(Double man_day) {
        this.man_day = man_day;
    }

    public String getLength_practise() {
        return length_practise;
    }

    public void setLength_practise(String length_practise) {
        this.length_practise = length_practise;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public ArrayList<String> getCertificates() {
        return certificates;
    }

    public void setCertificates(ArrayList<String> certificates) {
        this.certificates = certificates;
    }
    
    public String getCertificatesString(){
        return String.join(", ", certificates);
    }
}
