package kodluyoruz;

import java.util.Scanner;

public class HarmonikSayilar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayý girin:");
		int sayi = scanner.nextInt();
		
		double res = 0;
		for(int i = 1;i<=sayi;i++) {
			res += 1.0/i;
		
		}
		
		System.out.println("Sonuç: " + res);
	}

}
