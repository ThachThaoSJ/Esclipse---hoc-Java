package Inheritance_baitap;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
	private String noiDen;
	private float soNgayDiDuoc;
	public ChuyenXeNgoaiThanh() {
		super();
	}
	
	public void nhapThongTinChuyenXeNgoaiThanh() {
		super.nhapThongTinChuyenXe();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Noi den: ");
		noiDen = scanner.nextLine();
		System.out.print("So ngay di duoc: ");
		soNgayDiDuoc = scanner.nextInt();
	}
	
	public void xuatThongTinChuyenXeNgoaiThanh() {
		super.xuatThongTinChuyenXe();
		System.out.println("Noi den: " + noiDen);
		System.out.println("So ngay di duoc: " + soNgayDiDuoc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
