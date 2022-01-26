package kodluyoruz;

import java.util.Scanner;

public class OturumAcma {
	
	
	public String kullaniciAdi = "root";
	public String defaultSifre = "123456";
	
	
	public OturumAcma() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kullanýcý Adý:");
		String kAdi = scan.nextLine();
		
		System.out.print("Þifre:");
		String sifre = scan.nextLine();
		
		
		if(kAdi.equals(kullaniciAdi)) {
			if(sifre.equals(defaultSifre)) {
				System.out.println("Oturum Açýldý...");
			}
			
			else {
				System.out.println("Þifre Hatalý....");
				System.out.println("Þifre sýfýrlamak ister misin?(e/h)");
				String cevap = scan.nextLine();
				
				switch (cevap) {
				case "e": 
					while(true) {
						System.out.println("Yeni Þifre:");
						String yeniSifre = scan.nextLine();
						
						
						if(yeniSifre.equals(sifre)) {
							System.out.println("Denenmiþ bir þifre kullanamazsýn");
						}
						else if(yeniSifre.equals(defaultSifre)) {
							System.out.println("Daha önce kullanmaddýðýn bir þifre seç");
						}
						else {
							defaultSifre = yeniSifre;
							System.out.println("Þifre güncellendi. Yeni sifre: " + defaultSifre);
							
							break;
						}
						
					}
					break;
				case "h":
					System.out.println("Þifre sýfýrlama iptal edildi.");
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + cevap);
				}
			}
		}
		else{
			System.out.println("Hesap bulunamadý");
		}
	}
	
	public static void main(String[] args) {
	
		new OturumAcma();
		
		
	}

}
