package Hari4.Main;

import Hari4.BelahKetupat;
import Hari4.BidangDatar;
import Hari4.Lingkaran;
import Hari4.Persegi;
import Hari4.Segitiga;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");

		Segitiga segitiga = new Segitiga(5,5,5,5,5);
		Persegi persegi = new Persegi(5);
		Lingkaran lingkaran = new Lingkaran(5);
		BelahKetupat belahKetupat = new BelahKetupat(5, 5, 5);

		BidangDatar[] kumpulanBidangDatar = { segitiga, persegi, lingkaran, belahKetupat };
		{

			for (BidangDatar i : kumpulanBidangDatar) {
				System.out.println(i.keliling());
				System.out.println(i.luas());
			}

		}
	}
}
