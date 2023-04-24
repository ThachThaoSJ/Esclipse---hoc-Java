package Encapsulation_baitap;

import java.util.Scanner;

import Encapsulation_baitapquanlykhachsan.Nguoi;

public class MangDemo {	
	
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		final NhanVien cacNhanVien[];
//		cacNhanVien = new NhanVien[3];
//
//		NhanVien nhanVien1 = new NhanVien();
//		nhanVien1.nhap();
////		nhanVien1.hoTen = "NV1";
////		nhanVien1.sdt = "123123421";
//		NhanVien nhanVien2 = new NhanVien();
//		nhanVien2.nhap();
////		nhanVien2.hoTen = "NV2";
////		nhanVien2.sdt = "123123421";
//		NhanVien nhanVien3 = new NhanVien();
//		nhanVien3.nhap();
////		nhanVien3.hoTen = "NV3";
////		nhanVien3.sdt = "123123421";
//		
//		cacNhanVien[0] = nhanVien1;
//		cacNhanVien[1] = nhanVien2;
//		cacNhanVien[2] = nhanVien3;
//
//		
//		for(int i = 0; i < cacNhanVien.length; i++) {
//			System.out.println("Nhan Vien thu: " + (i + 1) + " - ten: " + cacNhanVien[i].hoTen + " - SDT: " + cacNhanVien[i].sdt);
//			
//		}
//		System.out.println("Nhap ten nv can tim: ");
//		String tenNV = scanner.nextLine();
//		int kt = 1;
//		for(int i = 0; i < cacNhanVien.length; i++) {
//			if (cacNhanVien[i].hoTen.equals(tenNV)) {
//				kt = 0;
//			}
//			
//		}
//		if ( kt == 1) {
//			System.out.println("Khong co nhan vien ten " + tenNV);
//		} else {
//			System.out.println("Co nhan vien ten " + tenNV);
//		}
//		
		testGetSet();
	}
	
	public static void testGetSet() {
		Nguoi nguoi1 = new Nguoi();
		nguoi1.age = 10;
		nguoi1.setHoTen("ahga");
	}

}
