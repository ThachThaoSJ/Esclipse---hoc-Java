package Inheritance_baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyGiaoDichNhaDat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<GiaoDichDat> arrGDDat = new ArrayList<>();
		ArrayList<GiaoDichNha> arrGDNha = new ArrayList<>();
		GiaoDichDat gdDat;
		GiaoDichNha gdNha;
		double thanhTienGDDat = 0;
		
		System.out.println("Nhap vao so giao dich dat: ");
		int soGDDat = scanner.nextInt();
		for (int i = 0; i < soGDDat; i++) {
			gdDat = new GiaoDichDat();
			System.out.println("Nhap vao giao dich dat thu " + (i + 1) +": ");
			gdDat.nhapGDDat();
			thanhTienGDDat += gdDat.thanhTienGDDat();
			arrGDDat.add(gdDat);
			System.out.println();
		}
		
		if (soGDDat > 0) {
			System.out.println("Cac giao dich dat hien co: ");
			for (int i = 0; i < soGDDat; i++) {
				System.out.println("Giao dich dat thu " + (i + 1) +": ");
				arrGDDat.get(i).xuatGDDat();
				System.out.println();
			}
		}
				
		System.out.println("Nhap vao so giao dich nha: ");
		int soGDNha = scanner.nextInt();
		for (int i = 0; i < soGDNha; i++) {
			gdNha = new GiaoDichNha();
			System.out.println("Nhap vao giao dich nha thu " + (i + 1) +": ");
			gdNha.nhapGDNha();
			arrGDNha.add(gdNha);
			System.out.println();
		}
		
		if (soGDNha > 0) {
			System.out.println("Cac giao dich nha hien co: ");
			for (int i = 0; i < soGDNha; i++) {
				System.out.println("Giao dich nha thu " + (i + 1) +": ");
				arrGDNha.get(i).xuatGDNha();
				System.out.println();
			}
		}
		
		System.out.println("Trung binh thanh tien gd Dat: " + (double)thanhTienGDDat/soGDDat);
		
		System.out.println("Cac giao dich dat thang 9 năm 2013: ");
		for (int i = 0; i < soGDDat; i++) {
			String[] ngayGDDat = arrGDDat.get(i).getNgayGD().split("/");
			if (ngayGDDat[1].equals("9") && ngayGDDat[2].equals("2013")) {
				arrGDDat.get(i).xuatGDDat();
			} else {
				System.out.println("Khong co giao dich dat vao thang 9 nam 2013");
			}
		}
		

	}

}
