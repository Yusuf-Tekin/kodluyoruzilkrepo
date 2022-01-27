package kodluyoruz;

import java.util.Scanner;

public class RecursiveFonksiyonlardaUsAlma {
	
	
	static int usAl(int taban,int kuvvet) {
		int res = 1;
		if(kuvvet == 0 ) {
			return res;
		}
		
		res = res*taban;
		return res * usAl(taban,kuvvet-1);
		
	}
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban Say�s�: " );
		int taban = scan.nextInt();
		
		System.out.print("�s: ");
		int us = scan.nextInt();
		
		System.out.println("Sonu�: " + usAl(taban, us));
	}

}
