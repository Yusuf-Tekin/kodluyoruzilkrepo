package kodluyoruz;

import java.util.Scanner;

public class MukemmelSayiBulma {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayý girin: ");
		int sayi = scan.nextInt();
		int toplam = 0;
		int i = 1;
		while(i < sayi) {
			if(sayi % i == 0) {
				toplam += i;
			}
			i++;
		}
		
		if(toplam == sayi) {
			System.out.println(String.format("%d mukemmel bir sayidir.", sayi));
		}
		else {
			System.out.println(String.format("%d mukemmel bir sayi deðildir.", sayi));
		}

	}

}
