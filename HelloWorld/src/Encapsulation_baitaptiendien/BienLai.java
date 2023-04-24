package Encapsulation_baitaptiendien;

import java.util.Scanner;

public class BienLai {
	private int chiSoCu, chiSoMoi;
	KhachHang khachHang;
	

	public void nhapThongTinBienLai() {
		Scanner scanner = new Scanner(System.in);
		khachHang = new KhachHang();
		khachHang.nhapThongTinHo();
		System.out.print("Chi so cu: ");
		chiSoCu = scanner.nextInt();
		System.out.print("Chi so moi: ");
		chiSoMoi = scanner.nextInt();
	}
	public int tinhTienDien() {
		return (chiSoMoi - chiSoCu)*750;
	}
	public void hienThongTinBienLai() {
		khachHang.hienThiThongTinHo();
		System.out.println("Chi so cu: " + chiSoCu);
		System.out.println("Chi so moi: " + chiSoMoi);
		System.out.println("So tien phai tra: " + tinhTienDien());
	}

}
