package Polymorphism_baitap;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	protected float heSoLuong, luong;
	protected int phuCap;
	Scanner scanner = new Scanner(System.in);
	
	public void nhapThongTinCanBo() {
		System.out.print("Nhap ho ten: ");
		hoTen = scanner.nextLine();
		System.out.print("Nhap he so luong: ");
		heSoLuong = Float.parseFloat(scanner.nextLine());
	}
	
	public void xuatThongTinCanBo() {
		System.out.println("Ho ten: " + hoTen);
		System.out.println("He so luong: " + heSoLuong);
	}
	
	public float tinhLuong() {
		return luong;
	}

}
