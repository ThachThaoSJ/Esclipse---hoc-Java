package Inheritance_baitap;

import java.util.Scanner;

public class GiaoDichDat extends GiaoDichNhaDat {
	private String loaiDat;
	private GiaoDichNhaDat nha;
//	Scanner scanner = new Scanner(System.in);
	
	public void nhapGDDat() {
		super.nhap();
		System.out.print("Loai dat (A/B/C): ");
		loaiDat = scanner.nextLine();
	}
	
	public void xuatGDDat() {
		super.xuat();
		System.out.println("Loai dat: " + loaiDat);
	}
	
	public double thanhTienGDDat() {
		switch (loaiDat) {
		case "A":
			setThanhTien(getDienTich() * getDonGia() * 1.5);
			break;
		case "B":
		case "C":
			setThanhTien(getDienTich() * getDonGia());
			break;
		default:
			break;
		}
		return getThanhTien();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
