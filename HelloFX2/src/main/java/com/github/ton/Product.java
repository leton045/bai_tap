package com.github.ton;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Product {
    private SimpleStringProperty tenSP;
    private SimpleIntegerProperty maSP;
    private SimpleDoubleProperty giaNhap;
    private SimpleDoubleProperty giaBan;
    private SimpleIntegerProperty soLuongNhap;
    private SimpleIntegerProperty soLuongBan;
    private SimpleStringProperty hang;
    private SimpleStringProperty danhMuc;

    public Product() {
    }

    //Constructor
    public Product(String tenSP, Integer maSP, Double giaNhap, Double giaBan, Integer soLuongBan, Integer soLuongNhap,
                   String hang, String danhMuc) {
        this.tenSP = new SimpleStringProperty(tenSP);
        this.maSP = new SimpleIntegerProperty(maSP);
        this.giaBan = new SimpleDoubleProperty(giaBan);
        this.giaNhap = new SimpleDoubleProperty(giaNhap);
        this.soLuongBan = new SimpleIntegerProperty(soLuongBan);
        this.soLuongNhap = new SimpleIntegerProperty(soLuongNhap);
        this.hang = new SimpleStringProperty(hang);
        this.danhMuc = new SimpleStringProperty(danhMuc);

    }

    //Setter
     public void setMaSP(Integer maSP) {
            this.maSP = new SimpleIntegerProperty(maSP);
        }

    public void setTenSP(String tenSP) {
        this.tenSP = new SimpleStringProperty(tenSP);
    }



    public void setGiaNhap(Double giaNhap) {
        this.giaNhap.set(giaNhap);
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan.set(giaBan);
    }

    public void setSoLuongNhap(Integer soLuongNhap) {
        this.soLuongNhap.set(soLuongNhap);
    }

    public void setSoLuongBan(Integer soLuongBan) {
        this.soLuongBan.set(soLuongBan);
    }

    public void setHang(String hang) {
        this.hang = new SimpleStringProperty(hang);
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc.set(danhMuc);
    }


    //getter
    public String getTenSP() {
        return this.tenSP.get();
    }

    public Integer getMaSP() {
        return this.maSP.get();
    }

    public Double getGiaBan() {
        return this.giaBan.get();
    }

    public Double getGiaNhap() {
        return this.giaNhap.get();
    }

    public Integer getSoLuongNhap() {
        return this.soLuongNhap.get();
    }

    public Integer getSoLuongBan() {
        return this.soLuongBan.get();
    }

    public String getHang() {
        return this.hang.get();
    }

    public String getDanhMuc() {
        return danhMuc.get();
    }
}
