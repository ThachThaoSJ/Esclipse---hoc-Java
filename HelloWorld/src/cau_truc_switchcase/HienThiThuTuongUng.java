package cau_truc_switchcase;

import java.util.Scanner;

public class HienThiThuTuongUng {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so:");
		int so = scanner.nextInt();
		String thu = null;
		
		switch (so) {
		case 1:
			thu = "chu nhat";
			System.out.println("so " + so +" tuong ung voi " + thu);
			break;
		case 2:
			thu = "thu hai";
			System.out.println("so " + so +" tuong ung voi " + thu);
			break;
		case 3: 
			thu = "thu ba";
			System.out.println("so " + so +" tuong ung voi " + thu);
			break;
		case 4: 
			thu = "thu tu";
			System.out.println("so " + so +" tuong ung voi " + thu);
			break;
		case 5: 
			thu = "thu nam";
			System.out.println("so " + so +" tuong ung voi " + thu);
			break;
		case 6:
			thu = "thu sau";
			System.out.println("so " + so +" tuong ung voi " + thu);
			break;
		case 7: 
			thu = "thu bay";
			System.out.println("so " + so +" tuong ung voi " + thu);
			break;
		default:
			System.out.println("so nhap vao phai trong khoang 1 den 7");
		}
		
	}
}