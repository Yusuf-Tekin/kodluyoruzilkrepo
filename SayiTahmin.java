package kodluyoruz;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int random = new Random().nextInt(100);
		int right = 5;
		while(true) {
			System.out.println("Sayýyý tahmin edin: ");
			int tahmin = scan.nextInt();
		
		
			if(tahmin > random) {
				right--;
				System.out.println("Tahmin edilen sayý, gizli sayýdan büyük!");
			}
			else if(tahmin < random) {
				right--;
				System.out.println("Tahmin edilen sayý, gizli sayýdan küçük!");
			}
			else if(tahmin == random) {
				System.out.println("Sayýyý bildin... : " + random);
				break;
			}
			
			if(right == 0) {
				System.out.println("Hakkýnýz bitti.Oyunu kaybettin! Sayý: " + random);
				break;
			}
		}
		
		
		
	}

}
