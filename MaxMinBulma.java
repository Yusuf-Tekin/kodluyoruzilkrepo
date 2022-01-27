package kodluyoruz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxMinBulma {

	public static void main(String[] args) {
		
		
		List<Integer> sayilar = new ArrayList();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kaç sayý gireceksin: ");
		int miktar = scan.nextInt();
		
		int i =1;
		int max = 0;
		int min = 0;
		while(i<=miktar) {
			System.out.println(i +". sayýyý girin:");
			int sayi = scan.nextInt();
			sayilar.add(sayi);
			min = sayi;
			for(int a : sayilar) {
				if(a > max) {
					max = a;
				}
			}
			for (int b :sayilar) {
				if(b < min) {
					min = b;
				}
			}
			
			i++;
		}
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);

	}

}
