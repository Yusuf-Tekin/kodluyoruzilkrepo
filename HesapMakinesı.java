package kodluyoruz;

import java.util.Scanner;

public class HesapMakines� {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Say� 1:");
			int sayi1 = scan.nextInt();
			
			System.out.println("Sayi 2:");
			int sayi2 = scan.nextInt();
			
			System.out.println("��leminizi Se�in:\n1:Toplama\n2:��karma\n3:�arpma\n4:B�lme\n9: ��k��");
			int secenek = scan.nextInt();
			
			switch (secenek) {
				case 1: 	
					System.out.println("Sonu�: " + (sayi1 + sayi2) );
					break;
				case 2:
					System.out.println("Sonu�: " + (sayi1-sayi2));
					break;
				case 3:
					System.out.println("Sonu�: " + (sayi1*sayi2));
					break;
				case 4:
					System.out.println("Sonu� : " + (sayi1/sayi2));
					break;
				case 9:
					System.out.println("��k�� yap�ld�...");
					return;
					
					
				default:
					throw new IllegalArgumentException("Unexpected value: " + secenek);
			}
		}
	
		
		
	}

}
