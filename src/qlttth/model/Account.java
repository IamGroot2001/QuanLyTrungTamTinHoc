/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttth.model;

/**
 *
 * @author daoho
 */
public class Account {
    String TaiKhoan, MatKhau, Ten, Ho, GioiTinh, DiaCHi;
    int Tuoi, SoDienThoai;

    public Account() {
    }

    public Account(String TaiKhoan, String MatKhau, String Ten, String Ho, String GioiTinh, String DiaCHi, int Tuoi, int SoDienThoai) {
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.Ten = Ten;
        this.Ho = Ho;
        this.GioiTinh = GioiTinh;
        this.DiaCHi = DiaCHi;
        this.Tuoi = Tuoi;
        this.SoDienThoai = SoDienThoai;
    }
    
    //get
    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public String getTen() {
        return Ten;
    }

    public String getHo() {
        return Ho;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public String getDiaCHi() {
        return DiaCHi;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public int getSoDienThoai() {
        return SoDienThoai;
    }
    
    //set
    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setDiaCHi(String DiaCHi) {
        this.DiaCHi = DiaCHi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public void setSoDienThoai(int SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }
    
}
