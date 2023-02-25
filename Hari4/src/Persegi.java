package Hari4;

public class Persegi extends BidangDatar{
	private double sisiD;
	
	public Persegi(double sisiD) {
		super();
		this.sisiD = sisiD;
	}

	public double getSisiD() {
		return sisiD;
	}

	public void setSisiD(double sisiD) {
		this.sisiD = sisiD;
	}
	public String luas() {
		luas = sisiD * sisiD;
		return "Luas Persegi=" +luas+ "cm";
	}
	
	public String keliling() {
		keliling = 4 * sisiD;
		return "Keliling Persegi=" +keliling+ "cm";
	}

}
