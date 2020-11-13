package com.myclass.entity;

public class NhanSu {
    private String maNV;
    private String hoLot;
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String CMND;
    private String maPB;
    private String maChucVu;
    private String maCCTH;
    private String ngayVaoLam;
    
//    abstract void tinhLuong();

    public NhanSu() {
    }

    public NhanSu(String maNV, String hoLot, String ten, String gioiTinh, String ngaySinh, String diaChi, String CMND, String maPB, String maChucVu, String maCCTH, String ngayVaoLam) {
        this.maNV = maNV;
        this.hoLot = hoLot;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.CMND = CMND;
        this.maPB = maPB;
        this.maChucVu = maChucVu;
        this.maCCTH = maCCTH;
        this.ngayVaoLam = ngayVaoLam;
    }
    
}
