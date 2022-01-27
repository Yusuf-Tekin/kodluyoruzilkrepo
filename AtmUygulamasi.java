package kodluyoruz;

import java.util.Scanner;

public class AtmUygulamasi {

	final String KULLANICI_ADI = "patika";
	final String SIFRE = "123456";
	int bakiye = 0;
	final Scanner scan = new Scanner(System.in);
	
	public void kullaniciGirisi() {
		
		System.out.print("Kullanıcı Adı:");
		String kadi = scan.nextLine();
		System.out.print("Şifre:");
		String sifre = scan.nextLine();
	
		if(kadi.equals(KULLANICI_ADI) && sifre.equals(SIFRE)) {
			System.out.println("Oturum Açıldı...");
				while(true) {
					System.out.println("İşlem Seçin...\n1:Para Çekme\n2:Para Yatırma\n3:Bakiye Sorgulama\n9:Çıkış");
					int secenek = scan.nextInt();
					
					if(secenek == 9) {
						System.out.println("Oturum sonlandırıldı...");
						break;
					}
					else {
						islemler(secenek);
					}
				}
		}
		else {
			System.out.println("Kullanıcı adı ya da şifre hatalı...");
		}
	}
	
	public void paraYatirma() {
		System.out.println("Miktar:");
		int miktar = scan.nextInt();
		if(miktar > 0) {
			bakiye+=miktar;
			System.out.println(String.format("%d hesabınıza eklendi", miktar));
		}
		else {
			System.out.println("Miktar en az 1 olmalıdır.");
		}
		
	}
	
	public void paraCekme() {
		System.out.println("Miktar:");
		int miktar = scan.nextInt();
		if(miktar > 0 && miktar < bakiye) {
			bakiye-=miktar;
			System.out.println(String.format("%d hesabınızdan çekildi", miktar));
		}
		else {
			System.out.println("Miktar minimum 1,maksimum bakiyeniz kadar olmalıdır.");
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
				System.out.println("Geçersiz değer...");
			}
	}
	
	
	
	
	public AtmUygulamasi() {
		kullaniciGirisi();
	}
	
	
	public static void main(String[] args) {
		
		new AtmUygulamasi();
	}

}
