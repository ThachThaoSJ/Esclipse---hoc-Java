package Encapsulation_baitap;

public class Person {
	private String cmnd;
	private String hoTen;
	
	public String getCmnd() {
		return cmnd;
	}
	
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		person.setHoTen("thao");
		person.setCmnd("3086400");
		
		System.out.println("Ten: " + person.getHoTen() + "\nSo CMND: " + person.getCmnd());

	}

}
