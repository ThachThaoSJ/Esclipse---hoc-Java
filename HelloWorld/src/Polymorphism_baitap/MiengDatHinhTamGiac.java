package Polymorphism_baitap;

public class MiengDatHinhTamGiac extends MiengDat {
	public float day, chieuCao;

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.print("Nhap do dai day: ");
		day = scanner.nextFloat();
		System.out.print("Nhap chieu cao: ");
		chieuCao = scanner.nextFloat();
	}

	@Override
	public double giaTien() {
		// TODO Auto-generated method stub
		return super.giaTien() * 0.9;
	}

	@Override
	public double dienTich() {
		setDienTich((day * chieuCao)/2);
		return getDienTich();
	}

	@Override
	public void xuatThongTin() {
		System.out.println("Day: " + day);
		System.out.println("Chieu cao: " + chieuCao);
		super.xuatThongTin();
	}
	


}
