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
}
