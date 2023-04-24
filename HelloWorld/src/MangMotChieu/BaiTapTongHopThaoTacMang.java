package MangMotChieu;

import java.util.Scanner;

public class BaiTapTongHopThaoTacMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// nhap size mang
		System.out.println("Nhap kich thuoc mang:");
		int size = scanner.nextInt();
		
		while (size <= 0) {
			System.out.println("Kich thuoc mang phai lon hon 0");
			System.out.println("Nhap lai kich thuoc mang:");
			size = scanner.nextInt();
		}
		
		//khai bao mang
		int array[] = new int[size];
		
		//nhap phan tu mang
		System.out.println("Nhap phan tu cho mang:");
		for (int i = 0; i < size; i++) {
			System.out.print("Phan tu thu " + array[i] + ": ");
			array[i] = scanner.nextInt();
		}
		
		//in ra mang vua nhap
		System.out.print("Mang vua nhap: ");
		for ( int i = 0; i < size; i++) {
			System.out.print(array[i] + "\t");
		}
		
		//sap xep mang tu be den lon
		int temp;
		for (int i = 0; i < size - 1; i++) {
			for ( int j = i + 1; j <= size - 1; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		// phan tu lon nhat o cuoi, phan tu be nhat o dau
		System.out.println("\nPhan tu co gia tri lon nhat la " + array[size-1]);
		System.out.println("Phan tu co gia tri nho nhat la " + array[0]);
		
		// dem so phan tu chan
		int demChan = 0;
		for ( int i = 0; i < size; i++) {
			if (array[i] % 2 == 0) {
				demChan++;
			}
		}
		System.out.println("So phan tu chan la: " + demChan);
		
		System.out.print("Mang sau khi sap xep tang dan: ");
		for ( int i = 0; i < size; i++) {
			System.out.print(array[i] + "\t");
		}
		

	}

}
