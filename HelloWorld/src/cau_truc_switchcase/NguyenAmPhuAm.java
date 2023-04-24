package cau_truc_switchcase;

import java.util.Scanner;

public class NguyenAmPhuAm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String NguyenAm = "";
		System.out.println("Nhap vao chu cai can xac dinh: ");
		NguyenAm = scanner.next();
		
		switch (NguyenAm) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("Day la nguyen am.");
			break;
		default:
			System.out.println("Day la phu am.");
				
		}

	}

}
