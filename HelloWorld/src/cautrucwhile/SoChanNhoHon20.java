package cautrucwhile;

import java.util.Scanner;

public class SoChanNhoHon20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		while (n <= 20) {
			if (n > 0 && n % 2 == 0) {
				System.out.println(n);
			}
			n++;
		}
	}
}

