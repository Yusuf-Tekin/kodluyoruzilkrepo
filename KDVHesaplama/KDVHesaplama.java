package kodluyoruz.KDVHesaplama;

import java.util.Scanner;

public class KDVHesaplama {
	
	IKdvHesapla iKdvHesapla;
	
	public KDVHesaplama(IKdvHesapla ikdvHesapla) {
		this.iKdvHesapla = ikdvHesapla;
	}
	
	
	public static void main(String[] args) {
	
		
		KDVHesaplama hesapla;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Tutar:");
		int tutar = scanner.nextInt();
		
		if(tutar > 0 && tutar < 1000) {
			hesapla = new KDVHesaplama(new DusukFiyatKdv());
			float yeniFiyat = hesapla.iKdvHesapla.fiyatHesapla(tutar);
			System.out.println("KDV'Lİ Fiyatı: " + yeniFiyat);
		}
		else {
			hesapla = new KDVHesaplama(new YuksekFiyatKdv());
			float yeniFiyat = hesapla.iKdvHesapla.fiyatHesapla(tutar);
			System.out.println("KDV'Lİ Fiyatı: " + yeniFiyat);
		}
		
		
		
	}
	
	
}
