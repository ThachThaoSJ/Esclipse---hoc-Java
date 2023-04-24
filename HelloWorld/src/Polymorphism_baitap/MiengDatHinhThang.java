package Polymorphism_baitap;

public class MiengDatHinhThang extends MiengDat{
	private float dayLon, dayNho, chieuCao;
	
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.print("Nhap day lon:" );
		dayLon = scanner.nextFloat();
		System.out.print("Nhap day nho: ");
		dayNho = scanner.nextFloat();
		System.out.print("Chieu cao: ");
		chieuCao = scanner.nextFloat();
	}

	@Override
	public double dienTich() {
		setDienTich(((dayLon + dayNho) * chieuCao)/2);
		return getDienTich();
	}

	@Override
	public void xuatThongTin() {
		System.out.println("Day lon: " + dayLon);
		System.out.println("Day nho: " + dayNho);
		System.out.println("Chieu cao: " + chieuCao);
		super.xuatThongTin();
	}

	@Override
	public double giaTien() {
		// TODO Auto-generated method stub
		return super.giaTien() * 0.9;
	}
	

}
