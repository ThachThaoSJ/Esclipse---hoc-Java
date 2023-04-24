package Encapsulation_baitap;

import java.util.Scanner;

public class Mang {
	int n;
	public int array[];
	
	public void nhapKichThuocMang() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap kich thuoc mang: ");
		n = scanner.nextInt();
		array = new int[n];
	}
	
	public void nhapPhanTu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap phan tu mang: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Nhap phan tu thu " + i + ": ");
			array[i] = scanner.nextInt();
		}
		
	}
	
	public void hienThiMang() {
		System.out.println("Mang vua nhap: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
	
	public int timMax() {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public int timMin() {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mang array = new Mang();
		array.nhapKichThuocMang();
		array.nhapPhanTu();
		array.hienThiMang();
		System.out.println("\nPhan tu lon nhat la " + array.timMax());
		System.out.println("Phan tu nho nhat la " + array.timMin());;

	}

}
