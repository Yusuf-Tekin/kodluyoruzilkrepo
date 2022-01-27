package kodluyoruz.OgrenciBilgiSistemi;

public class Main {
	
	public static void main(String[] args) {
		
		Course matematik = new Course("Matematik Kursu", "Matematik", 50);
		Course fizik = new Course("Fizik Kursu","Fizik",60);
		Course kimya = new Course("Kimya Kursu", "Kimya", 45);
		
		Teacher ak1 = new Teacher("Akademisyen 1", "Matematik");
		Teacher ak2 = new Teacher("Akademisyen 2", "Fizik");
		Teacher ak3 = new Teacher("Akademisyen 3", "Kimya");
		
		matematik.akademisyenAta(ak1);
		fizik.akademisyenAta(ak2);
		kimya.akademisyenAta(ak3);
		
		Student st1 = new Student("Student 1", 1234);
		st1.kursaKatil(kimya);
		st1.kursaKatil(fizik);
		
		st1.notVer(50, 60, kimya);
		st1.notVer(82, 5, fizik);
	
		st1.ortalamaHesapla();
		st1.kursuGeciyormu(kimya);
		st1.kursuGeciyormu(fizik);
		
		
		
		
		
		
	}

}
