package Inheritance_baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThuVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<SachGiaoKhoa> arrSGK = new ArrayList<>();
		ArrayList<SachThamKhao> arrSTK = new ArrayList<>();
		
		SachGiaoKhoa sgk;
		SachThamKhao stk;
		
		double tongTienSGK = 0, tongTienSTK = 0, tongDonGiaSTK = 0;
		
		//Nhap/xuat thong tin sach
		System.out.print("Nhap so sach giao khoa: ");
		int soSGK = scanner.nextInt();
		System.out.print("Nhap so sach tham khao: ");
		int soSTK = scanner.nextInt();
		for (int i = 0; i < soSGK; i++) {
			sgk = new SachGiaoKhoa();
			System.out.println("Nhap thong tin SGK thu " + (i + 1) + ": ");
			sgk.nhapThongTinSGK();
			tongTienSGK += sgk.thanhTienSGK();
			arrSGK.add(sgk);
			System.out.println();
		}
		for (int i = 0; i < soSTK; i++) {
			stk = new SachThamKhao();
			System.out.println("Nhap thong tin STK thu " + (i + 1) + ": ");
			stk.nhapThongTinSTK();
			tongTienSTK += stk.thanhTienSTK();
			tongDonGiaSTK += stk.donGia;
			arrSTK.add(stk);
			System.out.println();
		}
		
		System.out.println("Thong tin sach trong thu vien: ");
		System.out.println("Sach giao khoa: ");
		for (int i = 0; i < soSGK; i++) {
			arrSGK.get(i).xuatThongTinSGK();
			System.out.println();
		}
		
		System.out.println("Sach tham khao: ");
		for (int i = 0; i < soSTK; i++) {
			arrSTK.get(i).xuatThongTinSTK();
			System.out.println();
		}
		
		System.out.println("Tong thanh tien SGK: " + tongTienSGK);
		System.out.println("Tong thanh tien STK: " + tongTienSTK);
		
		System.out.println("TBC don gia STK: " + (double)tongDonGiaSTK/soSTK);
		
		System.out.println("sách giáo khoa của nhà xuất bản X: ");
		for (int i = 0; i < soSGK; i++) {
			if (arrSGK.get(i).nhaXuatBan.equalsIgnoreCase("X")) {
				arrSGK.get(i).xuatThongTinSGK();
			}
		}
 
	}

}
