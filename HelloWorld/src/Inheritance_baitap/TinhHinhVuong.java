package Inheritance_baitap;

import java.util.Scanner;

public class TinhHinhVuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap do dai canh hinh vuong: ");
		float n = scanner.nextFloat();
		HinhVuong hinhVuong = new HinhVuong(n);
		System.out.println("Chu vi hinh vuong: " + hinhVuong.chuVi());
		System.out.println("Dien tich hinh vuong: " + hinhVuong.dienTich());

	}

}
