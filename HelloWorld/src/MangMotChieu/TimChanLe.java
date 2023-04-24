package MangMotChieu;

import java.util.Scanner;

public class TimChanLe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//nhap kich thuoc mang:
		System.out.println("Nhap kich thuoc mang:");
		int size = scanner.nextInt();
		
		while (size <=0) {
			System.out.println("Kich thuoc mang phai lon hon 0.");
			System.out.println("Nhap lai kich thuoc mang:");
			size = scanner.nextInt();
		}
		
		// khai bao mang:
		int array[] = new int[size];
		
		// nhap phan tu mang:
		System.out.println("Nhap gia tri cho phan tu mang:");
		for (int i = 0; i < size; i++) {
			System.out.print("Nhap phan tu thu " + i + ": ");
			array[i] = scanner.nextInt();
		}
		
		//in ra mang vua nhap:
		System.out.print("Mang vua nhap: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + "\t");
		}
		
		// dem phan tu chan le
		int demChan = 0, demLe = 0;
		for (int i = 0; i < size; i++) {
			if (array[i] % 2 == 0) {
				demChan++;
			} else {
				demLe++;
			}
		}
		System.out.println("\nSo luong so nguyen le trong mang: " + demLe);
		System.out.println("So luong so nguyen chan trong mang: " + demChan);
		
		// xoa k
		System.out.println("Nhap so k:");
		int k = scanner.nextInt();
		int c = 0;
		
		for (int i = 0; i < size; i++) {
			if (array[i] != k) {
				array[c] = array[i];
				c++;
			}
		}
		//vong lap co size moi la c
		size = c;
		
		//mang sau khi xoa k:
		System.out.println("Mang con lai sau khi xoa phan tu " + k + " la:");
		for (int i = 0; i < c; i++) {
			System.out.print(array[i] + "\t");
		}

	}

}
