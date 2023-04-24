package Polymorphism_baitap;

public class NhanVienParttime extends NhanVien{
	private float gioLamViec;
	private static long LUONG_NHAN_VIEN_THOI_VU_MOT_GIO = 100000;
	
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.print("So gio lam viec: ");
		gioLamViec = scanner.nextFloat();
	}
	
	public void tinhLuong() {
		setLuongNV(LUONG_NHAN_VIEN_THOI_VU_MOT_GIO * gioLamViec);
	}
	
	public String xuatThongTin() {
		return super.xuatThongTin() + "; gio lam viec: " + gioLamViec;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
