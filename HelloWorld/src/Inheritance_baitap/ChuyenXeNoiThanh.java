package Inheritance_baitap;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soTuyen, soKm;
	ChuyenXeNoiThanh() {
		super();
	}
	
	public void nhapThongTinChuyenXeNoiThanh() {
		super.nhapThongTinChuyenXe();
		Scanner scanner = new Scanner(System.in);
		System.out.print("So tuyen: ");
		soTuyen = scanner.nextInt();
		System.out.print("So km di duoc: ");
		soKm = scanner.nextInt();
	}
	
	public void xuatThongTinChuyenXeNoiThanh() {
		super.xuatThongTinChuyenXe();
		System.out.println("So tuyen: " + soTuyen);
		System.out.println("So km di duoc: " + soKm);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
