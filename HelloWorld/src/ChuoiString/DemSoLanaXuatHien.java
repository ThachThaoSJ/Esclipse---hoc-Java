package ChuoiString;

import java.util.Scanner;

public class DemSoLanaXuatHien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		char kyTu = 'a';
		
		//Nhap chuoi
		System.out.println("Nhap vao chuoi:");
		String chuoi = scanner.nextLine();
		
		//dem so a
		for (int i = 0; i < chuoi.length(); i++) {
			if (chuoi.charAt(i) == kyTu) {
				count++;
			}
		}
		System.out.println("Chu \"a\" xuat hien " + count + " lan trong chuoi " + chuoi);

	}

}
