package kodluyoruz;

import java.util.Scanner;

public class EbobEkokBulma {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayý 1:");
		int sayi1 = scan.nextInt();
		
		System.out.println("Sayý 2:");
		int sayi2 = scan.nextInt();
		
		int i = 1;
		int buyukSayi = Math.max(sayi1, sayi2);
		int ebob = 0;
		
		while(i <= buyukSayi) {
			if(sayi1 % i == 0 && sayi2 % i == 0) {
				ebob = i;
			}
			i++;
		}
	
		
		int ekok = (sayi1*sayi2) / ebob;
		
		System.out.println("EBOB -> " + ebob);
		System.out.println("EKOK -> " + ekok);
	}
	
	

}
