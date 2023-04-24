package MangHaiChieu;

import java.util.Scanner;

public class TrungBinhMin {

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
		
		//tính giá trị trung bình của các phần tử nhỏ nhất trên mỗi cột của ma trận
		int sum = 0;
		for (int j = 0; j < n; j++) {
			int min = array[0][j];
			for (int i = 0; i < m; i++) {
				if (array[i][j] < min) {
					min = array[i][j];
				}
			}
			sum += min;
		}
		
		System.out.println("Tong min = " + sum);
		float avg = (float) sum/n;
		
		System.out.println("Gia tri trung binh cua cac phan tu nho nhat tren moi cot = " + avg);
		
		//tìm và in ra màn hình phần tử lớn nhất và vị trí của phần tử đó trong ma trận số nguyên
		
		int max = array[0][0];
		for (int i = 0; i < m; i++) {
			for ( int j = 0; j < n; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
				}
			}
		}
		System.out.println("Phan tu co gia tri lon nhat la " + max);
		
		System.out.print("Phan tu co gia tri lon nhat nam tai vi tri: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (max == array[i][j]) {
					System.out.print("[" + i + "][" + j + "]" + "\t");
				}
			}
		}
	}

}
