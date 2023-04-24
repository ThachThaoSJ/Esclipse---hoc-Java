package MangMotChieu;

import java.util.Scanner;

public class TachChanLe {

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
		
//		int[] mangChan = new int[size];
//		int mangLe[] = new int[size];
		
//		//c va l lan luot la size cua mang chan va mang le
//		int c, l;
//		for (int i = c = l = 0; i < size; i++) {
//			if (array[i] % 2 == 0) {
//				mangChan[c] = array[i];
//				c++;
//			} else {
//				mangLe[l] = array[i];
//				l++;
//			}
//		}
//		
//		//In ra 2 mang chan le
//		System.out.println("\nMang chan: ");
//		for (int i = 0; i < c; i++) {
//			System.out.print(mangChan[i] + "\t");
//		}
//		System.out.println("\nMang le: ");
//		for (int i = 0; i < l; i++) {
//			System.out.print(mangLe[i] + "\t");
//		}
		
//		int d = 0, s = 0;
//		int nuaDau[] = new int[size];
//		int nuaSau[] = new int[size];
//		for (int i = 0; i < size; i++) {
//			if (i < size/2) {
//				nuaDau[d] = array[i];
//				d++;
//			} else {
//				nuaSau[s] = array[i];
//				s++;
//			}
//		}
//		
//		//In ra 2 mang
//		System.out.println("\nMang dau: ");
//		for (int i = 0; i < d; i++) {
//			System.out.print(nuaDau[i] + "\t");
//		}
//		System.out.println("\nMang cuoi: ");
//		for (int i = 0; i < s; i++) {
//			System.out.print(nuaSau[i] + "\t");
//		}
		
//		//in ra phan tu % 5 == 0
//		System.out.println("\nCac phan tu chia het cho 5 trong mang: ");
//		for ( int i = 0; i < size; i++) {
//			if (array[i] % 5 == 0) {
//				System.out.print(array[i] + "\t");
//			}
//		}
		
		//nhap k
		System.out.println("\nNhap so k:");
		int k = scanner.nextInt();
		
		//dem so lan xuat hien
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (array[i] == k) {
				count++;
			}
		}
		System.out.println("So lan xuat hien cua so " + k + " trong mang la: " + count);

	}

}
