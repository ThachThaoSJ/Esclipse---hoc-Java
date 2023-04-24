package Encapsulation_baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVien {
	public String hoTen, thongTin, ketQua;
	public String sdt;

	
	
	Scanner scanner = new Scanner(System.in);
	
//	ArrayList<String> arrayNV = new ArrayList<>();
	
	public void nhap() {
			System.out.print("Nhap ten nhan vien: ");
			hoTen = scanner.nextLine();
			System.out.print("Nhap so dien thoai nhan vien: ");
			sdt = scanner.nextLine();
//			thongTin = hoTen + "\t" + sdt;
//			arrayNV.add(thongTin);
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nhanVien = new NhanVien();
		
		nhanVien.nhap();
		
		System.out.println("Nhap ten nhan vien can tim: ");
		String tenNV = scanner.nextLine();
		System.out.println(nhanVien.timKiemTheoTen(tenNV));

	}

}
