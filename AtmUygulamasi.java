package kodluyoruz;

import java.util.Scanner;

public class AtmUygulamasi {

	final String KULLANICI_ADI = "patika";
	final String SIFRE = "123456";
	int bakiye = 0;
	final Scanner scan = new Scanner(System.in);
	
	public void kullaniciGirisi() {
		
		System.out.print("Kullan�c� Ad�:");
		String kadi = scan.nextLine();
		System.out.print("�ifre:");
		String sifre = scan.nextLine();
	
		if(kadi.equals(KULLANICI_ADI) && sifre.equals(SIFRE)) {
			System.out.println("Oturum A��ld�...");
				while(true) {
					System.out.println("��lem Se�in...\n1:Para �ekme\n2:Para Yat�rma\n3:Bakiye Sorgulama\n9:��k��");
					int secenek = scan.nextInt();
					
					if(secenek == 9) {
						System.out.println("Oturum sonland�r�ld�...");
						break;
					}
					else {
						islemler(secenek);
					}
				}
		}
		else {
			System.out.println("Kullan�c� ad� ya da �ifre hatal�...");
		}
	}
	
	public void paraYatirma() {
		System.out.println("Miktar:");
		int miktar = scan.nextInt();
		if(miktar > 0) {
			bakiye+=miktar;
			System.out.println(String.format("%d hesab�n�za eklendi", miktar));
		}
		else {
			System.out.println("Miktar en az 1 olmal�d�r.");
		}
		
	}
	
	public void paraCekme() {
		System.out.println("Miktar:");
		int miktar = scan.nextInt();
		if(miktar > 0 && miktar < bakiye) {
			bakiye-=miktar;
			System.out.println(String.format("%d hesab�n�zdan �ekildi", miktar));
		}
		else {
			System.out.println("Miktar minimum 1,maksimum bakiyeniz kadar olmal�d�r.");
		}
		
	}
	
	public void bakiyeSorgulama() {
		System.out.println("Toplam bakiye: "+bakiye );
		
	}
	
	public void islemler(int secenek) {
		switch (secenek) {
			case 1:
				paraCekme();
				break;
			case 2:
				paraYatirma();
				break;
			case 3:
				bakiyeSorgulama();
				break;
			default:
				System.out.println("Ge�ersiz de�er...");
			}
	}
	
	
	
	
	public AtmUygulamasi() {
		kullaniciGirisi();
	}
	
	
	public static void main(String[] args) {
		
		new AtmUygulamasi();
	}

}
