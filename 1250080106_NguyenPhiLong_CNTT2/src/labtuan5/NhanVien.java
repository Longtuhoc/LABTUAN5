package labtuan5;
import java.util.Scanner;
import java.util.ArrayList;

abstract class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String trinhDo;
    double luongCoBan;

    public NhanVien() {
        this.maNhanVien = "";
        this.tenNhanVien = "";
        this.trinhDo = "";
        this.luongCoBan = 0.0;
    }

    public NhanVien(String maNhanVien, String tenNhanVien, String trinhDo) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.trinhDo = trinhDo;
        this.luongCoBan = 0.0;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        this.maNhanVien = scanner.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        this.tenNhanVien = scanner.nextLine();
        System.out.print("Nhap trinh do: ");
        this.trinhDo = scanner.nextLine();
        System.out.print("Nhap luong co ban: ");
        this.luongCoBan = scanner.nextDouble();
    }

    public void xuat() {
        System.out.println("Ma nhan vien: " + maNhanVien + ", Ten nhan vien: " + 
            tenNhanVien + ", Trinh do: " + trinhDo + ", Luong co ban: " + luongCoBan);
    }

    public abstract double tinhLuong();
}