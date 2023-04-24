package Encapsulation_baitaphhocsinhTHPT;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so hoc sinh: ");
		int n = scanner.nextInt();
		
		ArrayList<HoSoHocSinh> arrayHoSo = new ArrayList<>();
		HoSoHocSinh hocSinh;
		
		for (int i = 0; i < n; i++) {
			hocSinh = new HoSoHocSinh();
			System.out.println("Nhap thong tin hoc sinh thu " + (i + 1) + ": ");
			hocSinh.nhapThongTinHoSo();
			arrayHoSo.add(hocSinh);
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("Thong tin hoc sinh thu " + (i + 1) + ": ");
			arrayHoSo.get(i).hienThongTinHoSo();
			System.out.println();
		}
		
		System.out.println("\nThong tin cac hoc sinh que o Thai Nguyen:");
		for (int i = 0; i < n; i++) {
			if(arrayHoSo.get(i).getNguoi().getQueQuan().equalsIgnoreCase("Thai Nguyen")) {
				arrayHoSo.get(i).hienThongTinHoSo();
			}
			System.out.println();
		}
		
		System.out.println("Thong tin cac hoc sinh lop 10A1:");
		for (int i = 0; i < n; i++) {
			if(arrayHoSo.get(i).getLop().equalsIgnoreCase("10A1")) {
				arrayHoSo.get(i).hienThongTinHoSo();
			}
			System.out.println();
		}
		

	}

}
