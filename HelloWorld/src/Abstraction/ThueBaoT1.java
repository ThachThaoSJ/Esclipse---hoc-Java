package Abstraction;

public class ThueBaoT1 extends ThueBao{

	@Override
	public void nhapThongTinThueBao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xuatThongTinThueBao() {
		// TODO Auto-generated method stub
		System.out.println("Loai thue bao: T1");
		System.out.println("Tong tien cuoc: " + tienCuoc() + " VND");
	}

	@Override
	public float tienCuoc() {
		// TODO Auto-generated method stub
		return 2000000;
	}

}
