package Polymorphism_baitap;

public class NhanVienHanhChinh extends CanBo{
	private String phongBan, chucVu;
	private float soNgayCong;
	private int number;

	@Override
	public void nhapThongTinCanBo() {
		// TODO Auto-generated method stub
		super.nhapThongTinCanBo();
		System.out.print("Nhap phong ban: ");
		phongBan = scanner.nextLine();
		System.out.print("Nhap so ngay cong: ");
		soNgayCong = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhap chuc vu(1 - Truong phong, 2 - Pho phong, 3 - NhanVien): ");
		number = scanner.nextInt();
		switch(number) {
		case 1:
			chucVu = "Truong phong";
			phuCap = 2000;
			break;
		case 2: 
			chucVu = "Pho phong";
			phuCap = 1000;
			break;
		case 3:
			chucVu = "Nhan vien";
			phuCap = 500;
			break;
		default:
			System.out.print("Nhap chuc vu khong dung.");
		}
	}

	@Override
	public void xuatThongTinCanBo() {
		// TODO Auto-generated method stub
		super.xuatThongTinCanBo();
		System.out.println("Phong ban: " + phongBan);
		System.out.println("So ngay cong: " + soNgayCong);
		System.out.println("Chuc vu: " + chucVu);
		System.out.println("Phu cap: " + phuCap);
	}

	@Override
	public float tinhLuong() {
		// TODO Auto-generated method stub
		luong = heSoLuong * 730 + phuCap + soNgayCong * 200;
		return luong;
	}
	

}
