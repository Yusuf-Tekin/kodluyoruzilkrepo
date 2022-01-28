package kodluyoruz;

import java.util.Arrays;
import java.util.Scanner;

public class ElemanSiralama {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç sayý gireceksin: ");
		int miktar = scan.nextInt();
		
		int[] sayilar = new int[miktar];
		
		int i = 0;
		while(i < miktar) {
			System.out.print((i+1) + ". eleman:");
			int sayi = scan.nextInt();
			sayilar[i] = sayi;
			i++;
		}
		
		Arrays.sort(sayilar);
		
		
		System.out.println("Sýralama: " + Arrays.toString(sayilar));
		
		
		
	}

}
