package kodluyoruz.KDVHesaplama;

public class DusukFiyatKdv implements IKdvHesapla {

	private final float KDV_ORANI = 18;
	
	@Override
	public float fiyatHesapla(int tutar) {
		float kdvMiktar� = tutar*KDV_ORANI/100;
		float yeniFiyat = tutar + kdvMiktar�;
		
		
		System.out.println("KDV M�ktar�: " + kdvMiktar�);
		
		return yeniFiyat;
	}

}
