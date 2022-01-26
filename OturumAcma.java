package kodluyoruz;

import java.util.Scanner;

public class OturumAcma {
	
	
	public String kullaniciAdi = "root";
	public String defaultSifre = "123456";
	
	
	public OturumAcma() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kullan�c� Ad�:");
		String kAdi = scan.nextLine();
		
		System.out.print("�ifre:");
		String sifre = scan.nextLine();
		
		
		if(kAdi.equals(kullaniciAdi)) {
			if(sifre.equals(defaultSifre)) {
				System.out.println("Oturum A��ld�...");
			}
			
			else {
				System.out.println("�ifre Hatal�....");
				System.out.println("�ifre s�f�rlamak ister misin?(e/h)");
				String cevap = scan.nextLine();
				
				switch (cevap) {
				case "e": 
					while(true) {
						System.out.println("Yeni �ifre:");
						String yeniSifre = scan.nextLine();
						
						
						if(yeniSifre.equals(sifre)) {
							System.out.println("Denenmi� bir �ifre kullanamazs�n");
						}
						else if(yeniSifre.equals(defaultSifre)) {
							System.out.println("Daha �nce kullanmadd���n bir �ifre se�");
						}
						else {
							defaultSifre = yeniSifre;
							System.out.println("�ifre g�ncellendi. Yeni sifre: " + defaultSifre);
							
							break;
						}
						
					}
					break;
				case "h":
					System.out.println("�ifre s�f�rlama iptal edildi.");
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + cevap);
				}
			}
		}
		else{
			System.out.println("Hesap bulunamad�");
		}
	}
	
	public static void main(String[] args) {
	
		new OturumAcma();
		
		
	}

}
