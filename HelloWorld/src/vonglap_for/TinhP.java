package vonglap_for;

import java.util.Scanner;

public class TinhP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n:");
		int n = scanner.nextInt();
		
		
		int P = 1, i;
		for (i = 1; i <= 2*n +1; i +=2) {
			P *= i;
		}
		System.out.println("P = " + P);

	}

}
