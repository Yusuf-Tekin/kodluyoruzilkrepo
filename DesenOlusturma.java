package kodluyoruz;

import java.util.Scanner;

public class DesenOlusturma {
	
	int ilkDeger = 0;
	boolean negatifOldumu = false;
	int sayac =0 ;
	public int desen(int deger)  {
		
		if(ilkDeger == deger && sayac == 1 ) {
			System.out.print(deger + " ");
			System.exit(0);
		}
		if(sayac == 0) {
			ilkDeger = deger;
			sayac++;
		}
		System.out.print(deger + " ");
		if(deger < 0 || deger == 0) {
			negatifOldumu = true;
		}
		
		if(negatifOldumu == true) {
			return desen(deger + 5);
		}
		else {
			return desen(deger -5);
		}
		
		
		
		
		
		
		
	}
	
	
	public DesenOlusturma() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Değer: ");
		int deger = scan.nextInt();
	
		System.out.println(desen(deger));
	}

	public static void main(String[] args) {
		new DesenOlusturma();
	}

}
