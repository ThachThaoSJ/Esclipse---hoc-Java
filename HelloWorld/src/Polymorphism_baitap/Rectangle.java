package Polymorphism_baitap;

public class Rectangle extends Shape {
    private int chieuDai, chieuRong;
 

    public Rectangle(int chieuDai, int chieuRong) {
 
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

     
    public void draw() {
        // vẽ chiều rộng
        for (int i = 1; i <= chieuRong; i++) {
            // vẽ chiều dài
            for (int j = 1; j <= chieuDai; j++) {
                if ((j == 1) || (j == chieuDai) || (i == 1) || (i == chieuRong)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
