package labtuan5;

import java.util.Scanner;

interface Bai2 {
    float pi = 3.146f;
    void nhap();
    void xuat();
    float dienTich();
}

class HinhVuong implements Bai2 {
    private float canh;
    
    public HinhVuong() {
        this.canh = 0;
    }
    
    public HinhVuong(float canh) {
        this.canh = canh;
    }
    
    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh hinh vuong: ");
        this.canh = scanner.nextFloat();
    }
    
    @Override
    public void xuat() {
        System.out.println("Hinh vuong - Canh: " + canh + " - Dien tich: " + dienTich());
    }
    
    @Override
    public float dienTich() {
        return canh * canh;
    }
}

class HinhChuNhat implements Bai2 {
    private float dai;
    private float rong;
    
    public HinhChuNhat() {
        this.dai = 0;
        this.rong = 0;
    }
    
    public HinhChuNhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }
    
    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        this.dai = scanner.nextFloat();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        this.rong = scanner.nextFloat();
    }
    
    @Override
    public void xuat() {
        System.out.println("Hinh chu nhat - Dai: " + dai + " - Rong: " + rong + " - Dien tich: " + dienTich());
    }
    
    @Override
    public float dienTich() {
        return dai * rong;
    }
}

class HinhTron implements Bai2 {
    private float banKinh;
    
    public HinhTron() {
        this.banKinh = 0;
    }
    
    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }
    
    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        this.banKinh = scanner.nextFloat();
    }
    
    @Override
    public void xuat() {
        System.out.println("Hinh tron - Ban kinh: " + banKinh + " - Dien tich: " + dienTich());
    }
    
    @Override
    public float dienTich() {
        return pi * banKinh * banKinh;
    }
}

public class MainBai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so luong hinh: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        Bai2[] ds = new Bai2[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Chon loai hinh se nhap: ");
            System.out.println("1: hinh vuong");
            System.out.println("2: hinh chu nhat");
            System.out.println("3: hinh tron");
            
            int chon = scanner.nextInt();
            scanner.nextLine();
            
            switch (chon) {
                case 1:
                    ds[i] = new HinhVuong();
                    ds[i].nhap();
                    break;
                case 2:
                    ds[i] = new HinhChuNhat();
                    ds[i].nhap();
                    break;
                case 3:
                    ds[i] = new HinhTron();
                    ds[i].nhap();
                    break;
                default:
                    System.out.println("Ban phai chon 1 trong 3 loai tren");
                    i--;
            }
        }
        
        System.out.println("\nDanh sach cac hinh:");
        for (Bai2 hinh : ds) {
            hinh.xuat();
        }
        
        Bai2 hinhDienTichLonNhat = ds[0];
        for (Bai2 hinh : ds) {
            if (hinh.dienTich() > hinhDienTichLonNhat.dienTich()) {
                hinhDienTichLonNhat = hinh;
            }
        }
        
        System.out.println("\nHinh co dien tich lon nhat:");
        hinhDienTichLonNhat.xuat();
    }
}