package Polymorphism_baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDat {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<MiengDat> arrDat = new ArrayList<>();
		double tongDienTichDat = 0, tongGiaTriDat = 0;
		MiengDat miengDat;

		System.out.print("So mieng dat hinh chu nhat cua cong ty: ");
		float soMiengDatHCN = scanner.nextFloat();
		for (int i =0; i < soMiengDatHCN; i++) {
			miengDat = new MiengDatHinhChuNhat();
			System.out.println("Nhap vao thong tin mieng dat hinh chu nhat thu " + (i + 1) + ": ");
			miengDat.nhapThongTin();
			tongDienTichDat += miengDat.dienTich();
			tongGiaTriDat += miengDat.giaTien();
			arrDat.add(miengDat);
			System.out.println();
		}
		
		System.out.print("So mieng dat hinh thang cua cong ty: ");
		float soMiengDatHT = scanner.nextFloat();
		for (int i = 0; i < soMiengDatHT; i++) {
			miengDat = new MiengDatHinhThang();
			System.out.println("Nhap vao thong tin mieng dat hinh thang thu " + (i + 1) + ": ");
			miengDat.nhapThongTin();
			tongDienTichDat += miengDat.dienTich();
			tongGiaTriDat += miengDat.giaTien();
			arrDat.add(miengDat);
			System.out.println();
		}
		
		System.out.print("So mieng dat hinh tam giac cua cong ty: ");
		float soMiengDatHTG = scanner.nextFloat();
		for (int i =0; i < soMiengDatHTG; i++) {
			miengDat = new MiengDatHinhTamGiac();
			System.out.println("Nhap vao thong tin mieng dat hinh tam giac thu " + (i + 1) + ": ");
			miengDat.nhapThongTin();
			tongDienTichDat += miengDat.dienTich();
			tongGiaTriDat += miengDat.giaTien();
			arrDat.add(miengDat);
			System.out.println();
		}
		
		System.out.println("Thong tin cac mieng dat cua cong ty: ");
		for (int i = 0; i < arrDat.size(); i++) {
			System.out.println("Thong tin mieng dat thu " + (i + 1) + ": ");
			arrDat.get(i).xuatThongTin();
			System.out.println();
		}
		
		System.out.println("Tong dien tich cac mieng dat cua cong ty: " + tongDienTichDat);
		System.out.println("Tong gia tien cac mieng dat cua cong ty: " + tongGiaTriDat);
	}

}
