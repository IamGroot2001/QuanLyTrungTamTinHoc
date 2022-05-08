/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttth.model;

/**
 *
 * @author daoho
 */
public class Teacher {
    String MaGV, TenGV, HoGV, GioiTinhGV, DiaChiGV;
    int Tuoi, SDTGV;

    public Teacher() {
    }

    public Teacher(String MaGV, String TenGV, String HoGV, String GioiTinhGV, String DiaChiGV, int Tuoi, int SDTGV) {
        this.MaGV = MaGV;
        this.TenGV = TenGV;
        this.HoGV = HoGV;
        this.GioiTinhGV = GioiTinhGV;
        this.DiaChiGV = DiaChiGV;
        this.Tuoi = Tuoi;
        this.SDTGV = SDTGV;
    }
    
    //get
    public String getMaGV() {
        return MaGV;
    }

    public String getTenGV() {
        return TenGV;
    }

    public String getHoGV() {
        return HoGV;
    }

    public String getGioiTinhGV() {
        return GioiTinhGV;
    }

    public String getDiaChiGV() {
        return DiaChiGV;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public int getSDTGV() {
        return SDTGV;
    }
    //set
    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public void setTenGV(String TenGV) {
        this.TenGV = TenGV;
    }

    public void setHoGV(String HoGV) {
        this.HoGV = HoGV;
    }

    public void setGioiTinhGV(String GioiTinhGV) {
        this.GioiTinhGV = GioiTinhGV;
    }

    public void setDiaChiGV(String DiaChiGV) {
        this.DiaChiGV = DiaChiGV;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public void setSDTGV(int SDTGV) {
        this.SDTGV = SDTGV;
    }
    
}
