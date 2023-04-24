package Encapsulation_baitapquanlykhachsan;

import java.util.Scanner;

public class Nguoi {
	private String hoTen, ngaySinh, cmnd;
	public int age;
	

	public void nhapThongTinKhach() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao thong tin khach tro: ");
		System.out.println("Nhap ten: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhap ngay thang nam sinh: ");
		ngaySinh = scanner.nextLine();
		System.out.println("Nhap cmnd: ");
		cmnd = scanner.nextLine();		
	}
	
	public void hienThiThongTinKhach() {
		System.out.println("Ten: " + hoTen);
		System.out.println("Ngay sinh: " + ngaySinh);
		System.out.println("CMND: " + cmnd);		
	}
	
	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
