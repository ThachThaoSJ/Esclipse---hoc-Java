package Inheritance_baitap;

public class HinhChuNhat {
	private float chieuDai, chieuRong;
	
	public float chuVi() {
		return (getChieuDai() + getChieuRong()) *2;
	}
	
	public float dienTich() {
		return getChieuDai() * getChieuRong();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public float getChieuRong() {
		return chieuRong;
	}

	public float setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
		return chieuRong;
	}

	public float getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}

}
