package cautrucwhile;

import java.util.Scanner;

public class TinhGiaiThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen duong");
		int n = scanner.nextInt();
		while (n <= 0) {
			System.out.println("So nhap vao phai lon hon 0");
			System.out.println("Nhap vao so nguyen duong");
			n = scanner.nextInt();
		}
		
		int a = 1;
		int giaiThua = 1;
		while (a <= n) {
			giaiThua *= a;
			a++;
		}
		
		System.out.println(n + "! = " + giaiThua);

	}

}
