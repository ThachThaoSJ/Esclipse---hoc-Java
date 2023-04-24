package Encapsulation_baitap;

import java.util.Scanner;

public class Student {
	public String hoTen, lop;
	public double diemToan, diemLy, diemHoa;

	
	public void thongTinHocSinh() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhap lop: ");
		lop = scanner.nextLine();
		System.out.println("Nhap diem Toan: ");
		diemToan = scanner.nextDouble();
		System.out.println("Nhap diem Ly: ");
		diemLy = scanner.nextDouble();
		System.out.println("Nhap diem Hoa: ");
		diemHoa = scanner.nextDouble();
	}
	
	public double tinhDiemTrungBinh (double a, double b, double c) {
		return (a + b + c)/3;
	}
	
	public String xepLoaiHocLuc(double diemTrungBinh) {
		if (diemTrungBinh >=8 && diemTrungBinh <= 10) {
			return "gioi";
		} 
		if (diemTrungBinh < 8 && diemTrungBinh >= 6.5) {
			return "kha";
		}
		if (diemTrungBinh < 6.5 && diemTrungBinh >= 5) {
			return "trung binh";
		}
		if (diemTrungBinh < 5 && diemTrungBinh >=0) {
			return "yeu";
		}
		return "nhap sai!";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hocSinh = new Student();
		
		hocSinh.thongTinHocSinh();
		
		System.out.println("diem trung binh 3 mon = " + hocSinh.tinhDiemTrungBinh(hocSinh.diemToan, hocSinh.diemLy, hocSinh.diemHoa));
		
		System.out.println(hocSinh.xepLoaiHocLuc(hocSinh.tinhDiemTrungBinh(hocSinh.diemToan, hocSinh.diemLy, hocSinh.diemHoa)));
		

	}

}
