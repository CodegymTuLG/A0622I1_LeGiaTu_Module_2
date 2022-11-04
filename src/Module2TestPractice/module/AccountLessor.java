package Module2TestPractice.module;

import java.util.Date;

public class AccountLessor extends Account {

    private float MinDienTich;
    private float MaxDienTich;
    private float MinGiaTien ;
    private float MaxGiaTien ;

    public AccountLessor() {

    }

    public AccountLessor(String cccd, String hoTen, Date ngaySinh, int gioiTinh, boolean trangThai, float minDienTich, float maxDienTich, float minGiaTien, float maxGiaTien) {
        super(cccd, hoTen, ngaySinh, gioiTinh, trangThai);
        MinDienTich = minDienTich;
        MaxDienTich = maxDienTich;
        MinGiaTien = minGiaTien;
        MaxGiaTien = maxGiaTien;
    }

    public float getMinDienTich() {
        return MinDienTich;
    }

    public void setMinDienTich(float minDienTich) {
        MinDienTich = minDienTich;
    }

    public float getMaxDienTich() {
        return MaxDienTich;
    }

    public void setMaxDienTich(float maxDienTich) {
        MaxDienTich = maxDienTich;
    }

    public float getMinGiaTien() {
        return MinGiaTien;
    }

    public void setMinGiaTien(float minGiaTien) {
        MinGiaTien = minGiaTien;
    }

    public float getMaxGiaTien() {
        return MaxGiaTien;
    }

    public void setMaxGiaTien(float maxGiaTien) {
        MaxGiaTien = maxGiaTien;
    }
    @Override
    public String getInfor() {
        return super.getInfor() +
                MinDienTich +
                "," + MaxDienTich +
                "," + MinGiaTien +
                "," + MaxGiaTien;
    }

    @Override
    public String toString() {
        return "AccountLessor{" +
                super.toString() +
                "MinDienTich=" + MinDienTich +
                ", MaxDienTich=" + MaxDienTich +
                ", MinGiaTien=" + MinGiaTien +
                ", MaxGiaTien=" + MaxGiaTien +
                '}';
    }
}
