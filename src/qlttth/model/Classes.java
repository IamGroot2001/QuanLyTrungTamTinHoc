/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttth.model;

/**
 *
 * @author lengo
 */
public class Classes {
    private String MaLH,TenLH,MaKhoaHoc,MaGV;

    public Classes() {
    }

    public Classes(String MaLH, String TenLH, String MaKhoaHoc, String MaGV) {
        this.MaLH = MaLH;
        this.TenLH = TenLH;
        this.MaKhoaHoc = MaKhoaHoc;
        this.MaGV = MaGV;
    }

    public String getMaLH() {
        return MaLH;
    }

    public void setMaLH(String MaLH) {
        this.MaLH = MaLH;
    }

    public String getTenLH() {
        return TenLH;
    }

    public void setTenLH(String TenLH) {
        this.TenLH = TenLH;
    }

    public String getMaKhoaHoc() {
        return MaKhoaHoc;
    }

    public void setMaKhoaHoc(String MaKhoaHoc) {
        this.MaKhoaHoc = MaKhoaHoc;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }
    
    
}