package kodluyoruz;

import java.util.Scanner;

public class HesapMakinesý {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Sayý 1:");
			int sayi1 = scan.nextInt();
			
			System.out.println("Sayi 2:");
			int sayi2 = scan.nextInt();
			
			System.out.println("Ýþleminizi Seçin:\n1:Toplama\n2:Çýkarma\n3:Çarpma\n4:Bölme\n9: Çýkýþ");
			int secenek = scan.nextInt();
			
			switch (secenek) {
				case 1: 	
					System.out.println("Sonuç: " + (sayi1 + sayi2) );
					break;
				case 2:
					System.out.println("Sonuç: " + (sayi1-sayi2));
					break;
				case 3:
					System.out.println("Sonuç: " + (sayi1*sayi2));
					break;
				case 4:
					System.out.println("Sonuç : " + (sayi1/sayi2));
					break;
				case 9:
					System.out.println("Çýkýþ yapýldý...");
					return;
					
					
				default:
					throw new IllegalArgumentException("Unexpected value: " + secenek);
			}
		}
	
		
		
	}

}
