package kodluyoruz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ciftve4unkatiSayilar {
	
	public static void main(String[] args) {
		
		
		List<Integer> inputsayilari = new ArrayList();
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Sayi girin:");

			int sayi = scan.nextInt();
			if(sayi % 2 == 0) {
				inputsayilari.add(sayi);
			}
			else {
				break;
			}
		}
		
		
		int toplam = 0;
		
		for(int i : inputsayilari) {
			if(i % 4 == 0) {
				toplam += i;
			}
		}
		
		System.out.println("Sonuç: " + toplam);
		
		
	}

}
