package Inheritance_baitap;

import java.util.Scanner;

public class Sach {
	public String maSach, nhaXuatBan;
	public int soLuong; 
	public double donGia, thanhTien;
	Scanner scanner = new Scanner(System.in);
	
	public void nhapThongTinSach() {
		System.out.print("Ma sach: ");
		maSach = scanner.nextLine();
		System.out.print("Nha xuat ban: ");
		nhaXuatBan = scanner.nextLine();
		System.out.print("So luong: ");
		soLuong = scanner.nextInt();
		System.out.print("Don gia: ");
		donGia = scanner.nextDouble();
	}
	
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public void xuatThongTinSach() {
		System.out.println("Ma sach: " + maSach);
		System.out.println("Nha xuat ban: " + nhaXuatBan);
		System.out.println("So luong: " + soLuong);
		System.out.println("Don gia: " + donGia);
	}
	
	public double thanhTien() {
		return soLuong * donGia;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
