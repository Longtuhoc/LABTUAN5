package labtuan5;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

class ConNguoi {
    protected String hoTen;
    protected int namSinh;

    public ConNguoi() {
        this.hoTen = "";
        this.namSinh = 0;
    }

    public ConNguoi(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập năm sinh: ");
        this.namSinh = scanner.nextInt();
        scanner.nextLine(); // Xóa bộ đệm
    }

    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
    }
}

class HocVien extends ConNguoi {
    private float diem1;
    private float diem2;
    private float diem3;

    public HocVien() {
        super();
        this.diem1 = 0;
        this.diem2 = 0;
        this.diem3 = 0;
    }

    public HocVien(String hoTen, int namSinh, float diem1, float diem2, float diem3) {
        super(hoTen, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm 1: ");
        this.diem1 = scanner.nextFloat();
        System.out.print("Nhập điểm 2: ");
        this.diem2 = scanner.nextFloat();
        System.out.print("Nhập điểm 3: ");
        this.diem3 = scanner.nextFloat();
        scanner.nextLine(); // Xóa bộ đệm
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Điểm 1: " + diem1);
        System.out.println("Điểm 2: " + diem2);
        System.out.println("Điểm 3: " + diem3);
    }
}

class PhongKhoaBan {
    private String maPhongKhoaBan;
    private String tenPhongKhoaBan;

    public PhongKhoaBan() {
        this.maPhongKhoaBan = "";
        this.tenPhongKhoaBan = "";
    }

    public PhongKhoaBan(String maPhongKhoaBan, String tenPhongKhoaBan) {
        this.maPhongKhoaBan = maPhongKhoaBan;
        this.tenPhongKhoaBan = tenPhongKhoaBan;
    }

    public String getMaPhongKhoaBan() {
        return maPhongKhoaBan;
    }

    public void setMaPhongKhoaBan(String maPhongKhoaBan) {
        this.maPhongKhoaBan = maPhongKhoaBan;
    }

    public String getTenPhongKhoaBan() {
        return tenPhongKhoaBan;
    }

    public void setTenPhongKhoaBan(String tenPhongKhoaBan) {
        this.tenPhongKhoaBan = tenPhongKhoaBan;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã phòng/khoa/ban: ");
        this.maPhongKhoaBan = scanner.nextLine();
        System.out.print("Nhập tên phòng/khoa/ban: ");
        this.tenPhongKhoaBan = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Mã phòng/khoa/ban: " + maPhongKhoaBan);
        System.out.println("Tên phòng/khoa/ban: " + tenPhongKhoaBan);
    }
}

class NhanVien extends ConNguoi {
    private double luong;
    private Date ngayNhanViec;
    private PhongKhoaBan phongKhoaBan;

    public NhanVien() {
        super();
        this.luong = 0;
        this.ngayNhanViec = null;
        this.phongKhoaBan = null;
    }

    public NhanVien(String hoTen, int namSinh, double luong, Date ngayNhanViec, PhongKhoaBan phongKhoaBan) {
        super(hoTen, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.phongKhoaBan = phongKhoaBan;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public Date getNgayNhanViec() {
        return ngayNhanViec;
    }

    public void setNgayNhanViec(Date ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }

    public PhongKhoaBan getPhongKhoaBan() {
        return phongKhoaBan;
    }

    public void setPhongKhoaBan(PhongKhoaBan phongKhoaBan) {
        this.phongKhoaBan = phongKhoaBan;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập lương: ");
        this.luong = scanner.nextDouble();
        scanner.nextLine(); // Xóa bộ đệm
        
        System.out.print("Nhập ngày nhận việc (dd/MM/yyyy): ");
        String ngayStr = scanner.nextLine();
        try {
            this.ngayNhanViec = new SimpleDateFormat("dd/MM/yyyy").parse(ngayStr);
        } catch (Exception e) {
            System.out.println("Lỗi định dạng ngày. Sử dụng ngày hiện tại.");
            this.ngayNhanViec = new Date();
        }
        
        this.phongKhoaBan = new PhongKhoaBan();
        phongKhoaBan.nhap();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Lương: " + luong);
        System.out.println("Ngày nhận việc: " + new SimpleDateFormat("dd/MM/yyyy").format(ngayNhanViec));
        phongKhoaBan.xuat();
    }
}

public class MainBai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin học viên:");
        HocVien hocVien = new HocVien();
        hocVien.nhap();

        System.out.println("\nNhập thông tin nhân viên:");
        NhanVien nhanVien = new NhanVien();
        nhanVien.nhap();

        System.out.println("\nThông tin học viên:");
        hocVien.xuat();

        System.out.println("\nThông tin nhân viên:");
        nhanVien.xuat();

        scanner.close();
    }
}