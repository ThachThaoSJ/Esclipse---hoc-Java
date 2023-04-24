package Encapsulation_baitapphanso;

public class PhanSo {
	private int tuSo, mauSo;
	
	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}

	public PhanSo(int tu, int mau) {
		this.tuSo = tu;
		this.mauSo = mau;
	}
	
	public int timUCLN (int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}
		
	public void toiGian ()	{
		int UCLN = timUCLN(getTuSo(), getMauSo());
		setTuSo(getTuSo()/UCLN);
		setMauSo(getMauSo()/UCLN);
	}
      
	
	public void cong(PhanSo ps) {
		int tuSoTong = getTuSo() * ps.getMauSo() + getMauSo() * ps.getTuSo();
		int mauSoTong = getMauSo() * ps.getMauSo();
		PhanSo phanSoTong = new PhanSo(tuSoTong, mauSoTong);
		phanSoTong.toiGian();
		System.out.println("Tong hai phan so = " + phanSoTong.tuSo + "/" + phanSoTong.mauSo);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo phanSo1 = new PhanSo(1,2);
		PhanSo phanSo2 = new PhanSo(7,5);
		
		phanSo1.cong(phanSo2);

	}

}
