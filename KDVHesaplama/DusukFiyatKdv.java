package kodluyoruz.KDVHesaplama;

public class DusukFiyatKdv implements IKdvHesapla {

	private final float KDV_ORANI = 18;
	
	@Override
	public float fiyatHesapla(int tutar) {
		float kdvMiktarý = tutar*KDV_ORANI/100;
		float yeniFiyat = tutar + kdvMiktarý;
		
		
		System.out.println("KDV MÝktarý: " + kdvMiktarý);
		
		return yeniFiyat;
	}

}
