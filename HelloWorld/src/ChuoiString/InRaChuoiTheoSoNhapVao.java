package ChuoiString;

import java.util.Scanner;

public class InRaChuoiTheoSoNhapVao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Nhap so
		System.out.println("Nhap vao so: ");
		int i = scanner.nextInt();
		
		while (i < 1) {
			System.out.println("So nhap vao phai lon hon 1.");
			System.out.println("Nhap vao so: ");
			i = scanner.nextInt();
		}
		
		for (int a = 1; a <= i; a++) {
			System.out.println("Alarm!");
		}

	}

}
