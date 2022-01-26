package kodluyoruz;

import java.util.Scanner;

public class ZodyagiHesaplama {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Doðum Yýlýnýz: ");
		int yil = scan.nextInt();
		
		String[] hayvanlar = {
				"Maymun",
				"Horoz",
				"Köpek",
				"Domuz",
				"Fare",
				"Öküz",
				"Kaplan",
				"Tavþan",
				"Ejderha",
				"Yýlan",
				"At",
				"Koyun"
		};
		
		int kalan = yil % 12;
		System.out.println("Çin Zodyaðý Burcunuz: " + hayvanlar[kalan]);
		
		
		
		
		
	}

}
