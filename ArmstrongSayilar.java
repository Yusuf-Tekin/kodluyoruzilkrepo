package kodluyoruz;

import java.util.Scanner;

public class ArmstrongSayilar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Say� Girin:");
		int sayi = scan.nextInt();
		
		
		String sayiText = Integer.toString(sayi);
		int basamakSayisi = sayiText.length();
		
		int i = 0;
		int result = 0;
		while(i<= basamakSayisi-1) {
			result += Math.pow(Integer.valueOf(sayiText.split("")[i]), basamakSayisi);
			i++;
		}
		
		
		if(result == sayi) {
			System.out.println("Bu say� bir armstrong say�d�r");
		}
		else {
			System.out.println("Bu say� armstrong say� de�ildir");
		}
		
	}

}
