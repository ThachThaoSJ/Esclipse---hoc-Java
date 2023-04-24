package ao;

public class dog implements animal {
	public void speak() {
		System.out.println("go go");
	}

	@Override
	public void walk() {
		System.out.println("bach bach");
		
	}
}
