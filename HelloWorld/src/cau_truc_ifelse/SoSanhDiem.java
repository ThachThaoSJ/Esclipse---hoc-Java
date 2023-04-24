package cau_truc_ifelse;

import java.util.Scanner;

public class SoSanhDiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		float diemJava, diemWeb;
		
		System.out.println("Nhap diem mon lap trinh Java: ");
		diemJava = scanner.nextFloat();
		System.out.println("Nhap diem mon lap trinh Web: ");
		diemWeb = scanner.nextFloat();
		
		if (diemJava == diemWeb) {
			System.out.println("Diem hai mon bang nhau");
		} else if (diemJava > diemWeb) {
			System.out.println("Diem mon lap trinh Java cao hon diem mon lap trinh Web");
		} else {
			System.out.println("Diem mon lap trinh Java thap hon diem mon lap trinh Web");
		}

	}

}
