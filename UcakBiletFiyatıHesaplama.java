package kodluyoruz;

import java.util.Scanner;

public class UcakBiletFiyat�Hesaplama {
	
	final double KM_BAS�_UCRET = 0.10;
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
			System.out.println("Ya��n�z i�in bir indirim uygulanmad�.");
			return tutar;
		}
	}
		
	public UcakBiletFiyat�Hesaplama() {
		
		System.out.println("U�u� Mesafesi: ");
		int mesafe=scan.nextInt();
		
		System.out.println("Ya�:");
		int yas = scan.nextInt();
		
		int i = 0;
		System.out.println("Bilet Tipi Se�in...\n1-Tek Y�n\n2-Gidi�-D�n��");
		int biletTipiSecimi = scan.nextInt();
		
		double normalTutar = mesafe*KM_BAS�_UCRET;
		
		switch (biletTipiSecimi) {
		case 1:
			System.out.println("�denecek Tutar:" + indirimliFiyat(yas, normalTutar));
			break;
		case 2:
			System.out.println("�denecek Tutar:" + (2* indirimliFiyat(yas, normalTutar)));
			break;
		default:
			System.out.println("Bilet tipi hatal�. L�tfen uygun bir bilet t�r� se�in.");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new UcakBiletFiyat�Hesaplama();
	}

}
