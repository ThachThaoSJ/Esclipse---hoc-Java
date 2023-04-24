package vonglap_for;

import java.util.Scanner;

public class TinhTrungBinhCong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so cac so nguyen: ");
		int n = scanner.nextInt();
		int i, number, sum = 0;
		
		for (i = 1; i <= n; i++) {
			System.out.println("Nhap vao so thu " + i);
			number = scanner.nextInt();
			sum += number;
		}
		
		System.out.println("Trung binh cong " + n + " so nguyen vua nhap la: " + (float)sum/n);

	}

}
