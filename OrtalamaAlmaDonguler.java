package kodluyoruz;

import java.util.Scanner;

public class OrtalamaAlmaDonguler {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Say� girin:");
		int sayi = scan.nextInt();
		int toplam = 0;
		int kacSayiOldu = 0;
		for(int i = 0;i<=sayi;i++) {
			
			if(i % 3 == 0 && i % 4 == 0) {
				toplam+=i;
				kacSayiOldu++;
			}
			
			
		}
		
		
		System.out.println("Say�lar�n Ortalamas�: " + (toplam / kacSayiOldu));
		
	}

}
