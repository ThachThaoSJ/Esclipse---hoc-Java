package cautrucwhile;

import java.util.Scanner;

public class TinhTongBinhPhuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen duong: ");
		int n = scanner.nextInt();
		
		while (n <= 0) {
			System.out.println("So nhap vao phai lon hon 0");
			System.out.println("Nhap lai so nguyen duong: ");
			n = scanner.nextInt();
		}
		
		long tongBinhPhuong = 0;
		int a = 1;
		while (a <= n) {
			tongBinhPhuong += a*a;
			a++;
		}
		System.out.println("Tong binh phuong cua " + n + " bang: " + tongBinhPhuong);

	}

}