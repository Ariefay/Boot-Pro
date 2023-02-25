package Hari4;

public class Segitiga extends BidangDatar {

	private double alas;
	private double tinggi;
	private double sisiA;
	private double sisiB;
	private double sisiC;

	public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
		super();
		this.alas = alas;
		this.tinggi = tinggi;
		this.sisiA = sisiA;
		this.sisiB = sisiB;
		this.sisiC = sisiC;
	}

	public double getAlas() {
		return alas;
	}

	public void setAlas(double alas) {
		this.alas = alas;
	}

	public double getTinggi() {
		return tinggi;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	public double getSisiA() {
		return sisiA;
	}

	public void setSisiA(double sisiA) {
		this.sisiA = sisiA;
	}

	public double getSisiB() {
		return sisiB;
	}

	public void setSisiB(double sisiB) {
		this.sisiB = sisiB;
	}

	public double getSisiC() {
		return sisiC;
	}

	public void setSisiC(double sisiC) {
		this.sisiC = sisiC;
	}
	public String luas(){
		luas = 0.5 * alas * tinggi;
		return "luas segitiga=" +luas+ "cm";
	}
	
	public String keliling() {
		keliling = sisiA + sisiB + sisiC;
		return "keliling segitiga=" +keliling+ "cm";
	}
}