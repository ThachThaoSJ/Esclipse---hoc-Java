package Abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThueBao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int loaiHinh;
		float tongCuocDialUp = 0, tongCuocADSL = 0, tongCuocT1 = 0;
		ArrayList<ThueBao> arrThueBao = new ArrayList<>();
		
		System.out.println("Nhap so luong thue bao: ");
		int soLuong = scanner.nextInt();
		ThueBao thueBao;
		for (int i = 0; i < soLuong; i++) {
			System.out.println("Nhap thong tin thue bao thu " + (i + 1) +": ");
			System.out.println("Nhap loai hinh thue bao (1 - Dial Up, 2 - ADSL, 3 - T1): ");
			loaiHinh = scanner.nextInt();
			switch (loaiHinh) {
			case 1:
				thueBao = new ThueBaoDialUp();
				thueBao.nhapThongTinThueBao();
				tongCuocDialUp += thueBao.tienCuoc();
				arrThueBao.add(thueBao);
				break;
			case 2:
				thueBao = new ThueBaoADSL();
				thueBao.nhapThongTinThueBao();
				tongCuocADSL += thueBao.tienCuoc();
				arrThueBao.add(thueBao);
				break;
			case 3:
				thueBao = new ThueBaoT1();
				thueBao.nhapThongTinThueBao();
				tongCuocT1 += thueBao.tienCuoc();
				arrThueBao.add(thueBao);
				break;
			default:
				System.out.println("Khong co loai thue bao nay.");
			}
		}
		
		for (int i = 0; i < arrThueBao.size(); i++) {
			arrThueBao.get(i).xuatThongTinThueBao();
		}
		
		System.out.println("Tong tien cuoc thue bao Dial Up: " + tongCuocDialUp);
		System.out.println("Tong tien cuoc thue bao ADSL: " + tongCuocADSL);
		System.out.println("Tong tien cuoc thue bao T1: " + tongCuocT1);
		System.out.println("Tong cuoc thu duoc cua tat ca thue bao: " + (tongCuocDialUp + tongCuocADSL + tongCuocT1));
		
		float temp = 0;
		ThueBaoADSL thueBaoADSLmax = new ThueBaoADSL();
		for (ThueBao thueBao1: arrThueBao) {
			if (thueBao1 instanceof ThueBaoADSL) {
				if (temp < thueBao1.tienCuoc()) {
					temp = thueBao1.tienCuoc();
					thueBaoADSLmax = (ThueBaoADSL) thueBao1;		
				}
			}
		}
		System.out.println("Thue bao ADSL co tien cuoc lon nhat: " );
		thueBaoADSLmax.xuatThongTinThueBao();
	}

}
