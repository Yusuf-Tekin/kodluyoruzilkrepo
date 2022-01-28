package kodluyoruz;

public class HarmonikOrtalamaBulma {

	public static void main(String[] args) {
		
		
		double[] sayilar =new double[]{10,23,45,65,12};
		
		double toplam = 0;
		for(int i = 0;i<sayilar.length;i++) {
			toplam += (1/sayilar[i]);			
		}
		double ortalama = sayilar.length / toplam;
		System.out.println("Harmonik Ortalama: " + ortalama);
		
		

	}

}
