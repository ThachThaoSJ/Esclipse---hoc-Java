package Polymorphism_baitap;

public class NhanVienFulltime extends NhanVien {
	private float soNgayLamThem;
	private int number;
	private String loaiNV;
	private static long LUONG_SEP = 20000000;
    private static long LUONG_NHAN_VIEN_BINH_THUONG = 10000000;
    private static long LUONG_LAM_THEM = 800000;
	
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.print("So ngay lam them: ");
		soNgayLamThem = scanner.nextFloat();
		System.out.print("Loai nhan vien (1 - nhan vien binh thuong/ 2 - sep): ");
		number = scanner.nextInt();
		switch(number) {
		case 1:
			loaiNV = "Nhan vien binh thuong";
			break;
		case 2:
			loaiNV = "Sep";
			break;
		default:
			System.out.println("Nhap loai nhan vien khong dung");
			break;
		}
	}
	
	public void tinhLuong() {
		if (loaiNV.equals("Nhan vien binh thuong")) {
			setLuongNV(LUONG_NHAN_VIEN_BINH_THUONG + soNgayLamThem * LUONG_LAM_THEM);
		} else if (loaiNV.equals("Sep")) {
			setLuongNV(LUONG_SEP + soNgayLamThem * LUONG_LAM_THEM);
		}
	}
	
	public String xuatThongTin() {
		return super.xuatThongTin() + "; loai nhan vien: " + loaiNV + "; so ngay lam them: " + soNgayLamThem;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
