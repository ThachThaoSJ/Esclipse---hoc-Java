package Polymorphism_baitap;

public class GiangVien extends CanBo {
	private String khoa, trinhDo;
	private int number;
	private int soTietDay;
	@Override
	public void nhapThongTinCanBo() {
		// TODO Auto-generated method stub
		super.nhapThongTinCanBo();
		System.out.print("Nhap khoa: ");
		khoa = scanner.nextLine();
		System.out.print("Nhap trinh do(1 - cu nhan, 2 - thac si, 3 - tien si): ");
		number = scanner.nextInt();
		switch(number) {
		case 1:
			trinhDo = "Cu nhan";
			phuCap = 300;
			break;
		case 2:
			trinhDo = "Thac si";
			phuCap = 500;
			break;
		case 3:
			trinhDo = "Tien si";
			phuCap = 1000;
			break;
		default:
			System.out.println("Nhap trinh do khong dung.");
			break;
		}
		System.out.print("Nhap so tiet day: ");
		soTietDay = scanner.nextInt();
	}
	@Override
	public void xuatThongTinCanBo() {
		// TODO Auto-generated method stub
		super.xuatThongTinCanBo();
		System.out.println("Khoa: " + khoa);
		System.out.println("Trinh do: " + trinhDo);
		System.out.println("Phu cap: " + phuCap);
		System.out.println("So tiet day: " + soTietDay);
	}
	@Override
	public float tinhLuong() {
		luong = (heSoLuong * 730) + phuCap + soTietDay * 45;
		return luong;
	}
	
	

}
