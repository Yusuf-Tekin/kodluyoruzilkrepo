package kodluyoruz;

import java.util.Scanner;

public class DaireDilimininAlani {
	
	public final double PI = Math.PI;
	
	public DaireDilimininAlani() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yar��ap(r): ");
		int yaricap = scan.nextInt();
		
		
		System.out.println("Merkez A��: ");
		int merkezAci = scan.nextInt();
		
		
		double sonuc = PI*yaricap*yaricap*merkezAci / 360;
		System.out.println(sonuc);
	}
	
	public static void main(String[] args) {
		new DaireDilimininAlani();
		
		
		
		
	}

}
