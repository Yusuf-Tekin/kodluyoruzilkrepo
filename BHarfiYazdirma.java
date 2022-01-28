package kodluyoruz;

public class BHarfiYazdirma {
	
	public static void main(String[] args) {
		
		
		
		/*
		 *    **********
		 *    *        *
		 *    *        *
		 *    *        *
		 *    *        *
		 *    **********
		 *    *        *
		 *    *        * 
		 *    *        *
		 *    *        *
		 *    **********
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		for(int satir = 0;satir <=9;satir++) {
			
			for(int sutun = 0;sutun <=9;sutun++) {
				
				if(satir == 0) {
					System.out.print("*");
					if(sutun == 9) {
						System.out.print("\n");
					}
				}
				else if(satir == 4) {
					System.out.print("*");
					if(sutun == 9) {
						System.out.println("");
						break;
					}
				}
				else if(satir == 9) {
					System.out.print("*");
				}
				
				else {
					
					if(sutun == 0) {
						System.out.print("*");
					}
					
					else if(sutun == 9) {
						System.out.print("*\n");
					}
					else {
						System.out.print(" ");
					}
				}
				
				
				
			}
			
		}
		
		
		
		
		
	}

}
