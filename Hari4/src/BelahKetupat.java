package Hari4;

public class BelahKetupat extends BidangDatar{
	
	private double sisidiagonal;
	private double diagonal1;
	private double diagonal2;
	
	public BelahKetupat(double sisidiagonal, double diagonal1, double diagonal2) {
		super();
		this.sisidiagonal = sisidiagonal;
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}

	public double getSisidiagonal() {
		return sisidiagonal;
	}

	public void setSisidiagonal(double sisidiagonal) {
		this.sisidiagonal = sisidiagonal;
	}

	public double getDiagonal1() {
		return diagonal1;
	}

	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}

	public double getDiagonal2() {
		return diagonal2;
	}

	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}

	public String luas() {
		luas = diagonal1 * diagonal2;
		return "Luas Belah Ketupat=" +luas+ "cm";
	}
	
	public String keliling() {
		keliling = 4 * sisidiagonal;
		return "Keliling Belah Ketupat=" +keliling+ "cm";
	}
	
	
	
	
}