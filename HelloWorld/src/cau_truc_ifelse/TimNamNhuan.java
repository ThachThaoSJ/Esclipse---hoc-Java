package cau_truc_ifelse;

import java.util.Scanner;

public class TimNamNhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao nam can xac dinh:");
		int nam = scanner.nextInt();
		
//		if (nam % 100 == 0) {
//			if (nam % 400 == 0) {
//				System.out.println("Nam " + nam +" la nam nhuan");
//			} else {
//				System.out.println("Nam " + nam +" khong phai la nam nhuan");
//			}
//		} else if (nam % 4 == 0) {
//			System.out.println("Nam " + nam +" la nam nhuan");
//		} else {
//			System.out.println("Nam " + nam +" khong phai la nam nhuan");
//	}
		if (nam % 400 == 0) {
			System.out.println("nam nhuan");
		} else if (nam % 4 == 0 && nam % 100 != 0) {
			System.out.println("nam nhuan");
		} else {
			System.out.println("khong phai nam nhuan");
		}
}
}
