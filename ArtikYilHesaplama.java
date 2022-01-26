package kodluyoruz;

import java.util.Scanner;

public class ArtikYilHesaplama {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Y�l: ");
		int yil = scan.nextInt();
		
		if(yil % 100 == 0) {
			if(yil % 400 == 0 ) {
				System.out.println(String.format("%d artik y�l", yil));
			}
			else {
				System.out.println(String.format("%d artik y�l de�il", yil));
			}
		}
		else {
			if(yil % 4 == 0) {
				System.out.println(String.format("%d artik y�ld�r.", yil));
			}
			else {
				System.out.println(String.format("%d artik y�l de�il.", yil));
			}
		}
		
		
		
	}

}
