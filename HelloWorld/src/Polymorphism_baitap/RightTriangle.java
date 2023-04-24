package Polymorphism_baitap;

public class RightTriangle extends Shape {
    private int canhVuong;

    public RightTriangle(int canhVuong) {
        this.canhVuong = canhVuong;
    }
 
     
    public void draw() {
        for (int i = 1; i <= canhVuong; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
 
            System.out.println();
        }
    }
}
