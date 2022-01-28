package kodluyoruz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TekrarEdenCiftSayilar {

	public static void main(String[] args) {

		int[] sayilar = {3,5,6,8,56,4,8,12,45,34,6,12,4,54,34,5,45,3,4};
		List<Integer> tekrarEdenSayilar = new ArrayList<Integer>();

		Arrays.sort(sayilar);
		
		int i = 0;
		while(i < sayilar.length-1) {
			int index = Arrays.binarySearch(sayilar, sayilar[i]);
			if(index != sayilar.length-2) {
				tekrarEdenSayilar.add(sayilar[index]);
			}
			i++;
		}
		
		for(int k:tekrarEdenSayilar) {
			if(k % 2 == 0) {
				System.out.print(k + " ");
			}
			
		}
		
		
		
		
	}

}
