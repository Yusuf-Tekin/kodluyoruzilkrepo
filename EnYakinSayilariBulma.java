package kodluyoruz;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayilariBulma {
	
	public static void main(String[] args) {
		
		
		int[] sayilar = new int[6];
		
		sayilar[0] = 10;
		sayilar[1] = 5;
		sayilar[2] = -5;
		sayilar[3] = 23;
		sayilar[4] = 12;

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Girilen Sayý: ");
		int sayi = scan.nextInt();
		
		sayilar[sayilar.length-1] = sayi;
		
		Arrays.sort(sayilar);
		System.out.println("Sayýlar: " + Arrays.toString(sayilar));
		
		
		
		int index = Arrays.binarySearch(sayilar, sayi);
		int buyukEnKucuk = 0;
		int kucukEnBuyuk = 0;
		if(index != sayilar.length -1 && index != 0) {
			buyukEnKucuk = sayilar[index+1];
			kucukEnBuyuk = sayilar[index-1];
		}
		else if(index == 0) {
			buyukEnKucuk = sayilar[index+1];
		}
		else if(index == sayilar.length -1) {
			kucukEnBuyuk = sayilar[index-1];

		}
		
		System.out.println(String.format("%d sayisindan buyuk en kucuk: %d", sayi,buyukEnKucuk));
		System.out.println(String.format("%d sayisindan kucuk en buyuk: %d", sayi,kucukEnBuyuk));
	}

}
