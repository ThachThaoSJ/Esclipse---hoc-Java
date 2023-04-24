package MangHaiChieu;

import java.util.Scanner;

public class TimMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//nhap so dong va cot cua array
		System.out.print("Nhap vao so dong cua ma tran: ");
		int m = scanner.nextInt();
		System.out.print("Nhap vao so cot cua ma tran: ");
		int n = scanner.nextInt();
		
		//khai bao ma tran m dong n cot
		int array[][] = new int[m][n];
		
		//nhap gia tri phan tu
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Nhap phan tu thu [" + i + "][" + j + "]:");
				array[i][j] = scanner.nextInt();
			}
		}
		
		//in ra ma tran
		System.out.println("Ma tran vua nhap:");
		for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		//tim max
		int max = array[0][0];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}
		System.out.println("Gia tri lon nhat trong ma tran la: " + max);
		
		//tinh tong tren duong cheo chinh (m = n)
		int sum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					sum += array[i][j];
				}
			}
		}
		System.out.println("Tong cac phan tu tren duong cheo chinh: "  + sum);
		
		//tim max tren duong cheo chinh (m = n)
		int maxx = array[0][0];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j && maxx < array[i][j]) {
						maxx = array[i][j];
				}
			}
		}
		System.out.println("Gia tri lon nhat tren duong cheo chinh la: " + maxx);
		
		//tim min tren duong cheo chinh (m = n)
		int minn = array[0][0];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j && minn > array[i][j]) {
						minn = array[i][j];
				}
			}
		}
		System.out.println("Gia tri nho nhat tren duong cheo chinh la: " + minn);

	}

}
