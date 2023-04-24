package Polymorphism_baitap;

import java.util.Scanner;

public class MiengDat {
	private String maSo;
	private double donGia, dienTich;
	Scanner scanner = new Scanner(System.in);
	
	public void nhapThongTin() {
		System.out.print("Nhap ma so mieng dat: ");
		maSo = scanner.nextLine();
		System.out.print("Nhap don gia mieng dat: ");
		donGia = scanner.nextDouble();
	}
	public double dienTich() {
		return getDienTich();
	}
	
	public double giaTien() {
		return getDienTich() * donGia;
	}
	
	public void xuatThongTin() {
		System.out.println("Dien tich mieng dat: " + dienTich);
		System.out.println("Don gia/ m2: " + donGia);
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

}
