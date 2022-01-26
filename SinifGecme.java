package kodluyoruz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SinifGecme {
	
	Scanner scan = new Scanner(System.in);
	
	List<Integer> notlar = new ArrayList<Integer>();
	
	
	public void notEkle(int not) {
		if(not < 0 || not > 100) {
			System.out.println("Not eklenmedi.");
		}
		else {
			notlar.add(not);
		}
	}
	
	public int notAl(String ders) {
		
		System.out.println(String.format("%s ders notu: (0-100)", ders));
		int not = scan.nextInt();
		
		return not;
		
		
	}
	
	public SinifGecme() {
		
		
		int matematik = notAl("Matematik");
		int fizik = notAl("Fizik");
		int kimya = notAl("Kimya");
		int turkce = notAl("T�rk�e");
		int muzik = notAl("Muzik");
		
		
		notEkle(matematik);
		notEkle(fizik);
		notEkle(kimya);
		notEkle(turkce);
		notEkle(muzik);
		
		float toplam = 0;
		for(int i : notlar) {
			System.out.println(i);
			toplam+=i;
		}
		
		float ortalama = toplam / notlar.size();
		if(ortalama >= 55) {
			System.out.println(String.format("S�n�f� %1f ortalama ile ge�tiniz...",ortalama));
		}
		else {
			System.out.println(String.format("%1f ortalama ile s�n�fta kald�n�z...",ortalama));
		}
	}
	
	
	
	public static void main(String[] args) {
		
		new SinifGecme();
		
	}

}
