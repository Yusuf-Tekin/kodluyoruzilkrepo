package kodluyoruz.KDVHesaplama;

public class YuksekFiyatKdv implements IKdvHesapla {

	private final float KDV_ORANI = 8;
	@Override
	public float fiyatHesapla(int tutar) {
		float kdvMiktarý = tutar*KDV_ORANI/100;
		float yeniTutar = tutar + kdvMiktarý;
		
		System.out.println("KDV Miktarý: " + kdvMiktarý);
		
		return yeniTutar;
	}

}
