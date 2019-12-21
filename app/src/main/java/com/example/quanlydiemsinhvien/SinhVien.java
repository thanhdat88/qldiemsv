package com.example.quanlydiemsinhvien;

public class SinhVien {
    private int id;
    private String ten,quequan;
    private int namsinh;
    private int maMH ;

    public SinhVien(int id, String ten, String quequan, int namsinh, int maMH) {
        this.id = id;
        this.ten = ten;
        this.quequan = quequan;
        this.namsinh = namsinh;
        this.maMH = maMH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }
}
