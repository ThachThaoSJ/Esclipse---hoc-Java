package Inheritance_baitap;

public class GiaoDichNha extends GiaoDichNhaDat{
	private String loaiNha, diaChi;
	
	public void nhapGDNha() {
		super.nhap();
		System.out.print("Loai nha (cao cap/thuong)");
		loaiNha = scanner.nextLine();
		System.out.println("Dia chi: ");
		diaChi = scanner.nextLine();
	}
	
	public void xuatGDNha() {
		super.xuat();
		System.out.println("Loai nha: " + loaiNha);
	}
	
	public double thanhTienGDNha() {
		switch(loaiNha) {
		case "cao cap":
			setThanhTien(getDienTich()*getDonGia());
			break;
		case "thuong":
			setThanhTien(getDienTich()*getDonGia() * 0.9);
			break;
		default:
			break;
		}
		return getThanhTien();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
