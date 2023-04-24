package datatype;

public class ImplicitCasting {
	public static void main(String[] args) {
		
//		int i = 99;
//		long l = i;
//		float f = l;
//		System.out.println("Gia tri bien i = " + i);
//		System.out.println("Gia tri bien l = " + l);
//		System.out.println("Gia tri bien f = " + f);
		
		double d = 100.04;
		long l = (long) d;
		int i = (int) l;
		System.out.println("Gia tri bien d = " + d);
		System.out.println("Gia tri bien l = " +l);
		System.out.println("Gia tri bien i = " + i);
	}
}