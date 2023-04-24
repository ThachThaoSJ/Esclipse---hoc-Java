package ao;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] agrs) {
		batthusua(new dog());
		batthusua(new duck());
	}
	
	public static void batthusua(animal as) {
		as.speak();
	}
}
