/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlttth.Panel;


import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import com.sun.tools.jconsole.JConsoleContext;
import java.util.concurrent.Callable;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author daoho
 */
public class panelAddNewStudent extends javax.swing.JPanel {
    static String taiKhoan;

    /**
     * Creates new form RegisterStudentPanel
     */
    public panelAddNewStudent(String _taiKhoan) {
        
        initComponents();
        taiKhoan = _taiKhoan;
        //set lua chon gioi tinh luc dau luon luon hien thi la male
        rdoMale.setSelected(true);
        initComboBoxClass();
        txtCourse.setEnabled(false);
        
    }
    
    public void initComboBoxClass(){
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
            java.sql.Connection conn = DriverManager.getConnection(url);
            String query = "SELECT MaLH FROM LopHoc";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            cmbChooseClass.removeAllItems();
            while (rs.next())
            {
                  cmbChooseClass.addItem(rs.getString("MaLH"));      
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        fnameLab = new javax.swing.JLabel();
        lnameLab = new javax.swing.JLabel();
        aLab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pLab = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rdoMale = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rdoFemale = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbChooseClass = new javax.swing.JComboBox<>();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        txtCourse = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBackground(new java.awt.Color(103, 128, 159));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Student Information");

        jLabel2.setText("First Name:");

        jLabel10.setText("Gender:");

        jLabel3.setText("Last Name:");

        buttonGroup1.add(rdoMale);
        rdoMale.setText("Male");

        jLabel4.setText("Age:");

        buttonGroup1.add(rdoFemale);
        rdoFemale.setText("Female");

        jLabel5.setText("Address:");

        jLabel6.setText("Phone Number:");

        jLabel7.setText("Choose Class:");

        cmbChooseClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChooseClassActionPerformed(evt);
            }
        });

        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyReleased(evt);
            }
        });

        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNameKeyReleased(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });

        jLabel8.setText("Total:");

        btnConfirm.setBackground(new java.awt.Color(210, 215, 211));
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-done-25 .png"))); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel9.setText("Student ID:");

        jLabel11.setText("Course:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(cmbChooseClass, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConfirm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pLab, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoMale)
                        .addGap(18, 18, 18)
                        .addComponent(rdoFemale)
                        .addGap(294, 294, 294))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtLastName)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(aLab, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fnameLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lnameLab, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(207, 207, 207))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnameLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnameLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rdoMale)
                    .addComponent(rdoFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbChooseClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirm)
                .addGap(82, 82, 82))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        try
        {
            //check index null
            if(txtStudentID.getText().isEmpty() || txtFirstName.getText().isEmpty()
               || txtLastName.getText().isEmpty() || txtAge.getText().isEmpty()
               || txtAddress.getText().isEmpty()|| txtPhoneNumber.getText().isEmpty()|| txtTotal.getText().isEmpty()
               ||cmbChooseClass.getSelectedIndex() == -1 )
            {
                JOptionPane.showMessageDialog(null,"Please fill in the blanks!!");
            }
            else
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
                //Connection conn = (Connection) DriverManager.getConnection(url);
                java.sql.Connection conn = DriverManager.getConnection(url);
                
                // add du lieu vao HocVien
                String query1 = "INSERT INTO HocVien(MaHV,TenHV,HoHV,TuoiHV,GioiTinhHV,DiaChiHV,SDTHV,MaLH)values(?,?,?,?,?,?,?,?)";
                PreparedStatement pst1 = conn.prepareStatement(query1);
                
                
                String gender;
                //insert du lieu
                pst1.setString(1, txtStudentID.getText());
                pst1.setString(2, txtFirstName.getText());
                pst1.setString(3, txtLastName.getText());
                pst1.setString(4, txtAge.getText());
                if(rdoMale.isSelected())
                {
                    gender = "Nam";
                    pst1.setString(5, gender);
                }
                else
                {
                    gender = "Nữ";
                    pst1.setString(5, gender);
                }
                pst1.setString(6, txtAddress.getText());
                pst1.setString(7, txtPhoneNumber.getText());
                pst1.setObject(8, cmbChooseClass.getSelectedItem());
                
                String maHV = txtStudentID.getText();
                //System.out.println(maHV);
                //String selectQuery = "SELECT COUNT(*) FROM HocVien WHERE MaHV = '"+maHV+"'";
                //Statement stat = conn.createStatement();
                //ResultSet rs = stat.executeQuery(selectQuery);
                
                //System.out.println(rs.next());
                
                //if(rs.next()==true)
                //{
                    //JOptionPane.showMessageDialog(null, "The Student ID is existed!! Please try another");
                //}
                //else
                //{
                    pst1.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Inserted successfully!!");
                //}
                
                // add du lieu vao hoa don
                String query2 = "INSERT INTO HoaDon(NgayLapHD,TaiKhoan,MaLH,Tong,MaHV)values(?,?,?,?,?)";
                PreparedStatement pst2 = conn.prepareStatement(query2);
                
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
                LocalDateTime now = LocalDateTime.now();  
                //System.out.println(dtf.format(now));
                
                pst2.setString(1, dtf.format(now));
                pst2.setString(2, taiKhoan);
                pst2.setObject(3, cmbChooseClass.getSelectedItem());
                pst2.setString(4, txtTotal.getText());
                pst2.setString(5, txtStudentID.getText());
                
//                ResultSet rs2 = stat.executeQuery(query2);
//                if(rs2.next()==true)
//                {
//                    JOptionPane.showMessageDialog(null, "Can not insert data into bill");
//                }
//                else
//                {
                    pst2.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Inserted data into bill successfully!!");
//                }
                  
                
            }
            
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "The Student ID existed!! Please try another!!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtFirstName.getText());
        if(match.matches()){
            fnameLab.setText("incorrect!");
            JOptionPane.showMessageDialog(this, "First Name is font type");
        }
        else{
           fnameLab.setText(null);
        }
    }//GEN-LAST:event_txtFirstNameKeyReleased

    private void txtLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtLastName.getText());
        if(match.matches()){
            lnameLab.setText("incorrect!");
            JOptionPane.showMessageDialog(this, "Last Name is font type");
        }
        else{
           lnameLab.setText(null);
        }
    }//GEN-LAST:event_txtLastNameKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,2}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtAge.getText());
        if(!match.matches()){
            aLab.setText("incorrect!");
            JOptionPane.showMessageDialog(this, "Age is number type!!!");
        }
        else{
           aLab.setText(null);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtPhoneNumber.getText());
        if(!match.matches()){
            pLab.setText("incorrect!");
            JOptionPane.showMessageDialog(this, "Phone is number type!!!");
        }
        else{
           pLab.setText(null);
        }
    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void cmbChooseClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChooseClassActionPerformed
        try
        {
            String a = (String) cmbChooseClass.getSelectedItem();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
            java.sql.Connection conn = DriverManager.getConnection(url);
            
            String query1 = "select KhoaHoc.TenKhoaHoc from KhoaHoc inner join LopHoc on LopHoc.MaKhoaHoc = KhoaHoc.MaKhoaHoc and MaLH = '"+a+"'";
            
            String query2 = "select KhoaHoc.GiaKhoaHoc from KhoaHoc inner join LopHoc on LopHoc.MaKhoaHoc = KhoaHoc.MaKhoaHoc and MaLH = '"+a+"'";
            
            //PreparedStatement pst1 = conn.prepareStatement(query1);
            Statement stat1 = conn.createStatement();
            ResultSet rs1 = stat1.executeQuery(query1);
            
            //PreparedStatement pst2 = conn.prepareStatement(query2);
            Statement stat2 = conn.createStatement();
            ResultSet rs2 = stat2.executeQuery(query2);
            
            if(rs1.next() == true)
            {
                txtCourse.setText(rs1.getString("TenKhoaHoc"));
            }
            
            if(rs2.next() == true)
            {
                txtTotal.setText(rs2.getString("GiaKhoaHoc"));
            }
        }
        catch(Exception ex)
        {
            //ex.printStackTrace();
        }
        
    }//GEN-LAST:event_cmbChooseClassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aLab;
    private javax.swing.JButton btnConfirm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbChooseClass;
    private javax.swing.JLabel fnameLab;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel lnameLab;
    private javax.swing.JLabel pLab;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
