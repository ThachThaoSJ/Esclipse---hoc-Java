package Polymorphism_baitap;

public class QA extends NhanVienCongTyPhanMem {
	private int soBug;
	
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.print("Nhap so loi tim duoc: ");
		soBug = scanner.nextInt();
	}
	
	public String xuatThongTin() {
		return "Vi tri: " + getViTri() + ", " + super.xuatThongTin() + "so loi tim duoc: " + soBug + ", tong luong: " + tinhLuong();
	}
	
	public float tinhLuong() {
		return getLuongCoBan() + soBug * 50000;
	}
}
