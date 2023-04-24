package Inheritance_baitap;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
	public String tinhTrang;
	public int number;
	
	public String tinhTrangSach(int x) {
		switch (number) {
		case 0:
			tinhTrang = "cu";
			break;
		case 1:
			tinhTrang = "moi";
			break;
		default:
//			System.out.println("Chọn số không hợp lệ.");
			break;
		}
		return tinhTrang;
	}
	Scanner scanner = new Scanner(System.in);
	public void nhapThongTinSGK() {
		super.nhapThongTinSach();
		System.out.print("Tinh trang sach (moi/cu): ");
		number = scanner.nextInt();
	}
	
	public void xuatThongTinSGK() {
		super.xuatThongTinSach();
		System.out.println("Tinh trang sach(0 - cũ/ 1 - mới): " + tinhTrangSach(number));
	}
	
	public double thanhTienSGK() {
		if (tinhTrang == "moi") {
			thanhTien = super.thanhTien();
		} else {
			thanhTien = super.thanhTien()*0.5;
		}
		return thanhTien;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
