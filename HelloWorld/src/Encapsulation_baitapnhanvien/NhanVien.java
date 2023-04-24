package Encapsulation_baitapnhanvien;

public class NhanVien {
	
	private String ho, ten;
	private int soSP;
	private double donGia;
	public NhanVien(String ho, String ten, int soSP) {
		this.ho = ho;
		this.ten = ten;
		this.soSP = soSP;
		if (this.soSP < 0) {
			this.soSP = 0;
		}
	}
	
	public double getLuong() {
		if (soSP >= 0 && soSP <= 199) {
			donGia = 0.5;
		} else if (soSP >= 200 && soSP <= 399) {
			donGia = 0.55;
		} else if (soSP >= 400 && soSP <= 599) {
			donGia = 0.6;
		} else {
			donGia = 0.65;
		}
		return donGia * soSP;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nhanVien1 = new NhanVien("Nguyen", "Thao", 16);
		NhanVien nhanVien2 = new NhanVien("Tran", "Tuan", 302);
		System.out.println("Tien luong cua " + nhanVien1.ten + " la: " + nhanVien1.getLuong());
		System.out.println("Tien luong cua " + nhanVien2.ten + " la: " + nhanVien2.getLuong());

	}

}
