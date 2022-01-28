package kodluyoruz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DiziElemanlariFrekansi {

    public static void main(String[] args) {
        int dizi[] = { 5, 15, 28, 15, 5, 10, 15, 30, 28, 5 };
        System.out.println("Dizi: " + Arrays.toString(dizi));
        List<Integer> diziListesi = new ArrayList<>();
        List<Integer> diziListesiYedek = new ArrayList<>();
        List<Integer> sayiAdetleri = new ArrayList<>();
        List<String> sayiAdetlerii = new ArrayList<>();
        for(int i = 0; i < dizi.length; i++) {
            diziListesi.add(dizi[i]);
            diziListesiYedek.add(dizi[i]);
        }
        diziListesi = diziListesi.stream().distinct().sorted().collect(Collectors.toList());
        diziListesi.forEach(i->{
            
            sayiAdetleri.add(0);
        });
        int index = 0;
        for(int i = 0; i < diziListesi.size(); i++) {
            index = 0;
            for(int j = 0; j < diziListesiYedek.size(); j++) {
                if(diziListesiYedek.get(j) == diziListesi.get(i)) {
     
                    index++;
                    
                }
            }
            sayiAdetleri.set(i, index);
        }
        for(int i = 0; i < diziListesi.size(); i++) {
            System.out.println(String.format("%d sayýsý %d kadar tekrar etti.", diziListesi.get(i),sayiAdetleri.get(i)));
        }
    }
}