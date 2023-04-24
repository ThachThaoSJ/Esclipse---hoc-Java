package baitap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BaiTapToanTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//lam tron ket qua phan du den 2 so thap phan
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		
		//nhap so
		System.out.println("Nhap vao so thu nhat:");
		int firstNumber = scanner.nextInt();
		System.out.println("Nhap vao so thu hai");
		int secondNumber = scanner.nextInt();
		
		//tinh tong hieu tich thuong so du
		int tong = firstNumber + secondNumber;
		System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
		
		int hieu = firstNumber - secondNumber;
		System.out.println(firstNumber + " - " + secondNumber + " = " + hieu);
		
		int tich = firstNumber * secondNumber;
		System.out.println(firstNumber + " * " + secondNumber + " = " + tich);
		
		float thuong = (float)firstNumber / secondNumber;
		System.out.println(firstNumber + " / " + secondNumber + " = " + decimalFormat.format(thuong));
		
		int phanDu = firstNumber % secondNumber;
		System.out.println(firstNumber + " % " + secondNumber + " = " + phanDu);
		
		//so sanh
		System.out.println("Ket qua so sanh bang 2 so la " + (firstNumber == secondNumber));
		System.out.println("Ket qua so sanh khong bang 2 so la " + (firstNumber != secondNumber));
		System.out.println("Ket qua so sanh so thu nhat lon hon so thu hai la " + (firstNumber > secondNumber));
		System.out.println("Ket qua so sanh so thu nhat lon hon hoac bang so thu hai la " + (firstNumber >= secondNumber));
		System.out.println("Ket qua so sanh so thu nhat nho hon so thu hai la " + (firstNumber < secondNumber));
		System.out.println("Ket qua so sanh so thu nhat nho hon hoac bang so thu hai la " + (firstNumber <= secondNumber));

	}

}
