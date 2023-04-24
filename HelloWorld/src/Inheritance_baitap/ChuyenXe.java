package Inheritance_baitap;

import java.util.Scanner;

public class ChuyenXe {
	private String maSoChuyen, hoTen, soXe;
	private String tenNhaXe;
	private double doanhThu;
	
	public ChuyenXe() {
		// lam cong viec cua bo
		tenNhaXe = "CMC";
	}
	public void nhapThongTinChuyenXe() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ma so chuyen xe: ");
		maSoChuyen = scanner.nextLine();
		System.out.print("Ho ten tai xe: ");
		hoTen = scanner.nextLine();
		System.out.print("So xe: ");
		soXe = scanner.nextLine();
		System.out.print("Doanh thu: ");
		setDoanhThu(scanner.nextDouble());
	}
	
	public void xuatThongTinChuyenXe() {
		System.out.println("Ma so chuyen xe: " + maSoChuyen);
		System.out.println("Ho ten tai xe: " + hoTen);
		System.out.println("So xe: " + soXe);
		System.out.println("Doanh thu: " + getDoanhThu());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}

}
