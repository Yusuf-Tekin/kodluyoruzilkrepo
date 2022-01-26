package kodluyoruz;

import java.util.Scanner;

public class KombinasyonHesaplama {
	
	
	public static int faktoriyelHesapla(int sayi) {
		int sonuc = 1;
		while(sayi >= 1) {
			sonuc *=sayi;
			sayi--;
		}
		return sonuc;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("K�me Eleman Say�s�: ");
		int eleman = scan.nextInt();
		
		System.out.println("Ka�l� Kombinasyon: ");
		int kombinasyon = scan.nextInt();
		
		int sonuc = faktoriyelHesapla(eleman) / (faktoriyelHesapla(kombinasyon) * faktoriyelHesapla(eleman-kombinasyon));
		
		System.out.println(String.format("%d elemanl� bir k�menin %d'li kombinasyonu: %d",eleman,kombinasyon,sonuc ));
	
		
	}

}
