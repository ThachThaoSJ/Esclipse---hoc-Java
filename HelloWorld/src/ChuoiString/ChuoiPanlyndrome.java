package ChuoiString;

import java.util.Scanner;

public class ChuoiPanlyndrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//nhap chuoi:
		System.out.println("Nhap vao chuoi:");
		String chuoi = scanner.nextLine();
		char kyTu;
		int kt =1;
		
		for (int i = 0; i < chuoi.length(); i++) {
			kyTu = chuoi.charAt(i);
            if (kyTu != chuoi.charAt(chuoi.length() - i - 1)) {
            	kt = 0;
            	break;
            }
            
		}
		if (kt == 0) {
	        System.out.println("Chuỗi vừa nhập không phải là chuỗi đối xứng");
	    } else {
	        System.out.println("Chuỗi vừa nhập là chuỗi đối xứng");
	    }

	}

}
