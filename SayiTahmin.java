package kodluyoruz;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int random = new Random().nextInt(100);
		int right = 5;
		while(true) {
			System.out.println("Say�y� tahmin edin: ");
			int tahmin = scan.nextInt();
		
		
			if(tahmin > random) {
				right--;
				System.out.println("Tahmin edilen say�, gizli say�dan b�y�k!");
			}
			else if(tahmin < random) {
				right--;
				System.out.println("Tahmin edilen say�, gizli say�dan k���k!");
			}
			else if(tahmin == random) {
				System.out.println("Say�y� bildin... : " + random);
				break;
			}
			
			if(right == 0) {
				System.out.println("Hakk�n�z bitti.Oyunu kaybettin! Say�: " + random);
				break;
			}
		}
		
		
		
	}

}
