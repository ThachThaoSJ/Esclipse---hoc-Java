package baitap;

import java.util.Scanner;

public class ThongTinHocSinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap ten hoc sinh:");
		String tenHocSinh = scanner.nextLine();
		System.out.println("Nhap nam sinh:");
		int namSinh = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap dia chi:");
		String diaChi = scanner.nextLine();
		
		System.out.println("Ten hoc sinh: " + tenHocSinh);
		System.out.println("Nam sinhh: " + namSinh);
		System.out.println("Dia chi: " + diaChi);

	}

}
