package vonglap_for;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TimS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		
		System.out.println("Nhap n:");
		int n = scanner.nextInt();
		
		while (n < 0) {
			System.out.println("n phai lon hon 0");
			System.out.println("Nhap n:");
			n = scanner.nextInt();
		}
		
		int S = 0, i;
		
//		// S = 1 + 3 + 5 + n + ... + (2n + 1).
//		for (i = 0; i <= n; i++) {
//			S += 2*i + 1;
//		}
		
//		//S = 1 - 2 + 3 - 4 + 5 + ... + ((-1)^(n+1)) * n
//		for (i = 1; i <= n; i++) {
//			if (i % 2 == 0) {
//				S -= i;
//			} else {
//				S +=i;
//			}
//		}
		
//		//S = 1 + 1.2 + 1.2.3 + ... + 1.2.3.n
//		int s = 1;
//		for (i = 1; i <= n; i++) {
//			s *= i;
//			S += s;
//		}
		
//		//S = 1^2 + 2^2 + 3^2 +... + n^2 (n > 0).
//		for (i = 1; i <= n; i++) {
//			S += i*i;
//		}

//		System.out.println("S = " + S);
		
//		//Q = 1 + 1/2 + 1/3 + ... + 1/n
//		float Q = 0;
//		for (i = 1; i <= n; i++) {
//			Q += (float) 1/i;
//		}
//		System.out.println("Q = " + decimalFormat.format(Q));
		
//		//U = 1/2 + 2/3 + 3/4 + ... + n/(n+1) (n > 0)
//		float U = 0;
//		for (i = 1; i <= n; i++) {
//			U += (float) i/(i+1);
//		}		
//		System.out.println("U = " + decimalFormat.format(U));
		
//		//K = 1 + 1/2! + 1/3! + ... + 1/n! (n > 0).
//		float K = 0;
//		int giaiThua = 1;
//		for (i = 1; i <= n; i++) {
//			giaiThua *= i;
//			K += (float) 1/giaiThua;
//		}
//		System.out.println("K = " + decimalFormat.format(K));
		
		//M = 1 + (1+2)/2! + (1+2+3)/3! + ... + (1+2+3+...+n)/n! (n > 0).
		float M = 0;
		int tong = 0;
		int giaiThua = 1;
		for (i = 1; i <= n; i++) {
			tong += i;
			giaiThua *=i;
			M += (float) tong/giaiThua;
		}
		System.out.println("M = " + decimalFormat.format(M));

	}

}
