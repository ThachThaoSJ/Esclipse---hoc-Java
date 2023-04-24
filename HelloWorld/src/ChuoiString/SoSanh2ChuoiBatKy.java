package ChuoiString;

import java.util.Scanner;

public class SoSanh2ChuoiBatKy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Nhap vao 2 chuoi
		System.out.println("Chuoi 1: ");
		String chuoi1 = scanner.nextLine();
		System.out.println("Chuoi 2: ");
		String chuoi2 = scanner.nextLine();
		
		// So sanh 2 chuoi bang compareToIgnoreCase() (khong phan biet chu hoa chu thuong)
		int result1 = chuoi1.compareToIgnoreCase(chuoi2);
		if (result1 == 0) {
			System.out.println("Chuoi 1 = Chuoi 2");
		} else if (result1 < 0) {
			System.out.println("Chuoi 1 < Chuoi 2");
		} else {
			System.out.println("Chuoi 1 > chuoi 2");
		}
		
		// So sanh 2 chuoi bang compareTo() (phan biet chu hoa chu thuong - chi dem chu thuong)
				int result2 = chuoi1.compareTo(chuoi2);
				if (result2 == 0) {
					System.out.println("Chuoi 1 = Chuoi 2");
				} else if (result2 < 0) {
					System.out.println("Chuoi 1 < Chuoi 2");
				} else {
					System.out.println("Chuoi 1 > chuoi 2");
				}

	}

}
