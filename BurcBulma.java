package kodluyoruz;

import java.util.Scanner;

public class BurcBulma {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Doğduğunuz ay: ");
		String ay = scan.nextLine().toLowerCase();
		int gun;
		while(true) {
			System.out.println("Doğduğunuz gün: ");
			gun = scan.nextInt();
			if(gun > 31 || gun < 1) {
				System.out.println("Hatalı bir gün verisi girdiniz!");
				return;
			}
			else {
				break;
			}
		}
		
		if(ay.equals("ocak")) {
			
			if(gun <= 21) {
				System.out.println("Oğlak");
			}
			else {
				System.out.println("Kova");
			}
			
		}
		else if(ay.equals("şubat")) {
			if(gun <= 19) {
				System.out.println("Kova");
				
			}
			else {
				System.out.println("Balık");
			}
			
			
		}
		else if(ay.equals("mart")) {
			if(gun <= 20) {
				System.out.println("Balık");
			}
			else {
				System.out.println("Koç");
			}
			
		}
		else if(ay.equals("nisan")) {
			if(gun <= 20) {
				System.out.println("Koç");
			}
			else {
				System.out.println("Boğa");
			}
		}
		else if(ay.equals("mayıs")) {
			
			if(gun <= 21) {
				System.out.println("Boğa");
				
			}
			else {
				System.out.println("İkizler");
			}
			
		}
		else if(ay.equals("haziran")) {
			if(gun <= 22) {
				System.out.println("İkizler");
			}
			else {
				System.out.println("Yengeç");
			}
			
		}
		else if(ay.equals("temmuz")) {
			if(gun <= 22) {
				System.out.println("Yengeç");
			}
			else {
				System.out.println("Aslan");
			}
		}
		else if(ay.equals("ağustos")) {
			if(gun <= 22) {
				System.out.println("Aslan");
			}
			else {
				System.out.println("Başak");
			}
			
		}
		else if(ay.equals("eylül")) {
			if(gun <= 22) {
				System.out.println("Başak");
			}
			else {
				System.out.println("Terazi");
			}
			
		}
		else if(ay.equals("ekim")) {
			if(gun <= 22) {
				System.out.println("Terazi");
			}
			else {
				System.out.println("Akrep");
			}
		}
		else if(ay.equals("kasım")) {
			if(gun <= 21) {
				System.out.println("Akrep");
			}
			else {
				System.out.println("Yay");
			}
		}
		else if(ay.equals("aralık")) {
			if (gun <= 21) {
				System.out.println("Yay");
			}
			else {
				System.out.println("Oğlak");
			}
		}
		else {
			System.out.println("Tanımlı bir ay girin");
		}
		
		
		
	}
	
	
}
