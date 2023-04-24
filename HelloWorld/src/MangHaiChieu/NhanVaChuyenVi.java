package MangHaiChieu;

import java.util.Scanner;

public class NhanVaChuyenVi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//nhap m1 m2 n1 n2
		System.out.println("Nhap gia tri m1: ");
		int m1 = scanner.nextInt();
		System.out.println("Nhap gia tri n1: ");
		int n1 = scanner.nextInt();
		System.out.println("Nhap gia tri m2: ");
		int m2 = scanner.nextInt();
		System.out.println("Nhap gia tri n2: ");
		int n2 = scanner.nextInt();
		
		//khai bao mang 2 chieu
		int A[][] = new int[m1][n1];
		int B[][] = new int[m2][n2];
		int C[][] = new int[m1][n2];
		
	}

}
