package qlttth.Class;

import com.microsoft.sqlserver.jdbc.SQLServerXADataSource;
import java.sql.*;
import qlttth.Form.formDangNhap;

public class QLTTTH {
    public static void main(String[] args) {
        
        var server = "DESKTOP-0EV3HR0\\SQLEXPRESS";
        var user = "sa";
        var password = "123456";
        var db = "test";
        var port = 1433;
        
        SQLServerXADataSource ds = new SQLServerXADataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        
        try (Connection conn = ds.getConnection())
        {
            System.out.println("Ket noi thanh cong!!");
            System.out.println(conn.getCatalog());
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        formDangNhap dangNhapForm = new formDangNhap();
        dangNhapForm.setLocationRelativeTo(null);
        dangNhapForm.setVisible(true);
    }
    
}
