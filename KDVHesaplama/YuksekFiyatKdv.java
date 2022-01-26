package kodluyoruz.KDVHesaplama;

public class YuksekFiyatKdv implements IKdvHesapla {

	private final float KDV_ORANI = 8;
	@Override
	public float fiyatHesapla(int tutar) {
		float kdvMiktar� = tutar*KDV_ORANI/100;
		float yeniTutar = tutar + kdvMiktar�;
		
		System.out.println("KDV Miktar�: " + kdvMiktar�);
		
		return yeniTutar;
	}

}
