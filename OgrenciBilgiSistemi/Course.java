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
			System.out.println("Akademisyen atand�...");
			this.akademisyen = akademisyen;
		}
		else {
			System.out.println("Akademisyen bran� uyu�mad��� i�in atanamad�");
		}
	}
	
	public void akademisyenBilgileri() {
		System.out.println("Akademisyen Ad�: " + akademisyen.ogretmenAdi);
		System.out.println("Akademisyen Bran��: " + akademisyen.brans);
	}
	
	public void ortalamaHesapla() {
		if(this.yaziliNot != 0 || this.sozluNot != 0) {
			this.genelOrtalama = ((yaziliNot * 8) / 10) + ((sozluNot * 2) /10);
		}
		else {
			System.out.println("Genel ortalama hesaplanmas� i�in sozlu ve yaz�l� s�navlardan not al�nm�� olmal�d�r.");
		}
	}
	
	
	
	

}
