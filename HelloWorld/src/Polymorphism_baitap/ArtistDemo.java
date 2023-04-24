package Polymorphism_baitap;

public class ArtistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vẽ hình chữ nhật có chiều dài = 8 và chiều rộng = 4");
        Shape shape = new Rectangle(8, 4);  // lúc này shape có vai trò là 1 Rectangle
        Artist artist = new Artist();
        artist.drawShape(shape);
         
        System.out.println("\nVẽ hình tam giác vuông có cạnh vuông = 10");
        shape = new RightTriangle(10);  // còn lúc này shape có vai trò là 1 RightTriangle
        artist = new Artist();
        artist.drawShape(shape);

	}

}
