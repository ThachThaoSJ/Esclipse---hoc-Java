package baitap;

import java.util.Scanner;

public class TinhTongChuSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, soDu, tong = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap vao so nguyen duong bat ky: ");
		n = scanner.nextInt();
		
		while (n > 0) {
			soDu = n % 10;
			n = n/10;
			tong += soDu;
		}
		System.out.println("Tong cac chu so = " + tong);

	}

}
