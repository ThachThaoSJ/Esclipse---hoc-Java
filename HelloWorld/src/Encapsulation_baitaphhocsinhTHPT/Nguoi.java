package Encapsulation_baitaphhocsinhTHPT;

import java.util.Scanner;

public class Nguoi {
	private String hoTen, gioiTinh, queQuan;
	
	public void nhapThongTinHocSinh() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ten hoc sinh: ");
		hoTen = scanner.nextLine();
		System.out.print("Gioi Tinh: ");
		gioiTinh = scanner.nextLine();
		System.out.print("Que quan: ");
		queQuan = scanner.nextLine();
	}
	
	public void hienThiThongTinHocSinh() {
		System.out.println("Ten: " + hoTen);
		System.out.println("Gioi tinh: " + gioiTinh);
		System.out.println("Que quan: " + queQuan);
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
