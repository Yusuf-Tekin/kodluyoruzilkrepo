package kodluyoruz;

import java.util.Scanner;

public class EtkinlikPlanlama {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hava Sýcaklýðý:");
		int temp = scan.nextInt();
		
		
		if(temp <= 5) {
			System.out.println("Kayak yapabilrisin.");
		}
		else if (temp > 5 && temp <= 15) {
			System.out.println("Sinema'ya gidebilirsin.");
		}
		else if (temp > 15 && temp <= 25) {
			System.out.println("Piknik yapabilirsin.");
		}
		else if(temp > 25) {
			System.out.println("Yüzmeye gidebilirsin.");
			
		}
		
		
		
		
		
	}

}
