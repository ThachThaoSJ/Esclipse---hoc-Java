package baitap;

import java.util.Scanner;

public class CelciusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao do C:");
		float celcius = scanner.nextFloat();
		
		float fahrenheit = (float)9/5 * celcius + 32;
		System.out.println(celcius + " độ C = " + fahrenheit + " độ F");

	}

}
