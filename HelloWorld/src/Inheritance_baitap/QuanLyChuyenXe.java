package Inheritance_baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyChuyenXe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double doanhThuXeNoiThanh = 0, doanhThuXeNgoaiThanh = 0;
		
		ArrayList<ChuyenXeNoiThanh> CXNoiThanh = new ArrayList<>();
		ArrayList<ChuyenXeNgoaiThanh> CXNgoaiThanh = new ArrayList<>();
		
		//nhap thong tin chuyen xe noi thanh
		System.out.print("Nhap so chuyen xe noi thanh: ");
		int soChuyenNoiThanh = scanner.nextInt();
		
		for (int i = 0; i < soChuyenNoiThanh; i++) {

			ChuyenXeNoiThanh xeNoiThanh = new ChuyenXeNoiThanh(); //vung nho A
			System.out.println("Nhap thong tin chuyen xe noi thanh thu " + (i + 1) + ": ");
			xeNoiThanh.nhapThongTinChuyenXeNoiThanh();
			CXNoiThanh.add(xeNoiThanh);
			doanhThuXeNoiThanh += xeNoiThanh.getDoanhThu();
			System.out.println();
		}
		
		//nhap thong tin chuyen xe ngoai thanh
		System.out.print("Nhap so chuyen xe ngoai thanh: ");
		int soChuyenNgoaiThanh = scanner.nextInt();
		
		for (int i = 0; i < soChuyenNgoaiThanh; i++) {
			ChuyenXeNgoaiThanh xeNgoaiThanh = new ChuyenXeNgoaiThanh();
			System.out.println("Nhap thong tin chuyen xe ngoai thanh thu " + (i + 1) + ": ");
			xeNgoaiThanh.nhapThongTinChuyenXeNgoaiThanh();
			CXNgoaiThanh.add(xeNgoaiThanh);
			doanhThuXeNgoaiThanh += xeNgoaiThanh.getDoanhThu();
			System.out.println();
		}
		
		//xuat thong tin cac chuyen xe:
		System.out.println("Thong tin cac chuyen xe noi thanh: ");
		for (int i = 0; i < soChuyenNoiThanh; i++) {
			CXNoiThanh.get(i).xuatThongTinChuyenXeNoiThanh();
			System.out.println();
		}
		
		System.out.println("Thong tin cac chuyen xe ngoai thanh: ");
		for (int i = 0; i < soChuyenNgoaiThanh; i++) {
			CXNgoaiThanh.get(i).xuatThongTinChuyenXeNgoaiThanh();
			System.out.println();
		}
		//tinh tong doanh thu
				
		System.out.println("Doanh thu tung loai xe: ");
		System.out.println("Doanh thu chuyen xe noi thanh: " + doanhThuXeNoiThanh);
		System.out.println("Doanh thu chuyen xe ngoai thanh: " + doanhThuXeNgoaiThanh);

	}

}
