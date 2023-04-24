package Polymorphism_baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBoTruongDaiHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CanBo> arrCanBo = new ArrayList<>();
		CanBo canBo;
		int choose;
		float tongLuong = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so can bo trong truong: ");
		int soCanBo = scanner.nextInt();
		for (int i = 0; i < soCanBo; i++) {
			System.out.println("Nhap thong tin can bo thu " + (i + 1) + ": ");
			do {
				System.out.print("Chon loai can bo (1 - Giang vien, 2 - Nhan vien): ");
				choose = scanner.nextInt();
				switch(choose) {
				case 1: 
					canBo = new GiangVien();
					canBo.nhapThongTinCanBo();
					arrCanBo.add(canBo);
					break;
				case 2:
					canBo = new NhanVienHanhChinh();
					canBo.nhapThongTinCanBo();
					arrCanBo.add(canBo);
					break;
				default:
					System.out.println("Chon khong hop le");
					break;
				}
			} while (choose < 1 || choose > 3);
			System.out.println();
		}
		System.out.println("Danh sach can bo trong truong: ");
		for (int i = 0; i < arrCanBo.size(); i++) {
			arrCanBo.get(i).xuatThongTinCanBo();
			tongLuong += arrCanBo.get(i).tinhLuong();
			System.out.println();
		}
		
		System.out.println("Tong luong phai tra cho can bo trong truong: " + tongLuong);
		

	}

}
