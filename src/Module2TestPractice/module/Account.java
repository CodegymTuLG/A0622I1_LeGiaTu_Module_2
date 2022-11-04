package Module2TestPractice.module;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private String cccd;
    private String HoTen;
    private Date NgaySinh;
    private int GioiTinh;
    private boolean TrangThai = false;

    public Account() {
    }

    public Account(String cccd, String hoTen, Date ngaySinh, int gioiTinh, boolean trangThai) {
        this.cccd = cccd;
        HoTen = hoTen;
        NgaySinh = ngaySinh;
        GioiTinh = gioiTinh;
        TrangThai = trangThai;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean trangThai) {
        TrangThai = trangThai;
    }

    public String getInfor() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
        return cccd +
                "," + HoTen +
                "," + dateFormat.format(NgaySinh) +
                "," + GioiTinh +
                "," + TrangThai +
                ",";
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
        return "cccd='" + cccd + '\'' +
                ", HoTen='" + HoTen + '\'' +
                ", NgaySinh=" + dateFormat.format(NgaySinh) +
                ", GioiTinh=" + GioiTinh +
                ", TrangThai=" + TrangThai
                ;
    }
}
