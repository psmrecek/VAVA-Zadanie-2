/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sk.stu.fiit.agency.Agency;
import sk.stu.fiit.agency.InputSanitizer;
import sk.stu.fiit.demos.DemoInputs;
import sk.stu.fiit.employers.Employer;
import sk.stu.fiit.hires.Hire;
import sk.stu.fiit.specialists.Specialist;

/**
 *
 * @author PeterSmrecek
 */
public class Main_window extends javax.swing.JFrame {

    /**
     * Creates new form Main_window
     */
    public Main_window() {
        initComponents();

        
        DemoInputs.demoSpecialists(agency);
        updateAll();
        
//        jLabel1.setIcon(agency.getListEmployers().get(0).getIcon());
//        jLabel2.setIcon(agency.getListEmployers().get(1).getIcon());
//        jLabel3.setIcon(agency.getListEmployers().get(2).getIcon());
    }
    
    private Agency agency = new Agency();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        buttonPnl = new javax.swing.JPanel();
        addSpecBtn = new javax.swing.JButton();
        viewSpecBtn = new javax.swing.JButton();
        addEmpBtn = new javax.swing.JButton();
        showEmpBtn = new javax.swing.JButton();
        hireSpecBtn = new javax.swing.JButton();
        editSpecBtn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        programmerScroll = new javax.swing.JScrollPane();
        programmerTbl = new javax.swing.JTable();
        employersScroll = new javax.swing.JScrollPane();
        employersTbl = new javax.swing.JTable();
        consultantScroll = new javax.swing.JScrollPane();
        consultantTbl = new javax.swing.JTable();
        adminScroll = new javax.swing.JScrollPane();
        adminTbl = new javax.swing.JTable();
        hiresScroll = new javax.swing.JScrollPane();
        hiresTbl = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonPnl.setBackground(new java.awt.Color(255, 255, 255));
        buttonPnl.setOpaque(false);
        buttonPnl.setLayout(new javax.swing.BoxLayout(buttonPnl, javax.swing.BoxLayout.LINE_AXIS));

        addSpecBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addSpecBtn.setText("Pridať špecialistu");
        addSpecBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addSpecBtnMouseReleased(evt);
            }
        });
        buttonPnl.add(addSpecBtn);

        viewSpecBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewSpecBtn.setText("Zobraziť špecialistu");
        viewSpecBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                viewSpecBtnMouseReleased(evt);
            }
        });
        buttonPnl.add(viewSpecBtn);

        addEmpBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addEmpBtn.setText("Pridať zamestnávateľa");
        addEmpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addEmpBtnMouseReleased(evt);
            }
        });
        buttonPnl.add(addEmpBtn);

        showEmpBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showEmpBtn.setText("Zobraziť zamestnávateľa");
        showEmpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                showEmpBtnMouseReleased(evt);
            }
        });
        buttonPnl.add(showEmpBtn);

        hireSpecBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hireSpecBtn.setText("Najať špecialistov");
        hireSpecBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hireSpecBtnMouseReleased(evt);
            }
        });
        buttonPnl.add(hireSpecBtn);

        editSpecBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editSpecBtn.setText("Upraviť prenájom");
        editSpecBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editSpecBtnMouseReleased(evt);
            }
        });
        buttonPnl.add(editSpecBtn);

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setText("jButton7");
        buttonPnl.add(jButton7);

        desktopPane.add(buttonPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 1240, 30));

        programmerScroll.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabuľka programátorov", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        programmerScroll.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        programmerTbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        programmerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meno", "Cena za deň", "Dĺžka praxe", "Vzdelanie", "Certifikáty", "Zamestnaný", "Najať"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        programmerTbl.getTableHeader().setReorderingAllowed(false);
        programmerScroll.setViewportView(programmerTbl);
        if (programmerTbl.getColumnModel().getColumnCount() > 0) {
            programmerTbl.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        desktopPane.add(programmerScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1260, 150));

        employersScroll.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabuľka zamestnávateľov", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        employersScroll.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        employersTbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employersTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Názov", "Oblasť", "Počet zamestnancov", "Logo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employersTbl.getTableHeader().setReorderingAllowed(false);
        employersScroll.setViewportView(employersTbl);
        if (employersTbl.getColumnModel().getColumnCount() > 0) {
            employersTbl.getColumnModel().getColumn(3).setHeaderValue("Logo");
        }

        desktopPane.add(employersScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 630, 150));

        consultantScroll.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabuľka konzultantov", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        consultantScroll.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        consultantTbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        consultantTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meno", "Cena za deň", "Dĺžka praxe", "Vzdelanie", "Certifikáty", "Zamestnaný", "Najať"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        consultantTbl.getTableHeader().setReorderingAllowed(false);
        consultantScroll.setViewportView(consultantTbl);
        if (consultantTbl.getColumnModel().getColumnCount() > 0) {
            consultantTbl.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        desktopPane.add(consultantScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1260, 150));

        adminScroll.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabuľka administrátorov", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        adminScroll.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        adminTbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adminTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meno", "Cena za deň", "Dĺžka praxe", "Vzdelanie", "Certifikáty", "Zamestnaný", "Najať"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        adminTbl.getTableHeader().setReorderingAllowed(false);
        adminScroll.setViewportView(adminTbl);
        if (adminTbl.getColumnModel().getColumnCount() > 0) {
            adminTbl.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        desktopPane.add(adminScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 1260, 150));

        hiresScroll.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabuľka prenájmov", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        hiresScroll.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        hiresTbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hiresTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Zemestnávateľ", "Počet zamestnancov v prenájme", "Dátum a čas vytvorenia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        hiresTbl.getTableHeader().setReorderingAllowed(false);
        hiresScroll.setViewportView(hiresTbl);
        if (hiresTbl.getColumnModel().getColumnCount() > 0) {
            hiresTbl.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        desktopPane.add(hiresScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 620, 150));

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void hireSpecBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hireSpecBtnMouseReleased
        // TODO add your handling code here:
        selectionError();
    }//GEN-LAST:event_hireSpecBtnMouseReleased

    private void viewSpecBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSpecBtnMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_viewSpecBtnMouseReleased

    private void addEmpBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmpBtnMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmpBtnMouseReleased

    private void showEmpBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showEmpBtnMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_showEmpBtnMouseReleased

    private void editSpecBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSpecBtnMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_editSpecBtnMouseReleased

    private void addSpecBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSpecBtnMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_addSpecBtnMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton addEmpBtn;
    private javax.swing.JButton addSpecBtn;
    private javax.swing.JScrollPane adminScroll;
    private javax.swing.JTable adminTbl;
    private javax.swing.JPanel buttonPnl;
    private javax.swing.JScrollPane consultantScroll;
    private javax.swing.JTable consultantTbl;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JButton editSpecBtn;
    private javax.swing.JScrollPane employersScroll;
    private javax.swing.JTable employersTbl;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton hireSpecBtn;
    private javax.swing.JScrollPane hiresScroll;
    private javax.swing.JTable hiresTbl;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JScrollPane programmerScroll;
    private javax.swing.JTable programmerTbl;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JButton showEmpBtn;
    private javax.swing.JButton viewSpecBtn;
    // End of variables declaration//GEN-END:variables

    public void updateAll() {
        populateTableOfSpecialists(programmerTbl, agency.getListProgrammers());
        populateTableOfSpecialists(consultantTbl, agency.getListConsultants());
        populateTableOfSpecialists(adminTbl, agency.getListAdministrators());
        populateTableOfHires(hiresTbl);
        populateTableOfEmployers(employersTbl);
    }
    
    public void selectionError(){
        
        int employerTableIndex = getRow(employersTbl, "Nie je vybraný žiaden zamestnávateľ z tabuľky!");
        if (employerTableIndex == -1) {
            return;
        }
        
        Employer empToHire = agency.getEmployer(employerTableIndex);
        ArrayList<Specialist> specialistsToHire = new ArrayList<>();
        
        DefaultTableModel modelProgrammer = (DefaultTableModel) programmerTbl.getModel();
        for (int i = 0; i < modelProgrammer.getRowCount(); i++) {
            boolean selection = (boolean) modelProgrammer.getValueAt(i, 6);
            if (selection) {
                if (agency.getProgrammer(i).isHired()) {
                    JOptionPane.showMessageDialog(rootPane, 
                        "Nie je možné najať programátora " + agency.getProgrammer(i).getBasicInfo().getName() + " pretože už je najatý niekým iným!", 
                        "Chyba!", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    specialistsToHire.add(agency.getProgrammer(i));
                }
            }
        }
        
        DefaultTableModel modelConsultant = (DefaultTableModel) consultantTbl.getModel();
        for (int i = 0; i < modelConsultant.getRowCount(); i++) {
            boolean selection = (boolean) modelConsultant.getValueAt(i, 6);
            if (selection) {
                if (agency.getConsultant(i).isHired()) {
                    JOptionPane.showMessageDialog(rootPane,
                            "Nie je možné najať konzultanta " + agency.getConsultant(i).getBasicInfo().getName() + " pretože už je najatý niekým iným!",
                            "Chyba!", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    specialistsToHire.add(agency.getConsultant(i));
                }
            }
        }
        
        DefaultTableModel modelAdministrator = (DefaultTableModel) adminTbl.getModel();
        for (int i = 0; i < modelAdministrator.getRowCount(); i++) {
            boolean selection = (boolean) modelAdministrator.getValueAt(i, 6);
            if (selection) {
                if (agency.getAdministrator(i).isHired()) {
                    JOptionPane.showMessageDialog(rootPane,
                            "Nie je možné najať administrátora " + agency.getAdministrator(i).getBasicInfo().getName() + " pretože už je najatý niekým iným!",
                            "Chyba!", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    specialistsToHire.add(agency.getAdministrator(i));
                }
            } 
        }
        
        if (specialistsToHire.size() == 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "Nie je možné najať nulový počet špecialistov!",
                    "Chyba!", JOptionPane.ERROR_MESSAGE);
        } else{
            agency.addHire(new Hire(specialistsToHire, empToHire));
        }
        
        
        
        
        updateAll();
    }
    
    public int getRow(JTable table, String message) {
        int index = table.getSelectedRow();

        if (InputSanitizer.isPositiveInt(index)) {
            return index;
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    message,
                    "Chyba!", JOptionPane.ERROR_MESSAGE);
        }
        return -1;
    }
    
    public void deleteRows(DefaultTableModel model) {
        if (model.getRowCount() > 0) {
            for (int i = model.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
    }

    public void populateTableOfSpecialists(JTable table, ArrayList<Specialist> list) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        deleteRows(model);

        int numberOfColumns = table.getColumnCount();
        Object[] rowData = new Object[numberOfColumns];
        
        for (int i = 0; i < list.size(); i++) {
            
            rowData[0] = list.get(i).getBasicInfo().getName();
            rowData[1] = list.get(i).getBasicInfo().getMan_day().toString();
            rowData[2] = list.get(i).getBasicInfo().getLength_practise();
            rowData[3] = list.get(i).getBasicInfo().getEducation();
            rowData[4] = list.get(i).getBasicInfo().getCertificates();
            rowData[5] = list.get(i).isHiredText();
            rowData[6] = false;
            
            model.addRow(rowData);
            
        }
    }
    
    public void populateTableOfEmployers(JTable table){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        deleteRows(model);

        int numberOfColumns = table.getColumnCount();
        Object[] rowData = new Object[numberOfColumns];
        ArrayList<Employer> list = agency.getListEmployers();
        
        for (int i = 0; i < list.size(); i++) {
            
            rowData[0] = list.get(i).getName();
            rowData[1] = list.get(i).getField();
            rowData[2] = list.get(i).getNumberOfEmployees();
            rowData[3] = list.get(i).getIcon();
            
            model.addRow(rowData);
            
        }
    }
    
    public void populateTableOfHires(JTable table){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        deleteRows(model);

        int numberOfColumns = table.getColumnCount();
        Object[] rowData = new Object[numberOfColumns];
        ArrayList<Hire> list = agency.getListHires();
        
        for (int i = 0; i < list.size(); i++) {
            
            rowData[0] = i + 1;
            rowData[1] = list.get(i).getEmployer().getName();
            rowData[2] = list.get(i).getNumberOfHired();
            rowData[3] = list.get(i).getDateString();
            
            model.addRow(rowData);
            
        }
    }

}
