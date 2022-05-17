/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlttth.Panel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import qlttth.model.Classes;

/**
 *
 * @author daoho
 */
public class panelManageClass extends javax.swing.JPanel {

    /**
     * Creates new form ManageClass
     */
    public panelManageClass() {
        initComponents();
        showClasses();
        txtCourseName.setEditable(false);
        initCmbCourseID();
        initCmbTeacherID();
        txtClassID.setEditable(false);
    }
    
    public void initCmbCourseID(){
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
            java.sql.Connection conn = DriverManager.getConnection(url);
            String query = "SELECT MaKhoaHoc FROM KhoaHoc";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            cmbCourseID.removeAllItems();
            while (rs.next())
            {
                  cmbCourseID.addItem(rs.getString("MaKhoaHoc"));      
            }
            rs.close();
            pst.close();
            conn.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //e.printStackTrace();
        }
    }
    
    public void initCmbTeacherID(){
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
            java.sql.Connection conn = DriverManager.getConnection(url);
            String query = "SELECT MaGV FROM GiangVien";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            cmbTeacherID.removeAllItems();
            while (rs.next())
            {
                  cmbTeacherID.addItem(rs.getString("MaGV"));      
            }
            rs.close();
            pst.close();
            conn.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //e.printStackTrace();
        }
    }

    public ArrayList<Classes> ClassesList()
    {
        ArrayList<Classes> classesList = new ArrayList<>();
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
            Connection conn = DriverManager.getConnection(url);
            String query = "SELECT * FROM LopHoc";
            Statement st = (Statement) conn.createStatement();
            ResultSet rs = (ResultSet) st.executeQuery(query);
            Classes classes;
            while (rs.next())
            {
                classes = new Classes(rs.getString("MaLH"), rs.getString("TenLH"), rs.getString("MaKhoaHoc"), rs.getString("MaGV"));
                classesList.add(classes);
            }    
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            System.out.print(ex);
            //ex.printStackTrace();
        }
        return classesList;
    }
    
    public void showClasses()
    {
        ArrayList<Classes> list = ClassesList();
        DefaultTableModel model = (DefaultTableModel)tblClass.getModel();
        Object[] row = new Object[4];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getMaLH();
            row[1] = list.get(i).getTenLH();
            row[2] = list.get(i).getMaKhoaHoc();
            row[3] = list.get(i).getMaGV();
            model.addRow(row);
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
        txtFind = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClass = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClassID = new javax.swing.JTextField();
        txtClassName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        txtCourseName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbCourseID = new javax.swing.JComboBox<>();
        cmbTeacherID = new javax.swing.JComboBox<>();

        txtFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFindKeyPressed(evt);
            }
        });

        jLabel1.setText("Find:");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tblClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class ID", "Class Name", "Course ID", "Teacher ID"
            }
        ));
        tblClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClassMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblClass);

        jLabel2.setText("Class ID:");

        jLabel3.setText("Class Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Class Information");

        jLabel5.setText("Course ID:");

        jLabel6.setText("Teacher ID:");

        jLabel7.setText("Total:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        jLabel8.setText("Course Name:");

        cmbCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCourseIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset)
                        .addGap(146, 146, 146))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtClassID, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(txtClassName, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbCourseID, 0, 143, Short.MAX_VALUE)
                                    .addComponent(cmbTeacherID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDel)))
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(47, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(btnReset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtClassID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbTeacherID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDel)
                        .addComponent(btnUpdate)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClassMouseClicked
        // TODO add your handling code here:
        try
        {
            int i = tblClass.getSelectedRow();
            TableModel model = tblClass.getModel();
            txtClassID.setText(model.getValueAt(i,0).toString());
            txtClassName.setText(model.getValueAt(i,1).toString());
            cmbCourseID.setSelectedItem(model.getValueAt(i,2).toString());
            cmbTeacherID.setSelectedItem(model.getValueAt(i,3).toString());
        
            String a = (String) cmbCourseID.getSelectedItem();
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
            java.sql.Connection conn = DriverManager.getConnection(url);
            
            String query1 = "SELECT TenKhoaHoc FROM KhoaHoc WHERE MaKhoaHoc = '"+a+"'";
            
            Statement stat1 = conn.createStatement();
            ResultSet rs1 = stat1.executeQuery(query1);
            
            if(rs1.next() == true)
            {
                txtCourseName.setText(rs1.getString("TenKhoaHoc"));
            }
            
            String maLH = txtClassID.getText();
            
            //String query2 = "SELECT COUNT(MaHV) AS \"dem\" FROM HocVien WHERE MaLH = '"+maLH+"' GROUP BY MaHV";
            Statement st = conn.createStatement();
            int count = 0;
            
            ResultSet rs = st.executeQuery("SELECT COUNT(MaHV) FROM HocVien WHERE MaLH = '"+maLH+"'");
            
            while(rs.next())
            {
                count = rs.getInt(1);
                //System.out.println(count);
                String dem = Integer.toString(count);
                txtTotal.setText(dem);
            }
            
//            int dem = (int)st.executeUpdate(query2);
//            System.out.println(st);
            //PreparedStatement pst = conn.prepareStatement(query2);
            //ResultSet rs = pst.executeQuery(query2);
            
            
            
//            String dem = rs.getString("\"dem\"");
            //System.out.println(rs);
            //txtTotal.setText();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error!!");
            //ex.printStackTrace();
        }
        
    }//GEN-LAST:event_tblClassMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try
        {
            if(txtClassID.getText().isEmpty() || txtClassName.getText().isEmpty() || txtCourseName.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please fill in the blanks!!");
            }
            else
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
                Connection conn = DriverManager.getConnection(url);
                
                String lopHocID = txtClassID.getText();
                
                String query = "UPDATE LopHoc SET TenLH=?, MaKhoaHoc=?, MaGV=? WHERE MaLH = '"+lopHocID+"'";
                PreparedStatement pst = conn.prepareStatement(query);
                
                pst.setString(1, txtClassName.getText());
                pst.setString(2, (String)cmbCourseID.getSelectedItem());
                pst.setString(3, (String) cmbTeacherID.getSelectedItem());
                
                pst.executeUpdate();
                
                // code này là de update lai table khi cap nhat
                DefaultTableModel model = (DefaultTableModel)tblClass.getModel();
                model.setRowCount(0);
                showClasses();
                
                JOptionPane.showMessageDialog(null, "Update successfully!!");
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error!!");
            //ex.printStackTrace();
        }
