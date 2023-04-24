package ao;

public class duck implements animal {
	public void speak() {
		System.out.println("quack quack");
	}
	

	@Override
	public void walk() {
		System.out.println("bet bet");
		
	}
}
