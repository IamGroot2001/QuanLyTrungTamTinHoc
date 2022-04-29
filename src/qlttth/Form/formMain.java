/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlttth.Form;

import qlttth.Panel.panelAddNewClass;
import qlttth.Panel.panelAddNewCourse;
import qlttth.Panel.panelManageTeacher;
import qlttth.Panel.panelManageCourse;
import qlttth.Panel.panelAddNewTeacher;
import qlttth.Panel.panelManageClass;
import qlttth.Panel.panelViewProfile;
import qlttth.Panel.panelViewBill;
import qlttth.Panel.panelManageStudent;
import qlttth.Panel.panelAddNewStudent;
import java.security.MessageDigest;
import javax.swing.JOptionPane;

/**
 *
 * @author daoho
 */
public class formMain extends javax.swing.JFrame {
    private panelViewProfile profilePanel;
    private panelAddNewStudent registerStudentPanel;
    private panelAddNewCourse newCourse;
    private panelManageStudent manageStudent;
    private panelManageCourse manageCourse;
    private panelAddNewTeacher registerTeacher;
    private panelManageTeacher manageTeacher;
    private panelAddNewClass addNewClass;
    private panelManageClass manageClass;
    private panelViewBill bill;
    //private RegisterTeacherPanel registerTeacherPanel;
    /**
     * Creates new form MainForm
     */
    public formMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tplCuaSoChinh = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuViewProfile = new javax.swing.JMenuItem();
        menuLogOut = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuRegisterStudent = new javax.swing.JMenuItem();
        menuManageStudent = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuRegisterTeacher = new javax.swing.JMenuItem();
        menuManageTeacher = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuAddNewCourse = new javax.swing.JMenuItem();
        menuManageCourse = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        menuAddNewClass = new javax.swing.JMenuItem();
        menuManageClass = new javax.swing.JMenuItem();
        menuBill = new javax.swing.JMenu();
        menuViewBill = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tplCuaSoChinh.setBackground(new java.awt.Color(137, 196, 244));

