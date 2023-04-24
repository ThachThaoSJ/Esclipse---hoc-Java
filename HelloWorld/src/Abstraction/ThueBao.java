package Abstraction;

import java.util.Scanner;

public abstract class ThueBao {
	Scanner scanner = new Scanner(System.in);
	public int thueBao, donGia;
	
	public abstract void nhapThongTinThueBao();
	public abstract void xuatThongTinThueBao();
	public abstract float tienCuoc();

}
