/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlttth.Panel;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.*;
import javax.swing.JOptionPane;

/**
 *
 * @author daoho
 */
public class panelAddNewClass extends javax.swing.JPanel {

    /**
     * Creates new form AddNewClass
     */
    public panelAddNewClass() {
        initComponents();
        initComboTeacher();
        initComboCourse();
        txtCourseName.setEditable(false);
        txtDateStart.setEditable(false);
        txtDateEnd.setEditable(false);
        txtDateStudy.setEditable(false);
        txtTimeStudy.setEditable(false);
        txtTen.setEditable(false);
        txtHo.setEditable(false);
    }
    
    public void initComboCourse()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
            java.sql.Connection conn = DriverManager.getConnection(url);
            String query = "SELECT MaKhoaHoc FROM KhoaHoc";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            cmbChooseCourse.removeAllItems();
            while (rs.next())
            {
                cmbChooseCourse.addItem(rs.getString("MaKhoaHoc"));
            }
            rs.close();
            conn.close();
            pst.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void initComboTeacher()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
            java.sql.Connection conn = DriverManager.getConnection(url);
            String query = "SELECT MaGV FROM GiangVien";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            cmbChooseTeacher.removeAllItems();
            while (rs.next())
            {
                cmbChooseTeacher.addItem(rs.getString("MaGV"));
            }
            rs.close();
            conn.close();
            pst.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbChooseCourse = new javax.swing.JComboBox<>();
        txtClassID = new javax.swing.JTextField();
        txtClassName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbChooseTeacher = new javax.swing.JComboBox<>();
        nLab = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDateStart = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDateEnd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDateStudy = new javax.swing.JTextField();
        txtTimeStudy = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtHo = new javax.swing.JTextField();

        jLabel7.setText("Choose Course:");

        cmbChooseCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChooseCourseActionPerformed(evt);
            }
        });

        txtClassName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClassNameKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Class Information");

        jLabel2.setText("Class ID:");

        jLabel3.setText("Class Name:");

        jLabel9.setText("Choose Teacher:");

        nLab.setText("jLabel4");

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Course Info");

        jLabel5.setText("Course Name:");

        jLabel6.setText("Date Start:");

        jLabel8.setText("Date End:");

        jLabel10.setText("Date Study:");

        jLabel11.setText("Time Study:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDateStudy, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDateStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDateEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txtTimeStudy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbChooseCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtClassID)
                                            .addComponent(txtClassName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(nLab))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1)
                                            .addComponent(cmbChooseTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtClassID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbChooseCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbChooseTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDateStudy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimeStudy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jLabel10))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtClassNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClassNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtClassName.getText());
        if(!match.matches()){
            nLab.setText("incorrect");
        }
        else{
           nLab.setText(null);
        }
    }//GEN-LAST:event_txtClassNameKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try
        {
            //check nhap du lieu trong
            if(txtClassID.getText().isEmpty()|| txtClassName.getText().isEmpty()
              ||cmbChooseCourse.getSelectedIndex() == -1|| cmbChooseTeacher.getSelectedIndex() == -1)
            {
                JOptionPane.showMessageDialog(null,"Please fill in the blanks!!");
            }
            else
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
                //Connection conn = (Connection) DriverManager.getConnection(url);
                java.sql.Connection conn = DriverManager.getConnection(url);
                String query = "INSERT INTO [dbo].[LopHoc]([MaLH],[TenLH],[MaKhoaHoc],[MaGV])values(?,?,?,?)";
                PreparedStatement pst = conn.prepareStatement(query);
                
                //insert du lieu
                pst.setString(1, txtClassID.getText());
                pst.setString(2, txtClassName.getText());
                pst.setString(3, (String)cmbChooseCourse.getSelectedItem());
                pst.setString(4, (String)cmbChooseTeacher.getSelectedItem());
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Inserted successfully!!");
            }
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "The Class is existed!! Please try another!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbChooseCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChooseCourseActionPerformed
        // TODO add your handling code here:
        try
        {
            String maKhoaHoc = (String) cmbChooseCourse.getSelectedItem();
            String maGiangVien = (String) cmbChooseTeacher.getSelectedItem();
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
            java.sql.Connection conn = DriverManager.getConnection(url);
            
            // showCourseName
            String queryShowCourseName = "SELECT TenKhoaHoc FROM KhoaHoc WHERE MaKhoaHoc ='"+maKhoaHoc+"'";
          
            Statement stat1 = conn.createStatement();
            ResultSet rs1 = stat1.executeQuery(queryShowCourseName);
            
            if(rs1.next() == true)
            {
                txtCourseName.setText(rs1.getString("TenKhoaHoc"));
            }
            
            // showDayStart
            String queryShowDayStart = "SELECT NgayBatDau FROM KhoaHoc WHERE MaKhoaHoc ='"+maKhoaHoc+"'";
          
            Statement stat2 = conn.createStatement();
            ResultSet rs2 = stat2.executeQuery(queryShowDayStart);
            
            if(rs2.next() == true)
            {
                txtDateStart.setText(rs2.getString("NgayBatDau"));
            }
            
            // showDayEnd
            String queryShowDayEnd = "SELECT NgayKetThuc FROM KhoaHoc WHERE MaKhoaHoc ='"+maKhoaHoc+"'";
          
            Statement stat3 = conn.createStatement();
            ResultSet rs3 = stat3.executeQuery(queryShowDayEnd);
            
            if(rs3.next() == true)
            {
                txtDateEnd.setText(rs3.getString("NgayKetThuc"));
            }
            
            // showDayStudy
            String queryShowDayStudy = "SELECT NgayHoc FROM KhoaHoc WHERE MaKhoaHoc ='"+maKhoaHoc+"'";
          
            Statement stat4 = conn.createStatement();
            ResultSet rs4 = stat4.executeQuery(queryShowDayStudy);
            
            if(rs4.next() == true)
            {
                txtDateStudy.setText(rs4.getString("NgayHoc"));
            }
            
            // showTimeStudy
            String queryShowTimeStudy = "SELECT ThoiGianHoc FROM KhoaHoc WHERE MaKhoaHoc ='"+maKhoaHoc+"'";
          
            Statement stat5 = conn.createStatement();
            ResultSet rs5 = stat5.executeQuery(queryShowTimeStudy);
            
            if(rs5.next() == true)
            {
                txtTimeStudy.setText(rs5.getString("ThoiGianHoc"));
            }
            
            
            // show TeacherFirstName
            String queryShowTeacherFirstName = "SELECT TenGV FROM GiangVien WHERE MaGV ='"+maGiangVien+"'";
          
            Statement stat6 = conn.createStatement();
            ResultSet rs6 = stat6.executeQuery(queryShowTeacherFirstName);
            
            if(rs6.next() == true)
            {
                txtTen.setText(rs6.getString("TenGV"));
            }
            
            // show TeacherLastName
            String queryShowTeacherLastName = "SELECT HoGV FROM GiangVien WHERE MaGV ='"+maGiangVien+"'";
          
            Statement stat7 = conn.createStatement();
            ResultSet rs7 = stat7.executeQuery(queryShowTeacherLastName);
            
            if(rs7.next() == true)
            {
                txtHo.setText(rs7.getString("HoGV"));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_cmbChooseCourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbChooseCourse;
    private javax.swing.JComboBox<String> cmbChooseTeacher;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nLab;
    private javax.swing.JTextField txtClassID;
    private javax.swing.JTextField txtClassName;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtDateEnd;
    private javax.swing.JTextField txtDateStart;
    private javax.swing.JTextField txtDateStudy;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimeStudy;
    // End of variables declaration//GEN-END:variables
}
