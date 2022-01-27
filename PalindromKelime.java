package kodluyoruz;

import java.util.Scanner;

public class PalindromKelime {
	
	Scanner scan = new Scanner(System.in);

	
	public boolean isPalindrom(String word) {
		
		String reverse = "";
		
		for(int i = word.length()-1;i>=0;i--) {
			reverse += word.charAt(i);
		}

		
		if(reverse.equals(word)) {
			return true;
		}
		return false;
	}
	
	public PalindromKelime() {

		System.out.println("Kelime:");
		String kelime = scan.nextLine();
		
		if(isPalindrom(kelime)) {
			System.out.println(String.format("%s palindrom bir kelimedir...", kelime));
		}
		else {
			System.out.println(String.format("%s palindrom bir kelime deðildir...", kelime));
		}
		
	}
	
	
	public static void main(String[] args) {
		new PalindromKelime();
	}
	

}
