package kodluyoruz;

import java.util.Scanner;

public class ArtikYilHesaplama {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yýl: ");
		int yil = scan.nextInt();
		
		if(yil % 100 == 0) {
			if(yil % 400 == 0 ) {
				System.out.println(String.format("%d artik yýl", yil));
			}
			else {
				System.out.println(String.format("%d artik yýl deðil", yil));
			}
		}
		else {
			if(yil % 4 == 0) {
				System.out.println(String.format("%d artik yýldýr.", yil));
			}
			else {
				System.out.println(String.format("%d artik yýl deðil.", yil));
			}
		}
		
		
		
	}

}
