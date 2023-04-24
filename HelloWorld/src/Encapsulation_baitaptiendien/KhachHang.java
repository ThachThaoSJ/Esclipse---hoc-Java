package Encapsulation_baitaptiendien;

import java.util.Scanner;

public class KhachHang {
	private String hoTen, soNha, maCongTo;
	
	public void nhapThongTinHo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ho ten chu ho: ");
		hoTen = scanner.nextLine();
		System.out.print("So nha: ");
		soNha = scanner.nextLine();
		System.out.print("Ma so cong to dien: ");
		maCongTo = scanner.nextLine();
	}
	
	public void hienThiThongTinHo() {
		System.out.println("Ho ten chu ho: " + hoTen);
		System.out.println("So nha: " + soNha);
		System.out.println("Ma so cong to dien: " + maCongTo);
	}

}
