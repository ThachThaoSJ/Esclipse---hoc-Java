package Encapsulation_baitaphhocsinhTHPT;

import java.util.Scanner;

public class HoSoHocSinh {
	private String lop;
	Nguoi nguoi;
	
	public void nhapThongTinHoSo() {
		Scanner scanner = new Scanner(System.in);
		nguoi = new Nguoi();
		nguoi.nhapThongTinHocSinh();
		System.out.print("Lop: ");
		lop = scanner.nextLine();
		
	}
	
	public void hienThongTinHoSo() {
		nguoi.hienThiThongTinHocSinh();
		System.out.println("Lop: " + lop);
	}

	public Nguoi getNguoi() {
		return nguoi;
	}

	public void setNguoi(Nguoi nguoi) {
		this.nguoi = nguoi;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
