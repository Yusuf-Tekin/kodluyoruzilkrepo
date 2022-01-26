package kodluyoruz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManavKasaProgramý {
	
	
	Map<String,Float> meyveler = new HashMap<String,Float>();
	

	public void init() {
		meyveler.put("Armut", 2.14f);
		meyveler.put("Elma", 3.67f);
		meyveler.put("Domates", 1.11f);
		meyveler.put("Muz", 0.95f);
		meyveler.put("Patlýcan", 5.0f);
	}
	
	public ManavKasaProgramý() {
		init();
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Armut Kaç Kilo? ");
		int armut = scan.nextInt();
		
		System.out.println("Elma Kaç Kilo?");
		int elma = scan.nextInt();
		
		System.out.println("Domates Kaç Kilo?");
		int domates = scan.nextInt();
		
		System.out.println("Muz kaç kilo?");
		int muz = scan.nextInt();
		
		System.out.println("Patlýcan Kaç Kilo");
		int patlican = scan.nextInt();
		
		float armutFiyat = armut * meyveler.get("Armut");
		float elmaFiyat = elma * meyveler.get("Elma");
		float domatesFiyat = domates * meyveler.get("Domates");
		float muzFiyat = muz * meyveler.get("Muz");
		float patlicanFiyat = patlican * meyveler.get("Patlýcan");
		
		float toplam = armutFiyat + elmaFiyat + domatesFiyat + muzFiyat + patlicanFiyat;
		System.out.println("Toplam Tutar: " + toplam);
		
	}
	
	
	public static void main(String[] args) {
		new ManavKasaProgramý();
	}
}
