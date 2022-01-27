package kodluyoruz.OgrenciBilgiSistemi;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	
	String ogrenciAdi;
	int ogrenciNu;
	List<Course> kurslar = new ArrayList<Course>();
	double ortalama;
	
	public Student(String ogrenciAdi,int ogrenciNu) {
		this.ogrenciAdi = ogrenciAdi;
		this.ogrenciNu = ogrenciNu;
		this.ortalama = 0;
		
	}
	
	public void kursaKatil(Course course) {
		kurslar.add(course);
	}
	
	public void ortalamaHesapla() {
		int toplam = 0;
		for(Course kurs:kurslar) {
			kurs.ortalamaHesapla();
			toplam += kurs.genelOrtalama;
		}
		
		System.out.println(String.format("%s öðrencisinin ortalamasý: %f", this.ogrenciAdi,(float)toplam/kurslar.size()));
	}
	
	public void notVer(int yaziliNotu,int sozluNotu,Course c) {
		
		if(yaziliNotu >= 0 && yaziliNotu <= 100 && sozluNotu >= 0 && sozluNotu <= 100) {
			for(Course course:kurslar) {
				if(course.kursBrans.equals(c.kursBrans)) {
					course.yaziliNot = yaziliNotu;
					course.sozluNot = sozluNotu;
					
				}
			}
		}
		else {
			System.out.println("Geçersiz not giriþi algýlandý...");
		}
		
	}
	
	public void kursuGeciyormu(Course course) {
		
		if(course.gecmeNotu > course.genelOrtalama) {
			System.out.println(String.format("%s kursunu geçemediniz... (%f)", course.kursAdi,(float) course.genelOrtalama));
		}
		else {
			System.out.println(String.format("%s kursunu geçtiniz... (%f)", course.kursAdi,(float) course.genelOrtalama));
		}
		
		
	}

}
