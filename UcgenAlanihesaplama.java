package kodluyoruz;

import java.util.Scanner;

public class UcgenAlanihesaplama {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dik kenar 1:");
		int dikKenar1 = scan.nextInt();
		
		System.out.println("Dik kenar 2:");
		int dikKenar2 = scan.nextInt();
		
		System.out.println("Hipotenüs:");
		int hipotenus = scan.nextInt();
		
		
		int u = (dikKenar1 + dikKenar2 + hipotenus) /2;
		int alanKare = u * (u-dikKenar1) * (u-dikKenar2) * (u-hipotenus);
		
		double alan = Math.sqrt(alanKare);
		
		System.out.println(alan);
		
		
		
	}

}
