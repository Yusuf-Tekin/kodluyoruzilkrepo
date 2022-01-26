package kodluyoruz;

import java.util.Scanner;

public class UcakBiletFiyatýHesaplama {
	
	final double KM_BASÝ_UCRET = 0.10;
	Scanner scan = new Scanner(System.in);
	
	
	
	public double indirimliFiyat(int yas,double tutar) {
		if(yas < 12) {
			double yeniTutar = tutar - (tutar/2);
			return yeniTutar;
		}
		else if(yas >= 12 && yas <= 24) {
			double yeniTutar = tutar - ((tutar*10) /100);
			return yeniTutar;
		}
		else if (yas > 65) {
			double yeniTutar = tutar - ((tutar*30) /100);
			return yeniTutar;
		}
		else {
			System.out.println("Yaþýnýz için bir indirim uygulanmadý.");
			return tutar;
		}
	}
		
	public UcakBiletFiyatýHesaplama() {
		
		System.out.println("Uçuþ Mesafesi: ");
		int mesafe=scan.nextInt();
		
		System.out.println("Yaþ:");
		int yas = scan.nextInt();
		
		int i = 0;
		System.out.println("Bilet Tipi Seçin...\n1-Tek Yön\n2-Gidiþ-Dönüþ");
		int biletTipiSecimi = scan.nextInt();
		
		double normalTutar = mesafe*KM_BASÝ_UCRET;
		
		switch (biletTipiSecimi) {
		case 1:
			System.out.println("Ödenecek Tutar:" + indirimliFiyat(yas, normalTutar));
			break;
		case 2:
			System.out.println("Ödenecek Tutar:" + (2* indirimliFiyat(yas, normalTutar)));
			break;
		default:
			System.out.println("Bilet tipi hatalý. Lütfen uygun bir bilet türü seçin.");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new UcakBiletFiyatýHesaplama();
	}

}
