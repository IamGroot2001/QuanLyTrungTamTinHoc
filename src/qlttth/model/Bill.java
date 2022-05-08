/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttth.model;

import java.util.Date;

/**
 *
 * @author daoho
 */
public class Bill {
    int MaHD, Tong;
    Date NgayLapHoaDon;
    String TaiKhoan, MaLH;

    public Bill() {
    }

    public Bill(int MaHD, int Tong, Date NgayLapHoaDon, String TaiKhoan, String MaLH) {
        this.MaHD = MaHD;
        this.Tong = Tong;
        this.NgayLapHoaDon = NgayLapHoaDon;
        this.TaiKhoan = TaiKhoan;
        this.MaLH = MaLH;
    }

    //get
    public int getMaHD() {
        return MaHD;
    }

    public int getTong() {
        return Tong;
    }

    public Date getNgayLapHoaDon() {
        return NgayLapHoaDon;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public String getMaLH() {
        return MaLH;
    }
    
    //set
    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public void setTong(int Tong) {
        this.Tong = Tong;
    }

    public void setNgayLapHoaDon(Date NgayLapHoaDon) {
        this.NgayLapHoaDon = NgayLapHoaDon;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public void setMaLH(String MaLH) {
        this.MaLH = MaLH;
    }
    
    
    
    
}
