package cautrucwhile;

import java.util.Scanner;

public class DemSoChuSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen duong:");
		int n = scanner.nextInt();
		int count = 0;
		
		while (n > 0) {
			n /= 10;
			count++;
		}
		System.out.println("So chu so cua so " + n + " la: " + count);

	}

}