package kodluyoruz.OgrenciBilgiSistemi;

public class Course {
	
	String kursAdi;
	String kursBrans;
	Teacher akademisyen;
	int gecmeNotu;
	int genelOrtalama;
	int yaziliNot = 0;
	int sozluNot = 0;
	
	
	public Course(String kursAdi,String kursBrans,int gecmeNotu) {
		this.kursAdi = kursAdi;
		this.kursBrans = kursBrans;
		this.gecmeNotu = gecmeNotu;
		this.akademisyen = null;
	}
	
	public void akademisyenAta(Teacher akademisyen) {
		if(this.kursBrans.equals(akademisyen.brans)) {
			System.out.println("Akademisyen atandý...");
			this.akademisyen = akademisyen;
		}
		else {
			System.out.println("Akademisyen branþ uyuþmadýðý için atanamadý");
		}
	}
	
	public void akademisyenBilgileri() {
		System.out.println("Akademisyen Adý: " + akademisyen.ogretmenAdi);
		System.out.println("Akademisyen Branþý: " + akademisyen.brans);
	}
	
	public void ortalamaHesapla() {
		if(this.yaziliNot != 0 || this.sozluNot != 0) {
			this.genelOrtalama = ((yaziliNot * 8) / 10) + ((sozluNot * 2) /10);
		}
		else {
			System.out.println("Genel ortalama hesaplanmasý için sozlu ve yazýlý sýnavlardan not alýnmýþ olmalýdýr.");
		}
	}
	
	
	
	

}
