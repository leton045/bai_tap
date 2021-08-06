package com.github.ton;

import java.util.Scanner;

public class QuanlySP {
    private  int maSP ;
    private String tenSP;
    private double giaNhap;
    private double giaBan;
    private int slTon;
    private int slBan;
    private String hang;
    private String danhMuc;


    public QuanlySP() {
    }

    public QuanlySP(int maSP, String tenSP,  double giaNhap, double giaBan, int slTon, int slBan, String hang,
                   String danhMuc) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.slTon = slTon;
        this.slBan = slBan;
        this.hang = hang;
        this.danhMuc = danhMuc;
    }


    public int getMaSP() {
        return maSP;
    }


    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }


    public String getTenSP() {
        return tenSP;
    }


    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }



    public double getGiaNhap() {
        return giaNhap;
    }


    public void setGiaNhap(long giaNhap) {
        this.giaNhap = giaNhap;
    }


    public double getGiaBan() {
        return giaBan;
    }


    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }


    public int getSlTon() {
        return slTon;
    }


    public void setSlTon(int slTon) {
        this.slTon = slTon;
    }


    public int getSlBan() {
        return slBan;
    }


    public void setSlBan(int slBan) {
        this.slBan = slBan;
    }


    public String getHang() {
        return hang;
    }


    public void setHang(String hang) {
        this.hang = hang;
    }


    public String getDanhMuc() {
        return danhMuc;
    }


    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }


}
