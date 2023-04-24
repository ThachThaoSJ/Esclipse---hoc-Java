package Polymorphism_baitap;

public class MiengDatHinhChuNhat extends MiengDat{
	private float chieuDai, chieuRong;
	
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.print("Nhap chieu dai: ");
		chieuDai = scanner.nextFloat();
		System.out.print("Nhap chieu rong: ");
		chieuRong = scanner.nextFloat();
	}
	public double dienTich() {
		setDienTich(chieuDai * chieuRong);
		return getDienTich();
	}
	@Override
	public void xuatThongTin() {
		System.out.println("Chieu dai: " + chieuDai);
		System.out.println("Chieu rong: " + chieuRong);
		super.xuatThongTin();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
