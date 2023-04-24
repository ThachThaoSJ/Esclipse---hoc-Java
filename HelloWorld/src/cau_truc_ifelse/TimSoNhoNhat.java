package cau_truc_ifelse;

import java.util.Scanner;

public class TimSoNhoNhat {
	public static void main(String[] args) {
		int soThuNhat, soThuHai;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so thu nhat:");
		soThuNhat = scanner.nextInt();
		System.out.println("Nhap vao so thu hai: ");
		soThuHai = scanner.nextInt();
		
		int soNhoNhat = soThuNhat;
		
		if (soThuNhat > soThuHai) {
			soNhoNhat = soThuHai;
		}
		
		System.out.println("so nho nhat trong hai so " + soThuNhat + " va " + soThuHai + " la: " + soNhoNhat);
	}
} 