package MangHaiChieu;

import java.util.Scanner;

public class ChanDuongNhoNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//nhap so dong cot
		System.out.print("Nhap so dong: ");
		int m = scanner.nextInt();
		System.out.print("Nhap so cot: ");
		int n = scanner.nextInt();
		
		//khai bao ma tran
		int array[][] = new int[m][n];
		
		// nhap phan tu:
		System.out.println("Nhap phan tu cho ma tran:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Nhap phan tu thu [" + i + "][" + j + "]: ");
				array[i][j] = scanner.nextInt();
			}
		}
		
		// in ra ma tran
		System.out.println("Ma tran vua nhap:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		// tim chan duong nho nhat
		int min = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i][j] % 2 == 0 && array[i][j] > 0) {
					if (min == 0) {
						min = array[i][j];
					} else if (array[i][j] < min) {
						min = array[i][j];
					}
				} 
			}
		}
		System.out.println("Phần tử chẵn dương nhỏ nhất trong ma trận = " + min);

	}

}
