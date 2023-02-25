package Hari4;

public class Lingkaran extends BidangDatar{
	private double jariJari;
	final double phi = 3.14;
	
	public Lingkaran(double jariJari) {
		super();
		this.jariJari = jariJari;
	}
	
	public double getJariJari() {
		return jariJari;
	}
	public void setJariJari(double jariJari) {
		this.jariJari = jariJari;
	}
	
	public String luas() {
		luas = phi * jariJari * jariJari;
		return "Luas Lingkaran=" +luas+ "cm";
	}
	
	public String keliling() {
		keliling = 2* phi * jariJari;
		return "Keliling Lingkaran=" +keliling+ "cm";
	}
	
}