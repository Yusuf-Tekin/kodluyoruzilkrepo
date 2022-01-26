package kodluyoruz;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Boy (m):");
		float boy =scan.nextFloat();
		
		System.out.println("Kilo (Kg)");
		int kg = scan.nextInt();
		
		
		double kitle = kg /( boy*boy);
		System.out.println("Vücut Kitle Indeksiniz: " + kitle);
		
		
		
	}

}
