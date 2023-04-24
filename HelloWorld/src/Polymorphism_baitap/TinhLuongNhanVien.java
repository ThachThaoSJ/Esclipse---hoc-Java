package Polymorphism_baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class TinhLuongNhanVien {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<NhanVien> arrNV = new ArrayList<>();
		NhanVien nhanVien;
		
		System.out.print("Nhap so nhan vien fulltime: ");
		int soNVFulltime = scanner.nextInt();
		System.out.println("Nhap thong tin nhan vien fulltime: ");
		for (int i = 0; i < soNVFulltime; i++) {
			nhanVien = new NhanVienFulltime();
			System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ": ");
			nhanVien.nhapThongTin();
			System.out.println();
			arrNV.add(nhanVien);
		}
		
		System.out.print("Nhap so nhan vien parttime: ");
		int soNVParttime = scanner.nextInt();
		System.out.println("Nhap thong tin nhan vien parttime: ");
		for (int i = 0; i < soNVParttime; i++) {
			nhanVien = new NhanVienParttime();
			nhanVien.nhapThongTin();
			System.out.println();
			arrNV.add(nhanVien);
		}
		
		System.out.println("Thong tin cac nhan vien dang lam tai cong ty: ");
		for (int i = 0; i < arrNV.size(); i++) {
			arrNV.get(i).tinhLuong();
			System.out.println(arrNV.get(i).xuatThongTin());
			System.out.println();
		}
		

	}

}
