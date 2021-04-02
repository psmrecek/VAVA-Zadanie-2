/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.demos;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import sk.stu.fiit.agency.Agency;
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
public class DemoInputs {

    public static void demoSpecialists(Agency agency) {
        ArrayList<String> certificates = new ArrayList<>();
        certificates.add("Certifikát 1");
        certificates.add("Certifikát 2");
        certificates.add("Certifikát 3");

        Programmer pr1 = new Programmer("Java", "Alojz Bednárik", 240.0, "7 rokov", "FIIT", certificates);
        Programmer pr2 = new Programmer("C/C++", "Cecília Dubová", 340.0, "13 rokov", "FIIT", certificates);
        Programmer pr3 = new Programmer("Python", "Erik Fabuš", 180.0, "Pol roka", "FIIT", certificates);

        Consultant co1 = new Consultant(false, "Gregor Huňatý", 250.0, "2 roky", "FIIT", certificates);
        Consultant co2 = new Consultant(true, "Ivan Jalový", 420.0, "10 rokov", "FIIT", certificates);
        Consultant co3 = new Consultant(false, "Kristián Lipa", 190.0, "3 roky", "FIIT", certificates);

        Administrator ad1 = new Administrator("Aplikačný", "Neviem", "Mário Novák", 250.0, "6 rokov", "FIIT", certificates);
        Administrator ad2 = new Administrator("Sieťový", "Neviem", "Oliver Petrík", 300.0, "10 rokov", "FIIT", certificates);
        Administrator ad3 = new Administrator("Sap", "Neviem", "Quido Rypák", 210.0, "5 rokov", "FIIT", certificates);

        BufferedImage img1 = null;
        BufferedImage img2 = null;
        BufferedImage img3 = null;

//        String path = "src/sk/stu/fiit/demos";
//        try {
//            img1 = ImageIO.read(new File(path + "/Asus.png"));
//            img2 = ImageIO.read(new File(path + "/Dell.png"));
//            img3 = ImageIO.read(new File(path + "/Google.png"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            img1 = ImageIO.read(new File("images/Asus.png"));
            img2 = ImageIO.read(new File("images/Dell.png"));
            img3 = ImageIO.read(new File("images/Google.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        int size = 100;

        ImageIcon icon1 = new ImageIcon(img1.getScaledInstance(size, size, Image.SCALE_DEFAULT));
        Employer emp1 = new Employer("Asus", "Počítače", 150, icon1);
        ImageIcon icon2 = new ImageIcon(img2.getScaledInstance(size, size, Image.SCALE_DEFAULT));
        Employer emp2 = new Employer("Dell", "Počítače", 200, icon2);
        ImageIcon icon3 = new ImageIcon(img3.getScaledInstance(size, size, Image.SCALE_DEFAULT));
        Employer emp3 = new Employer("Google", "Počítače", 10000, icon3);
        
        ArrayList<Specialist> sp1 = new ArrayList<>();
        sp1.add(pr1);
        sp1.add(co1);
        sp1.add(ad1);
        
        ArrayList<Specialist> sp2 = new ArrayList<>();
        sp2.add(pr2);
        sp2.add(co2);
        
        ArrayList<Specialist> sp3 = new ArrayList<>();
        sp3.add(co3);
        sp3.add(ad3);
        
        agency.addProgrammer(pr1);
        agency.addProgrammer(pr2);
        agency.addProgrammer(pr3);
        agency.addConsultant(co1);
        agency.addConsultant(co2);
        agency.addConsultant(co3);
        agency.addAdministrator(ad1);
        agency.addAdministrator(ad2);
        agency.addAdministrator(ad3);
        agency.addEmployer(emp1);
        agency.addEmployer(emp2);
        agency.addEmployer(emp3);
        
        agency.addHire(new Hire(sp1, emp1));
        agency.addHire(new Hire(sp2, emp2));
        agency.addHire(new Hire(sp3, emp3));
        
//        agency.addHire(new Hire(pr1, emp1));
//        agency.addHire(new Hire(co1, emp1));
//        agency.addHire(new Hire(ad1, emp1));
//        
//
//        agency.addHire(new Hire(pr2, emp2));
//        agency.addHire(new Hire(co2, emp2));
//
//        agency.addHire(new Hire(ad3, emp3));
//        agency.addHire(new Hire(co3, emp3));

    }
}