        jPanel3.setBackground(new java.awt.Color(103, 128, 159));
        jPanel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tplCuaSoChinh.addTab("", jPanel1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Welcome To Informatic Centre");

        jMenuBar1.setForeground(new java.awt.Color(37, 41, 88));

        jMenu3.setText("Account");

        menuViewProfile.setText("View Profile");
        menuViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuViewProfileActionPerformed(evt);
            }
        });
        jMenu3.add(menuViewProfile);

        menuLogOut.setText("Log Out");
        menuLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogOutActionPerformed(evt);
            }
        });
        jMenu3.add(menuLogOut);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu3.add(menuExit);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Student");

        menuRegisterStudent.setText("Register Student");
        menuRegisterStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegisterStudentActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegisterStudent);

        menuManageStudent.setText("Manage Student");
        menuManageStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageStudentActionPerformed(evt);
            }
        });
        jMenu1.add(menuManageStudent);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Teacher");

        menuRegisterTeacher.setText("Register Teacher");
        menuRegisterTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegisterTeacherActionPerformed(evt);
            }
        });
        jMenu2.add(menuRegisterTeacher);

        menuManageTeacher.setText("Manage Teacher");
        menuManageTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageTeacherActionPerformed(evt);
            }
        });
        jMenu2.add(menuManageTeacher);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Course");

        menuAddNewCourse.setText("Add New Course");
        menuAddNewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddNewCourseActionPerformed(evt);
            }
        });
        jMenu4.add(menuAddNewCourse);

        menuManageCourse.setText("Manage Course");
        menuManageCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageCourseActionPerformed(evt);
            }
        });
        jMenu4.add(menuManageCourse);

        jMenuBar1.add(jMenu4);

        jMenu9.setText("Class");

        menuAddNewClass.setText("Add New Class");
        menuAddNewClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddNewClassActionPerformed(evt);
            }
        });
        jMenu9.add(menuAddNewClass);

        menuManageClass.setText("Manage Class");
        menuManageClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageClassActionPerformed(evt);
            }
        });
        jMenu9.add(menuManageClass);

        jMenuBar1.add(jMenu9);

        menuBill.setText("Bill");

        menuViewBill.setText("View Bill");
        menuViewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuViewBillActionPerformed(evt);
            }
        });
        menuBill.add(menuViewBill);

        jMenuBar1.add(menuBill);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tplCuaSoChinh)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tplCuaSoChinh))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuRegisterStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegisterStudentActionPerformed
        tplCuaSoChinh.removeAll();
        registerStudentPanel = new panelAddNewStudent();
        tplCuaSoChinh.addTab("Register Student", registerStudentPanel);
    }//GEN-LAST:event_menuRegisterStudentActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        int response = JOptionPane.showConfirmDialog (this, "Do you want to exit?","Comfirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            this.dispose();
        }
        else if (response == JOptionPane.NO_OPTION){

        }
        else if (response == JOptionPane.CLOSED_OPTION){

        }
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogOutActionPerformed

        int response = JOptionPane.showConfirmDialog (this, "Do you want to log out?","Comfirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            formDangNhap dangNhapForm = new formDangNhap();
            dangNhapForm.setLocationRelativeTo(null);
            dangNhapForm.setVisible(true);

        }
        else if (response == JOptionPane.NO_OPTION){

        }
        else if (response == JOptionPane.CLOSED_OPTION){

        }

    }//GEN-LAST:event_menuLogOutActionPerformed

    private void menuViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuViewProfileActionPerformed
        tplCuaSoChinh.removeAll();
        profilePanel = new panelViewProfile();
        tplCuaSoChinh.addTab("Profile", profilePanel);
    }//GEN-LAST:event_menuViewProfileActionPerformed

    private void jPanel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3AncestorAdded

    private void menuAddNewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddNewCourseActionPerformed
        tplCuaSoChinh.removeAll();
        newCourse = new panelAddNewCourse();
        tplCuaSoChinh.addTab("New Course", newCourse);
    }//GEN-LAST:event_menuAddNewCourseActionPerformed

    private void menuManageStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageStudentActionPerformed
        tplCuaSoChinh.removeAll();
        manageStudent = new panelManageStudent();
        tplCuaSoChinh.addTab("Manage Student", manageStudent);
    }//GEN-LAST:event_menuManageStudentActionPerformed

    private void menuManageCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageCourseActionPerformed
        tplCuaSoChinh.removeAll();
        manageCourse = new panelManageCourse();
        tplCuaSoChinh.addTab("Manage Course", manageCourse);
    }//GEN-LAST:event_menuManageCourseActionPerformed

    private void menuRegisterTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegisterTeacherActionPerformed
        tplCuaSoChinh.removeAll();
        registerTeacher = new panelAddNewTeacher();
        tplCuaSoChinh.addTab("Register Teacher",registerTeacher);
    }//GEN-LAST:event_menuRegisterTeacherActionPerformed

    private void menuManageTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageTeacherActionPerformed
        tplCuaSoChinh.removeAll();
        manageTeacher = new panelManageTeacher();
        tplCuaSoChinh.addTab("Manage Teahcer",manageTeacher);
    }//GEN-LAST:event_menuManageTeacherActionPerformed

    private void menuAddNewClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddNewClassActionPerformed
        tplCuaSoChinh.removeAll();
        addNewClass = new panelAddNewClass();
        tplCuaSoChinh.addTab("Add New Class", addNewClass);
    }//GEN-LAST:event_menuAddNewClassActionPerformed

    private void menuManageClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageClassActionPerformed
        tplCuaSoChinh.removeAll();
        manageClass = new panelManageClass();
        tplCuaSoChinh.addTab("Manage Class",manageClass);
    }//GEN-LAST:event_menuManageClassActionPerformed

    private void menuViewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuViewBillActionPerformed
        tplCuaSoChinh.removeAll();
        bill = new panelViewBill();
        tplCuaSoChinh.addTab("View Bill", bill);
    }//GEN-LAST:event_menuViewBillActionPerformed

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
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new formMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem menuAddNewClass;
    private javax.swing.JMenuItem menuAddNewCourse;
    private javax.swing.JMenu menuBill;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuLogOut;
    private javax.swing.JMenuItem menuManageClass;
    private javax.swing.JMenuItem menuManageCourse;
    private javax.swing.JMenuItem menuManageStudent;
    private javax.swing.JMenuItem menuManageTeacher;
    private javax.swing.JMenuItem menuRegisterStudent;
    private javax.swing.JMenuItem menuRegisterTeacher;
    private javax.swing.JMenuItem menuViewBill;
    private javax.swing.JMenuItem menuViewProfile;
    private javax.swing.JTabbedPane tplCuaSoChinh;
    // End of variables declaration//GEN-END:variables
}