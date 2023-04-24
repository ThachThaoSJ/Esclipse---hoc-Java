package cau_truc_switchcase;

import java.util.Scanner;

public class PhepToanSoNguyen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a,b;
		String phepTinh = "";
		System.out.println("Nhap vao so nguyen thu nhat:");
		a = scanner.nextInt();
		System.out.println("Nhap vao so nguyen thu hai:");
		b = scanner.nextInt();
		System.out.println("Nhap vao phep toan:");
		phepTinh = scanner.next();
		
		switch (phepTinh) {
		case "+":
			System.out.println(a + " + " + b + " = " + (a+b));
			break;
		case "-":
			System.out.println(a + " - " + b + " = " + (a-b));
			break;
		case "*":
			System.out.println(a + " * " + b + " = " + (a*b));
			break;
		case "/":
			if (b == 0) {
				System.out.println("So bi chia phai khac 0");
			} else {
			System.out.println(a + " / " + b + " = " + (float)(a/b));
			}
			break;
			default:
				System.out.println("Phep toan khong hop le");
		}

	}

}
