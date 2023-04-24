package cau_truc_ifelse;

import java.util.Scanner;

public class SoSanhVoi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so can so sanh: ");
		int n = scanner.nextInt();
		
		if (n > 5) {
			System.out.println(n + " lon hon 5");
		} else if (n < 5) {
			System.out.println(n + " nho hon 5");
		} else {
			System.out.println(n + " bang 5");
		}

	}

}
