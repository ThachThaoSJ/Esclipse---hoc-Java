package Abstraction;

//import java.util.Scanner;

public class ThueBaoDialUp extends ThueBao {
	public float thoiGianTruyCap;
//	Scanner scanner = new Scanner(System.in);
	
	public ThueBaoDialUp(){
		super.donGia = 30;
		super.thueBao = 30000;
	}
	@Override
	public float tienCuoc() {
		return thueBao + thoiGianTruyCap * donGia;
		
	}

	@Override
	public void nhapThongTinThueBao() {
		System.out.print("Nhap thoi gian truy cap (phut): ");
		thoiGianTruyCap = scanner.nextFloat();
	}

	@Override
	public void xuatThongTinThueBao() {
		System.out.println("Loai thue bao: Dial Up");
		System.out.println("Thue bao hang thang: " + thueBao + " VND");
		System.out.println("Don gia: " + donGia + " VND/phut");
		System.out.println("Tong tien cuoc: " + tienCuoc() + " VND");		
	}

}
