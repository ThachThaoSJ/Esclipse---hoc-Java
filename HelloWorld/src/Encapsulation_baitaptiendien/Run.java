package Encapsulation_baitaptiendien;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//nhap so ho su dung dien
		System.out.print("Nhap so ho su dung dien: ");
		int n = scanner.nextInt();
		
		ArrayList<BienLai> arrayBienLai = new ArrayList<>();
		BienLai hoSuDungDien;
		
		//nhap thong tin tung ho su dung dien
		for (int i = 0; i < n; i++) {
			hoSuDungDien = new BienLai();
			System.out.println("Nhap vao thong tin ho su dung dien thu " + (i + 1) + ": ");
			hoSuDungDien.nhapThongTinBienLai();
			arrayBienLai.add(hoSuDungDien);
			System.out.println();
		}
		
		//hien thi thong tin cac ho su dung dien & bienlai
		for (int i = 0; i < n; i++) {
			System.out.println("Thong tin ho thu " + (i + 1) + ": ");
			arrayBienLai.get(i).hienThongTinBienLai();
			System.out.println();
		}

	}

}
