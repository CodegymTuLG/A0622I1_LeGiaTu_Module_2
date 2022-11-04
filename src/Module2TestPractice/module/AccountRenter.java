package Module2TestPractice.module;

import java.util.Date;

public class AccountRenter extends Account{
    private float DienTich;
    private String DiaChi;
    private int SoNguoi;
    private float GiaTien;

    public AccountRenter() {
    }

    public AccountRenter(String cccd, String hoTen, Date ngaySinh, int gioiTinh, boolean trangThai, float dienTich, String diaChi, int soNguoi, float giaTien) {
        super(cccd, hoTen, ngaySinh, gioiTinh, trangThai);
        DienTich = dienTich;
        DiaChi = diaChi;
        SoNguoi = soNguoi;
        GiaTien = giaTien;
    }

    public float getDienTich() {
        return DienTich;
    }

    public void setDienTich(float dienTich) {
        DienTich = dienTich;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getSoNguoi() {
        return SoNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        SoNguoi = soNguoi;
    }

    public float getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(float giaTien) {
        GiaTien = giaTien;
    }

    @Override
    public String getInfor() {
        return super.getInfor() +
                DienTich +
                "," + DiaChi +
                "," + SoNguoi +
                "," + GiaTien +
                "," + GiaTien;
    }

    @Override
    public String toString() {
        return "AccountRenter{" +
                super.toString() +
                "DienTich=" + DienTich +
                ", DiaChi='" + DiaChi + '\'' +
                ", SoNguoi=" + SoNguoi +
                ", GiaTien=" + GiaTien +
                '}';
    }
}
