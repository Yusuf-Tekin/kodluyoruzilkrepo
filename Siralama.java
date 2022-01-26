package kodluyoruz;

import java.util.Scanner;

public class Siralama {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayý 1:");
		int sayi1 = scan.nextInt();
		
		System.out.println("Sayý 2:");
		int sayi2 = scan.nextInt();
		
		System.out.println("Sayi 3:");
		int sayi3 = scan.nextInt();
		
		int[] sayilar = {sayi1,sayi2,sayi3};
		
		for(int i = 0;i < sayilar.length;i++) {
			for(int j = i+1;j< sayilar.length;j++) {
				
				if(sayilar[i] < sayilar[j]) {
					int gecici = sayilar[j];
					sayilar[j] = sayilar[i];
					sayilar[i] = gecici;
				}
				
				
			}
		}
		
		
		for(int m = 0;m<sayilar.length;m++) {
			System.out.println(sayilar[m]);
		}
		
		
		
		
	}

}
