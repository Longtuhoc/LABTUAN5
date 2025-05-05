package labtuan5;
import java.util.ArrayList;
import java.util.Scanner;

public class MainBai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        
        QuanLy quanLy = new QuanLy("QL001", "Nguyen Van A", "Dai hoc", "Quan tri", 2000000);
        System.out.println("Luong cua quan ly: " + quanLy.tinhLuong());
        
        NghienCuu nghienCuu = new NghienCuu("NC001", "Tran Thi B", "Thac si", "Hoa hoc", 1500000);
        System.out.println("Luong cua nghien cuu: " + nghienCuu.tinhLuong());
        
        PhucVu phucVu = new PhucVu("PV001", "Le Van C", "Trung cap");
        System.out.println("Luong cua phuc vu: " + phucVu.tinhLuong());
        
        danhSachNhanVien.add(quanLy);
        danhSachNhanVien.add(nghienCuu);
        danhSachNhanVien.add(phucVu);
        
        System.out.println("\nDanh sach nhan vien:");
        for (NhanVien nv : danhSachNhanVien) {
            nv.xuat();
            System.out.println("Luong: " + nv.tinhLuong());
        }
    }
}