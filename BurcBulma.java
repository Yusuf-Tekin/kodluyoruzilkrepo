package kodluyoruz;

import java.util.Scanner;

public class BurcBulma {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Do�du�unuz ay: ");
		String ay = scan.nextLine().toLowerCase();
		int gun;
		while(true) {
			System.out.println("Do�du�unuz g�n: ");
			gun = scan.nextInt();
			if(gun > 31 || gun < 1) {
				System.out.println("Hatal� bir g�n verisi girdiniz!");
				return;
			}
			else {
				break;
			}
		}
		
		if(ay.equals("ocak")) {
			
			if(gun <= 21) {
				System.out.println("O�lak");
			}
			else {
				System.out.println("Kova");
			}
			
		}
		else if(ay.equals("�ubat")) {
			if(gun <= 19) {
				System.out.println("Kova");
				
			}
			else {
				System.out.println("Bal�k");
			}
			
			
		}
		else if(ay.equals("mart")) {
			if(gun <= 20) {
				System.out.println("Bal�k");
			}
			else {
				System.out.println("Ko�");
			}
			
		}
		else if(ay.equals("nisan")) {
			if(gun <= 20) {
				System.out.println("Ko�");
			}
			else {
				System.out.println("Bo�a");
			}
		}
		else if(ay.equals("may�s")) {
			
			if(gun <= 21) {
				System.out.println("Bo�a");
				
			}
			else {
				System.out.println("�kizler");
			}
			
		}
		else if(ay.equals("haziran")) {
			if(gun <= 22) {
				System.out.println("�kizler");
			}
			else {
				System.out.println("Yenge�");
			}
			
		}
		else if(ay.equals("temmuz")) {
			if(gun <= 22) {
				System.out.println("Yenge�");
			}
			else {
				System.out.println("Aslan");
			}
		}
		else if(ay.equals("a�ustos")) {
			if(gun <= 22) {
				System.out.println("Aslan");
			}
			else {
				System.out.println("Ba�ak");
			}
			
		}
		else if(ay.equals("eyl�l")) {
			if(gun <= 22) {
				System.out.println("Ba�ak");
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
		else if(ay.equals("kas�m")) {
			if(gun <= 21) {
				System.out.println("Akrep");
			}
			else {
				System.out.println("Yay");
			}
		}
		else if(ay.equals("aral�k")) {
			if (gun <= 21) {
				System.out.println("Yay");
			}
			else {
				System.out.println("O�lak");
			}
		}
		else {
			System.out.println("Tan�ml� bir ay girin");
		}
		
		
		
	}
	
	
}
