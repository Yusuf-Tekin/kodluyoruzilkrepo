package kodluyoruz;

import java.util.Scanner;

public class UsluHesaplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Taban Sayýsý: ");
		int taban = scan.nextInt();
		
		System.out.println("Kuvvet:");
		int kuvvet = scan.nextInt();
		
		int i = 1;
		int sonuc = 1;
		while(i <= kuvvet) {
			sonuc*=taban;
			i++;
		}
		
		
		System.out.println("Sonuç: " + sonuc);
	}

}
