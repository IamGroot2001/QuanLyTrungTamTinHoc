/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttth.model;

/**
 *
 * @author lengo
 */
public class Student {
    private String MaHV,TenHV,HoHV,GioiTinhHV,DiaChiHV,MaLH;
    private int TuoiHV,SDTHV;

    public Student() {
    }

    public Student(String MaHV, String TenHV, String HoHV, String GioiTinhHV, String DiaChiHV, String MaLH, int TuoiHV, int SDTHV) {
        this.MaHV = MaHV;
        this.TenHV = TenHV;
        this.HoHV = HoHV;
        this.GioiTinhHV = GioiTinhHV;
        this.DiaChiHV = DiaChiHV;
        this.MaLH = MaLH;
        this.TuoiHV = TuoiHV;
        this.SDTHV = SDTHV;
    }
    
    public String getMaHV() {
        return MaHV;
    }

    public String getTenHV() {
        return TenHV;
    }

    public String getHoHV() {
        return HoHV;
    }

    public String getGioiTinhHV() {
        return GioiTinhHV;
    }

    public String getDiaChiHV() {
        return DiaChiHV;
    }

    public String getMaLH() {
        return MaLH;
    }

    public int getTuoiHV() {
        return TuoiHV;
    }

    public int getSDTHV() {
        return SDTHV;
    }

    public void setMaHV(String MaHV) {
        this.MaHV = MaHV;
    }

    public void setTenHV(String TenHV) {
        this.TenHV = TenHV;
    }

    public void setHoHV(String HoHV) {
        this.HoHV = HoHV;
    }

    public void setGioiTinhHV(String GioiTinhHV) {
        this.GioiTinhHV = GioiTinhHV;
    }

    public void setDiaChiHV(String DiaChiHV) {
        this.DiaChiHV = DiaChiHV;
    }

    public void setMaLH(String MaLH) {
        this.MaLH = MaLH;
    }

    public void setTuoiHV(int TuoiHV) {
        this.TuoiHV = TuoiHV;
    }

    public void setSDTHV(int SDTHV) {
        this.SDTHV = SDTHV;
    }
    
    
}
