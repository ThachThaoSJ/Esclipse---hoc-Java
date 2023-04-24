package vonglap_dowhile;

import java.util.Scanner;

public class TimSoNguyenLonNhat {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n:");
		int n = scanner.nextInt();
		
		int m = 0, sum = 0;
		
		while ((sum + m) < n ) {
            sum += ++m; // tăng m lên 1 đơn vị và tính sum = sum + m
            System.out.print(m);    // System.out.print(): hiển thị trên cùng 1 dòng
            if ((sum + m) < n) {
                System.out.print(" + ");
            }
        }
         
        if (sum > 0) {
            System.out.println(" = " + sum + " <= " + n);
        }
         
        System.out.println("m lớn nhất = " + m);
	}
	
}
