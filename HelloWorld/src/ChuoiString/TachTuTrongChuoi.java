package ChuoiString;

import java.util.Scanner;

public class TachTuTrongChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//nhap chuoi:
		System.out.println("Nhap vao chuoi: ");
		String chuoi = scanner.nextLine();
		char kyTu;
		
		//tach tu
		for (int i = 0; i < chuoi.length(); i++) {
			kyTu = chuoi.charAt(i);
			if (Character.isSpace(kyTu)) {
				System.out.println();
			} else {
				System.out.print(kyTu);
			}
		}

	}

}
