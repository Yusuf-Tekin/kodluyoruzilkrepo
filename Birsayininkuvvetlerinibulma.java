package kodluyoruz;

import java.util.Scanner;

public class Birsayininkuvvetlerinibulma {
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayý Girin:");
		int sayi = scan.nextInt();
		
		// 4'ün kuvvetleri
		for(int i = 1;i<=sayi;i++) {
			
			if(Math.pow(4, i) <= sayi && Math.pow(5, i) <= sayi) {
				System.out.print(Math.pow(4, i) + " / " + Math.pow(5, i) + "\n");
			}
			
			
		}
		
		
		
	}

}
