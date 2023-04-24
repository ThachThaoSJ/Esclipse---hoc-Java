package Encapsulation_baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
	public String tenSach;
	public int tongSoSach, soDangChoMuon, soSachConLai;
	
	Scanner scanner = new Scanner(System.in);
	
	ArrayList<String> arrayBook = new ArrayList<>();
	
	public void nhap() {		
		System.out.println("Nhap tong so sach: ");
		tongSoSach = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap ten sach: ");
		for (int i = 1; i <= tongSoSach; i++) {
			System.out.print("Nhap ten sach thu " + i + ": ");
			tenSach = scanner.nextLine();
			arrayBook.add(tenSach);
		}
		System.out.println("Nhap so sach dang cho muon: ");
		soDangChoMuon = scanner.nextInt();
	}
	
	public void hienThiThongTin() {
		System.out.println("Cac quyen sach hien dang co trong thu vien: ");
		for (int i = 0; i < arrayBook.size(); i++) {
			System.out.println(arrayBook.get(i));
		}
	}
	
	public int soSachConLai() {
		return tongSoSach - soDangChoMuon;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book sach = new Book();
		
		sach.nhap();
		
		sach.hienThiThongTin();
		
		System.out.println("So sach hien co trong thu vien: " + sach.soSachConLai());

	}

}
