package ChuoiString;

import java.util.Scanner;

public class InKyTuCuaChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Nhap chuoi
		System.out.println("Nhap vao chuoi:");
		String chuoi = scanner.nextLine();
		
		//in ra ky tu trong chuoi
		System.out.println("Ky tu trong chuoi:");
		for (int i = 0; i < chuoi.length(); i++) {
			System.out.println(chuoi.charAt(i));
		}

	}

}
