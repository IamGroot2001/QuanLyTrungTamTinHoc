/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlttth.Panel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlttth.model.Bill;
/**
 *
 * @author daoho
 */
public class panelViewBill extends javax.swing.JPanel {

    /**
     * Creates new form Bill
     */
    public panelViewBill() {
        initComponents();
        showCourse();
    }

    public ArrayList<Bill> BillList()
    {
        ArrayList<Bill> billList = new ArrayList<>();
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=test;user=sa;password=123456";
            Connection conn = DriverManager.getConnection(url);
            String query = "SELECT * FROM HoaDon";
            Statement st = (Statement) conn.createStatement();
            ResultSet rs = (ResultSet) st.executeQuery(query);
            Bill bill;
            while (rs.next())
            {
                bill = new Bill(rs.getInt("MaHD"), rs.getInt("Tong"), rs.getDate("NgayLapHD"), rs.getString("TaiKhoan"), rs.getString("MaLH"), rs.getString("MaHV"));
                billList.add(bill);
            }    
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            System.out.print(ex);
            ex.printStackTrace();
        }
        return billList;
    }
    
    public void showCourse()
    {
        ArrayList<Bill> list = BillList();
        DefaultTableModel model = (DefaultTableModel)tblBill.getModel();
        Object[] row = new Object[6];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getMaHD();
            row[1] = list.get(i).getNgayLapHoaDon();
            row[2] = list.get(i).getTaiKhoan();
            row[3] = list.get(i).getMaLH();
            row[4] = list.get(i).getMaHV();
            row[5] = list.get(i).getTong();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBill = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(103, 128, 159));

        tblBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill ID", "Date", "Account", "Class", "MaHV", "Total"
            }
        ));
        jScrollPane2.setViewportView(tblBill);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBill;
    // End of variables declaration//GEN-END:variables
}
