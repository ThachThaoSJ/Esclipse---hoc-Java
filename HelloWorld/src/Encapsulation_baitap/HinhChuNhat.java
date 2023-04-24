package Encapsulation_baitap;

import java.util.Scanner;

public class HinhChuNhat {
	public float chieuDai, chieuRong;
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		chieuDai = scanner.nextFloat();
		System.out.println("Nhap chieu rong: ");
		chieuRong = scanner.nextFloat();
		
		while (chieuRong <= 0 || chieuDai <= 0) {
			System.out.println("Chieu dai va chieu rong phai lon hon 0");
			System.out.println("Nhap lai chieu dai: ");
			chieuDai = scanner.nextFloat();
			System.out.println("Nhap lai chieu rong: ");
			chieuRong = scanner.nextFloat();
		}
	}
	
	public void hienThi() {
		System.out.println("Chieu dai hinh chu nhat: " + chieuDai);
		System.out.println("Chieu rong hinh chu nhat: " + chieuRong);
	}
	
	public float chuVi() {
		return (chieuDai + chieuRong)*2;
	}
	
	public float dienTich() {
		return chieuDai * chieuRong;
	}
	
	public void hienThiChuViVaDienTich() {
		System.out.println("Chu vi hinh chu nhat: " + chuVi());
		System.out.println("Dien tich hinh chu nhat: " + dienTich());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat hinhChuNhat = new HinhChuNhat();
		
		//nhap vao chieu dai chieu rong hinh chu nhat
		hinhChuNhat.nhap();
		
		//hien thi chieu dai chieu rong hinh chu nhat
		hinhChuNhat.hienThi();
		
		//in ra ket qua tinh chu vi dien tich hinh chu nhat
		hinhChuNhat.hienThiChuViVaDienTich();

	}

}
