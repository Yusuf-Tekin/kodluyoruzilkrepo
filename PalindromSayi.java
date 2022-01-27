package kodluyoruz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromSayi {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayý Girin: ");
		int sayi = scan.nextInt();
		
		
		List<String> textString = new ArrayList();
		String sayiText = Integer.toString(sayi);
		int i = 0;
		while(i<sayiText.length()) {
			textString.add(sayiText.split("")[i]);
			i++;
		}
		
		int a = textString.size() -1;
		String reverseText = "";
		while(a >= 0) {
			reverseText += textString.get(a);
			a--;
		}
		
		
		int reverseNuMBER = Integer.parseInt(reverseText);
		
		if(reverseNuMBER == sayi) {
			System.out.println("Bu sayý bir palindrom sayýdýr.");
		}
		else {
			System.out.println("Bu sayý bir palindrom sayý deðildir.");
		}
		
		
	}

}
