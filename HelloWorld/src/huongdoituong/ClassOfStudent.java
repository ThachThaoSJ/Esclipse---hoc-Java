package huongdoituong;

import java.util.Scanner;

public class ClassOfStudent {
	private String name;
	private int numberOfPupils;
	
	public void inputYourClass() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten lop: ");
		name = scanner.nextLine();
		System.out.println("Nhap so hoc sinh: ");
		numberOfPupils = scanner.nextInt();
	}
	
	public void showInformation() {
		System.out.println("Ten lop la " + name + ", so hoc sinh la " + numberOfPupils);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
