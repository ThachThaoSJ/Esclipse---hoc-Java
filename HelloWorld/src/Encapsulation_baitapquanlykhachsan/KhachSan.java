package Encapsulation_baitapquanlykhachsan;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	private int soNgayTro;
	private String loaiPhongTro;
	private float giaPhong;
	private Nguoi nguoi;
	
	
	
	public Nguoi getNguoi() {
		return nguoi;
	}

	public void setNguoi(Nguoi nguoi) {
		this.nguoi = nguoi;
	}

	public void nhapThongTinCanQuanLy() {
		Scanner scanner = new Scanner(System.in);
		
		nguoi = new Nguoi();
		nguoi.nhapThongTinKhach();
		
		System.out.println("Nhap so ngay tro: ");
		soNgayTro = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap loai phong: ");
		loaiPhongTro = scanner.nextLine();
		System.out.println("Nhap gia phong: ");
		giaPhong = scanner.nextFloat();
	}
	
	public void hienThongTinCanQuanLy() {
		nguoi.hienThiThongTinKhach();
		System.out.println("So ngay tro: " + soNgayTro);
		System.out.println("Loai phong: " + loaiPhongTro);
		System.out.println("Gia phong: " + giaPhong);
	}
	
	public double tinhTien() {
		return soNgayTro * giaPhong;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so khach tro: ");
		int n = Integer.parseInt(scanner.nextLine());
		KhachSan khachSan;
		
		ArrayList<KhachSan> arrayKhachSan = new ArrayList<>();
//		KhachSan array[] = new KhachSan[n]
		;
		for (int i = 0; i < n; i++) {
			khachSan = new KhachSan();
			System.out.println("Nhap thong tin khach hang thu " + (i+1) + ": ");
			khachSan.nhapThongTinCanQuanLy();
			arrayKhachSan.add(khachSan);
//			array[i] = khachSan;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("\nThong tin khach hang thu " + (i+1) + ": ");
			arrayKhachSan.get(i).hienThongTinCanQuanLy();
//			array[i].hienThongTinCanQuanLy();
		}
		
		System.out.println("Nhap so CMND cua khach tra phong: ");
		String timCMND = scanner.nextLine();
		for (int i = 0; i< n; i++) {
			if (arrayKhachSan.get(i).getNguoi().getCmnd().equalsIgnoreCase(timCMND)) {
				System.out.println("Tien phong: " + arrayKhachSan.get(i).tinhTien());
//			if (array[i].getNguoi().getCmnd().equalsIgnoreCase(timCMND)) {
//				System.out.println("Tien phong: " + array[i].tinhTien());
			}
		}
		
		

	}

}
