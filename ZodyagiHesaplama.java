package kodluyoruz;

import java.util.Scanner;

public class ZodyagiHesaplama {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Do�um Y�l�n�z: ");
		int yil = scan.nextInt();
		
		String[] hayvanlar = {
				"Maymun",
				"Horoz",
				"K�pek",
				"Domuz",
				"Fare",
				"�k�z",
				"Kaplan",
				"Tav�an",
				"Ejderha",
				"Y�lan",
				"At",
				"Koyun"
		};
		
		int kalan = yil % 12;
		System.out.println("�in Zodya�� Burcunuz: " + hayvanlar[kalan]);
		
		
		
		
		
	}

}
