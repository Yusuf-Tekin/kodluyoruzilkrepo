package kodluyoruz;

import java.util.Scanner;

public class GelismisHesapMakinesi {
	
	Scanner scan = new Scanner(System.in);
	
	public void toplam() {
		System.out.println("Ka� Tane Say� Toplamak �stiyorsun:");
		int toplanacakSayiMiktari = scan.nextInt();
		
		int i = 1;
		int toplam = 0;
		while(i <= toplanacakSayiMiktari) {
			
			System.out.println(i++ + ". Say�: ");
			int sayi = scan.nextInt();
			
			toplam+= sayi;
			 
		}
		
		System.out.println("Toplam: " + toplam);
		
	}
	
	
	public void cikarma() {
		
		System.out.println("Ka� say� ��kart�lacak: ");
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
		
		System.out.println("Sonu�: " + sonuc);
				
	}
	
	
	public void carpma() {
		System.out.println("Ka� say� �arp�lacak: ");
		int kacSayiCarpilacak = scan.nextInt();
		
		int i = 1;
		int sonuc = 1;
		while(i <= kacSayiCarpilacak) {
			System.out.println(i+ ". Say�: ");
			int sayi = scan.nextInt();
			
			sonuc*=sayi;
			i++;
		}
		
		System.out.println("Sonu�:" + sonuc);
	}
	
	public void bolme() {
		Scanner scan = new Scanner(System.in);
        System.out.print("Ka� adet say� gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Say� :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("B�len 0 olamaz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonu� : " + result);
	}
	
	public void usluAlma() {
		
		System.out.println("Taban: ");
		int taban = scan.nextInt();
		System.out.println("Kuvvet: ");
		int kuvvet = scan.nextInt();
		
		System.out.println("Sonu� : " + (int) Math.pow(taban, kuvvet));
		
	}
	
	public void faktoriyel() {
		
		System.out.println("Hesaplanacak Say�: ");
		int sayi = scan.nextInt();
		int sonuc = 1;
		while(sayi > 0) {
			sonuc *= sayi;
			sayi--;
		}
		
		System.out.println("Sonu�: " + sonuc);
	}
	
	public void modAlma() {
		System.out.println("Say�1 :");
		int sayi1 = scan.nextInt();
		
		System.out.println("Say� 2:");
		int sayi2= scan.nextInt();
		
		System.out.println("Sonu� : " + sayi1 % sayi2);
	}
	
	public void CevreAlanHesab�() {
		
		System.out.println("K�sa Kenar: ");
		int kisaKenar = scan.nextInt();
		
		System.out.println("Uzun Kenar: ");
		int uzunKenar = scan.nextInt();
		
		System.out.println("�evre: " + (kisaKenar + uzunKenar) *2);
		System.out.println("Alan: " + (kisaKenar * uzunKenar));
		
	}
	
	public GelismisHesapMakinesi() {
		
		while(true) {

			System.out.println("��lem Se�in");
			System.out.println("1:Toplam\n2:��karma\n3:�arpma\n4:B�lme\n5:�sl� Alma\n6:Fakt�riyel\n7:Mod Alma\n8:Dikd�rtgen Alan ve �evre Hesab�\n\n0: ��k��");
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
				CevreAlanHesab�();
				break;
				
			case 0:
				System.out.println("��k�� Yap�ld�...");
				return;
				
				
				
			default:
				System.out.println("Ge�ersiz...");
			}
		}
		
	}
	
	public static void main(String[] args) {
		new GelismisHesapMakinesi();
	}

}
