package kodluyoruz;

import java.util.Scanner;

public class NotHesaplama {
	
	public int notAl(String dersAdi) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(String.format("%s ders notu: ", dersAdi));
		int not = scanner.nextInt();
		
		return not;
		
	}
	
	public NotHesaplama() {
		
		int matematik = notAl("Matematik");
		int fizik = notAl("Fizik");
		int kimya = notAl("Kimya");
		int turkce = notAl("T�rk�e");
		int tarih = notAl("Tarih");
		int muzik = notAl("M�zik");
		
		
		float ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
		
		
		String message = ortalama > 60 ? "S�n�f� ge�tin: " + ortalama : "S�n�f� ge�emedin." + ortalama;
		
		
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		
		new NotHesaplama();
		
		
		
	}

}
