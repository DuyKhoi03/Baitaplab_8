package lab4;

import java.util.Scanner;

public class Sanpham {
    public String tenSp;
    public double donGia;
    public double giaGiam;
    
    public Sanpham(){
        
    }
    
    public Sanpham(String tenSp, double donGia, double giaGiam){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giaGiam = giaGiam;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiaGiam() {
        return giaGiam;
    }

    public void setGiaGiam(double giaGiam) {
        this.giaGiam = giaGiam;
    }
    
    public double getThueNhapKhau(){
        return this.donGia*0.3;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSp = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap gia giam: ");
        giaGiam = sc.nextDouble();
    }
    
    public void Xuat(){
        System.out.println("ten san pham: " + getTenSp());
        System.out.println("don gia: " + getDonGia());
        System.out.println("gia giam: " + getGiaGiam());
        System.out.println("thue nhap khau: " + getThueNhapKhau());
    }
    
}