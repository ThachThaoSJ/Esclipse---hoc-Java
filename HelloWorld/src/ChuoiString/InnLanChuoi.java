package ChuoiString;

import java.util.Scanner;

public class InnLanChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Nhap chuoi
		System.out.println("Nhap chuoi:");
		String chuoi = scanner.nextLine();
		
		//Nhap n:
		System.out.println("Nhap so nguyen n:");
		int n = scanner.nextInt();
		while (n <= 0) {
			System.out.println("So n phai lon hon 0");
			System.out.println("Nhap lai so n: ");
			n = scanner.nextInt();		
		}
	
		//ghep chuoi
		System.out.println("ghep chuoi: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(chuoi);
		}

	}

}
