package kodluyoruz;

import java.util.Scanner;

public class GelismisHesapMakinesi {
	
	Scanner scan = new Scanner(System.in);
	
	public void toplam() {
		System.out.println("Kaç Tane Sayý Toplamak Ýstiyorsun:");
		int toplanacakSayiMiktari = scan.nextInt();
		
		int i = 1;
		int toplam = 0;
		while(i <= toplanacakSayiMiktari) {
			
			System.out.println(i++ + ". Sayý: ");
			int sayi = scan.nextInt();
			
			toplam+= sayi;
			 
		}
		
		System.out.println("Toplam: " + toplam);
		
	}
	
	
	public void cikarma() {
		
		System.out.println("Kaç sayý çýkartýlacak: ");
		int kacSayiCikilacak = scan.nextInt();
		
		int sonuc = 0;
		int i = 1;
		while(i <= kacSayiCikilacak) {
			System.out.print(i + ". Sayi: ");
			int sayi = scan.nextInt();
			if(i == 1) {
				sonuc += sayi;
			}
			else {
				sonuc-=sayi;
			}
			i++;
		}
		
		System.out.println("Sonuç: " + sonuc);
				
	}
	
	
	public void carpma() {
		System.out.println("Kaç sayý çarpýlacak: ");
		int kacSayiCarpilacak = scan.nextInt();
		
		int i = 1;
		int sonuc = 1;
		while(i <= kacSayiCarpilacak) {
			System.out.println(i+ ". Sayý: ");
			int sayi = scan.nextInt();
			
			sonuc*=sayi;
			i++;
		}
		
		System.out.println("Sonuç:" + sonuc);
	}
	
	public void bolme() {
		Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayý gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayý :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Bölen 0 olamaz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
	}
	
	public void usluAlma() {
		
		System.out.println("Taban: ");
		int taban = scan.nextInt();
		System.out.println("Kuvvet: ");
		int kuvvet = scan.nextInt();
		
		System.out.println("Sonuç : " + (int) Math.pow(taban, kuvvet));
		
	}
	
	public void faktoriyel() {
		
		System.out.println("Hesaplanacak Sayý: ");
		int sayi = scan.nextInt();
		int sonuc = 1;
		while(sayi > 0) {
			sonuc *= sayi;
			sayi--;
		}
		
		System.out.println("Sonuç: " + sonuc);
	}
	
	public void modAlma() {
		System.out.println("Sayý1 :");
		int sayi1 = scan.nextInt();
		
		System.out.println("Sayý 2:");
		int sayi2= scan.nextInt();
		
		System.out.println("Sonuç : " + sayi1 % sayi2);
	}
	
	public void CevreAlanHesabý() {
		
		System.out.println("Kýsa Kenar: ");
		int kisaKenar = scan.nextInt();
		
		System.out.println("Uzun Kenar: ");
		int uzunKenar = scan.nextInt();
		
		System.out.println("Çevre: " + (kisaKenar + uzunKenar) *2);
		System.out.println("Alan: " + (kisaKenar * uzunKenar));
		
	}
	
	public GelismisHesapMakinesi() {
		
		while(true) {

			System.out.println("Ýþlem Seçin");
			System.out.println("1:Toplam\n2:Çýkarma\n3:Çarpma\n4:Bölme\n5:Üslü Alma\n6:Faktöriyel\n7:Mod Alma\n8:Dikdörtgen Alan ve Çevre Hesabý\n\n0: Çýkýþ");
			int secim = scan.nextInt();
			
			switch (secim) {
			case 1:
				toplam();
				break;
				
			case 2:
				cikarma();
				break;
			case 3:
				carpma();
				break;
				
			case 4:
				bolme();
				break;
				
			case 5:
				usluAlma();
				break;
				
			case 6:
				faktoriyel();
				break;
				
			case 7:
				modAlma();
				break;
				
			case 8:
				CevreAlanHesabý();
				break;
				
			case 0:
				System.out.println("Çýkýþ Yapýldý...");
				return;
				
				
				
			default:
				System.out.println("Geçersiz...");
			}
		}
		
	}
	
	public static void main(String[] args) {
		new GelismisHesapMakinesi();
	}

}