//        DefaultTableModel tblModel  = (DefaultTableModel)tblClass.getModel();
//        if(tblClass.getSelectedRowCount() == 1){
//            String ID = txtClassID.getText();
//            String Name = txtClassName.getText();
//            String coureID = (String) cmbCourseID.getSelectedItem();
//            String teacherID = (String) cmbTeacherID.getSelectedItem();
////            String Adress = txtAddress.getText();
////            String Phone = txtPhone.getText();
//            
//            //set upadte value ont table row
//            tblModel.setValueAt(ID, tblClass.getSelectedRow(), 0);
//            tblModel.setValueAt(Name, tblClass.getSelectedRow(), 1);
//            tblModel.setValueAt(coureID, tblClass.getSelectedRow(), 2);
//            tblModel.setValueAt(teacherID, tblClass.getSelectedRow(), 3);
////            tblModel.setValueAt(Adress, tblClass.getSelectedRow(), 5);
////            tblModel.setValueAt(Phone, tblClass.getSelectedRow(), 6);
//            //tblModel.setValueAt(ID, tblClass.getSelectedRow(), 0);
//            JOptionPane.showMessageDialog(this, "Update Successfully");
//        }else{
//            if(tblClass.getRowCount()==0){
//                JOptionPane.showMessageDialog(this, "Table is Empty...");
//            }else{
//                JOptionPane.showMessageDialog(this, "Please select Single Row for Update...");
//            }
//        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        try
        {
            DefaultTableModel model = (DefaultTableModel) tblClass.getModel();
            if(tblClass.getSelectedRowCount() == 0)
            {
                JOptionPane.showMessageDialog(null, "Please select the row to delete!!");
            }
            else
            {
                int response = JOptionPane.showConfirmDialog (this, "Do you want to delete the class?","Comfirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(response == JOptionPane.YES_OPTION)
                {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
                    Connection conn = DriverManager.getConnection(url);
                
                    String classID = txtClassID.getText();
                
                    String query = "DELETE FROM LopHoc WHERE MaLH='"+classID+"'";
                    PreparedStatement pst = conn.prepareStatement(query);
                
                    pst.executeUpdate();
                
                    model.setRowCount(0);
                    showClasses();
                
                    JOptionPane.showMessageDialog(null, "Delete successfully!!");
                }
                else if (response == JOptionPane.NO_OPTION)
                {
                }
                else if (response == JOptionPane.CLOSED_OPTION)
                {
                }
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "The class contains students!! Can not delete!!");
            //ex.printStackTrace();
        }
//        DefaultTableModel model = (DefaultTableModel) tblClass.getModel();
//        //delete row
//        if(tblClass.getSelectedRowCount() == 1){
//            model.removeRow(tblClass.getSelectedRow());
//        }else{
//            if(tblClass.getRowCount() == 0){
//                JOptionPane.showMessageDialog(this, "Table is Empty");
//            }else{
//                JOptionPane.showMessageDialog(this, "Please select Single Row For Delete");
//            }
//        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void txtFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblClass.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        tblClass.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtFind.getText().trim()));
    }//GEN-LAST:event_txtFindKeyPressed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtClassID.setText("");
        txtClassName.setText("");
        txtCourseName.setText("");
        txtTotal.setText("");
        txtFind.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void cmbCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCourseIDActionPerformed
        // TODO add your handling code here:
        try
        {
            String maKhoaHoc = (String) cmbCourseID.getSelectedItem();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
            java.sql.Connection conn = DriverManager.getConnection(url);
            
            String query = "SELECT TenKhoaHoc FROM KhoaHoc WHERE MaKhoaHoc ='"+maKhoaHoc+"'";
            
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(query);
            
            if(rs.next() == true)
            {
                txtCourseName.setText(rs.getString("TenKhoaHoc"));
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error!!");
            //ex.printStackTrace();
        }
    }//GEN-LAST:event_cmbCourseIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCourseID;
    private javax.swing.JComboBox<String> cmbTeacherID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblClass;
    private javax.swing.JTextField txtClassID;
    private javax.swing.JTextField txtClassName;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
