/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttth.model;

/**
 *
 * @author dungh
 */
public class GiangVien {
    private String MaGV, TenGV, HoGV, GioiTinhGV, DiaChiGV;
    private int TuoiGV, SDTGV;

    public GiangVien() {
    }

    public GiangVien(String MaGV, String TenGV, String HoGV, int TuoiGV, String GioiTinhGV, String DiaChiGV, int SDTGV) {
        this.MaGV = MaGV;
        this.TenGV = TenGV;
        this.HoGV = HoGV;
        this.TuoiGV = TuoiGV;
        this.GioiTinhGV = GioiTinhGV;
        this.DiaChiGV = DiaChiGV;
        this.SDTGV = SDTGV;
    }

    public String getMaGV() {
        return MaGV;
    }

    public String getTenGV() {
        return TenGV;
    }

    public String getHoGV() {
        return HoGV;
    }

    public int getTuoiGV() {
        return TuoiGV;
    }

    public String getGioiTinhGV() {
        return GioiTinhGV;
    }

    public String getDiaChiGV() {
        return DiaChiGV;
    }

    public int getSDTGV() {
        return SDTGV;
    }
}
