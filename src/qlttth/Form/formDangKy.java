/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlttth.Form;

import com.sun.tools.jconsole.JConsoleContext;
import java.sql.CallableStatement;
import java.sql.*;
import java.sql.DriverManager;
import java.util.concurrent.Callable;
import javax.swing.JOptionPane;
import java.util.regex.*;

/**
 *
 * @author daoho
 */
public class formDangKy extends javax.swing.JFrame {
    
    /**
     * Creates new form DangKyForm
     */
    public formDangKy() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnReFirstName = new javax.swing.JTextField();
        btnReLastName = new javax.swing.JTextField();
        btnReAge = new javax.swing.JTextField();
        btnReAddress = new javax.swing.JTextField();
        btnRePhoneNumber = new javax.swing.JTextField();
        btnReAccount = new javax.swing.JTextField();
        btnRePassword = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        pLab = new javax.swing.JLabel();
        aLab = new javax.swing.JLabel();
        fnameLab = new javax.swing.JLabel();
        lnameLab = new javax.swing.JLabel();
        mailLab = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rabtnMale = new javax.swing.JRadioButton();
        rabtnFemale = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(52, 45, 113));

        jLabel1.setBackground(new java.awt.Color(52, 45, 113));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-new-view-70.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(52, 45, 113));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name:");

        jLabel3.setBackground(new java.awt.Color(52, 45, 113));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name:");

        jLabel5.setBackground(new java.awt.Color(52, 45, 113));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Age:");

        jLabel6.setBackground(new java.awt.Color(52, 45, 113));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address:");

        jLabel7.setBackground(new java.awt.Color(52, 45, 113));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone Number:");

        jLabel4.setBackground(new java.awt.Color(52, 45, 113));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Account:");

        jLabel8.setBackground(new java.awt.Color(52, 45, 113));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");

        btnConfirm.setBackground(new java.awt.Color(210, 215, 211));
        btnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-done-25 .png"))); // NOI18N
        btnConfirm.setText("Create");
        btnConfirm.setPreferredSize(new java.awt.Dimension(101, 31));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(210, 215, 211));
        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 0, 0));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-close-25.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.setPreferredSize(new java.awt.Dimension(100, 31));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnReFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnReFirstNameKeyReleased(evt);
            }
        });

        btnReLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnReLastNameKeyReleased(evt);
            }
        });

        btnReAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnReAgeKeyReleased(evt);
            }
        });

        btnRePhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRePhoneNumberActionPerformed(evt);
            }
        });
        btnRePhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnRePhoneNumberKeyReleased(evt);
            }
        });

        btnReAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnReAccountKeyReleased(evt);
            }
        });

        pLab.setForeground(new java.awt.Color(255, 255, 0));
        pLab.setText("jLabel9");

        aLab.setForeground(new java.awt.Color(153, 255, 0));
        aLab.setText("jLabel9");

        fnameLab.setForeground(new java.awt.Color(102, 255, 0));
        fnameLab.setText("jLabel9");

        lnameLab.setForeground(new java.awt.Color(204, 255, 0));
        lnameLab.setText("jLabel10");

        mailLab.setForeground(new java.awt.Color(255, 255, 0));
        mailLab.setText("jLabel9");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender:");

        buttonGroup1.add(rabtnMale);
        rabtnMale.setText("Male");

        buttonGroup1.add(rabtnFemale);
        rabtnFemale.setText("Female");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnReAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(btnReLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReFirstName, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fnameLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lnameLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnReAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mailLab, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnReAge, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(aLab, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(rabtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rabtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnReFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fnameLab)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnReLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnameLab))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnReAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(aLab)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rabtnFemale)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(rabtnMale)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnReAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnRePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pLab))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnReAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailLab))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReAccountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnReAccountKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z0-9]{0,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(btnReAccount.getText());
        if(!match.matches()){
            mailLab.setText("incorrect");
        }
        else{
            mailLab.setText(null);
        }
    }//GEN-LAST:event_btnReAccountKeyReleased

    private void btnRePhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRePhoneNumberKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(btnRePhoneNumber.getText());
        if(!match.matches()){
            pLab.setText("incorrect");
        }
        else{
            pLab.setText(null);
        }
    }//GEN-LAST:event_btnRePhoneNumberKeyReleased

    private void btnRePhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRePhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRePhoneNumberActionPerformed

    private void btnReAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnReAgeKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,2}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(btnReAge.getText());
        if(!match.matches()){
            aLab.setText("incorrect");
        }
        else{
            aLab.setText(null);
        }
    }//GEN-LAST:event_btnReAgeKeyReleased

    private void btnReLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnReLastNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(btnReLastName.getText());
        if(!match.matches()){
            lnameLab.setText("incorrect");
        }
        else{
            lnameLab.setText(null);
        }
    }//GEN-LAST:event_btnReLastNameKeyReleased

    private void btnReFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnReFirstNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(btnReFirstName.getText());
        if(!match.matches()){
            fnameLab.setText("incorrect");
        }
        else{
            fnameLab.setText(null);
        }
    }//GEN-LAST:event_btnReFirstNameKeyReleased

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        formDangNhap dangNhapForm = new formDangNhap();
        dangNhapForm.setLocationRelativeTo(null);
        dangNhapForm.setVisible(true);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        String gender;
        try
        {
            if(btnReFirstName.getText().isEmpty() || btnReLastName.getText().isEmpty()
                || btnReAge.getText().isEmpty() || btnRePhoneNumber.getText().isEmpty()
                || btnReAddress.getText().isEmpty() || btnReAccount.getText().isEmpty()
                || btnRePassword.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please fill in the blanks!!");
            }
            else
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
                Connection conn = DriverManager.getConnection(url);
                String query = "INSERT INTO TaiKhoan(Ten, Ho, Tuoi, GioiTinh, DiaChi, SoDienThoai, TaiKhoan, MatKhau)VALUES(?,?,?,?,?,?,?,?) ";
                PreparedStatement pst = conn.prepareStatement(query);

                // insert du lieu vao database o day
                pst.setString(1, btnReFirstName.getText());
                pst.setString(2, btnReLastName.getText());
                pst.setString(3, btnReAge.getText());

                if(rabtnMale.isSelected())
                {
                    gender = "Nam";
                    pst.setString(4, gender);
                }
                else if (rabtnFemale.isSelected())
                {
                    gender = "Nữ";
                    pst.setString(4, gender);
                }

                pst.setString(5, btnReAddress.getText());
                pst.setString(6, btnRePhoneNumber.getText());
                pst.setString(7, btnReAccount.getText());
                pst.setString(8, btnRePassword.getText());

                // o day can co code so sanh xem tai khoan dang nhap co trung voi trong database hay k
                // neu trung thi bat nhap 1 tai khoan khac
                String acc = btnReAccount.getText();
                //String pass = btnRePassword.getText();

                String selectQuery = "SELECT COUNT(*) FROM TaiKhoan WHERE TaiKhoan = '"+acc+"'";
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(selectQuery);

                System.out.println(rs.next());

                if(rs.next()==true)
                {
                    JOptionPane.showMessageDialog(null, "The account is existed!!");
                }
                else
                {
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Inserted successfully!!");
                }
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "The account is existed!! Please try another!!");
            //ex.printStackTrace();
        }
        //        if(btnReFirstName.getText().isEmpty()){
            //            JOptionPane.showMessageDialog(null, "Fist Name is empty!");
            //        }
        //        if(btnReLastName.getText().isEmpty()){
            //            JOptionPane.showMessageDialog(null, "Last Name is empty!");
            //        }
        //        if(btnReAge.getText().isEmpty()){
            //            JOptionPane.showMessageDialog(null, "Last Name is empty!");
            //        }
        //        if(btnRePhoneNumber.getText().isEmpty()){
            //            JOptionPane.showMessageDialog(null, "Phone Number is empty!");
            //        }
        //        if(btnReAddress.getText().isEmpty()){
            //            JOptionPane.showMessageDialog(null, "Address is empty!");
            //        }
        //        if(btnReAccount.getText().isEmpty()){
            //            JOptionPane.showMessageDialog(null, "Account is empty!");
            //        }
        //        if(btnRePassword.getText().isEmpty()){
            //            JOptionPane.showMessageDialog(null, "Password is empty!");
            //        }
        //        String str = "CALL insertAccount('"+firstName+"',"+lastName+",'"
        //                    +age+"', '"+address+"','"+phoneNumber+"','"+account+"','"+password+"');";
    }//GEN-LAST:event_btnConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(formDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formDangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aLab;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JTextField btnReAccount;
    private javax.swing.JTextField btnReAddress;
    private javax.swing.JTextField btnReAge;
    private javax.swing.JTextField btnReFirstName;
    private javax.swing.JTextField btnReLastName;
    private javax.swing.JTextField btnRePassword;
    private javax.swing.JTextField btnRePhoneNumber;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fnameLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lnameLab;
    private javax.swing.JLabel mailLab;
    private javax.swing.JLabel pLab;
    private javax.swing.JRadioButton rabtnFemale;
    private javax.swing.JRadioButton rabtnMale;
    // End of variables declaration//GEN-END:variables
}
