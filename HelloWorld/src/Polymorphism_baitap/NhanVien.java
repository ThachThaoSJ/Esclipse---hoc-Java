package Polymorphism_baitap;

import java.util.Scanner;

public class NhanVien {
	private String tenNV;
	private float luongNV;
	Scanner scanner = new Scanner(System.in);
	
	public void nhapThongTin() {
		System.out.print("Ten nhan vien: ");
		tenNV = scanner.nextLine();
	}
	
	public void tinhLuong() {
		
	}
	
	public String xuatThongTin() {
		return "Ten nhan vien: " + tenNV + "; luong nhan vien: " + getLuongNV() + " VND";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public float getLuongNV() {
		return luongNV;
	}

	public void setLuongNV(float luongNV) {
		this.luongNV = luongNV;
	}

}
