package Abstraction;

public class ThueBaoADSL extends ThueBao {
	public float dungLuongTai;
	
	public ThueBaoADSL() {
		super.thueBao = 50000;
		super.donGia = 50;
	}

	@Override
	public void nhapThongTinThueBao() {
		System.out.println("Nhap dung luong tai (MB): ");
		dungLuongTai = scanner.nextFloat();
	}

	@Override
	public void xuatThongTinThueBao() {
		// TODO Auto-generated method stub
		System.out.println("Loai thue bao: ADSL");
		System.out.println("Thue bao hang thang: " + thueBao + " VND");
		System.out.println("Don gia: " + donGia + " VND/MB");
		System.out.println("Tong tien cuoc: " + tienCuoc() + " VND");
	}

	@Override
	public float tienCuoc() {
		// TODO Auto-generated method stub
		return thueBao + dungLuongTai * donGia;
	}

}
