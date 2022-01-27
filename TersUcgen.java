package kodluyoruz;

public class TersUcgen {

	public static void main(String[] args) {
		for(int i=0;i<10;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }   
            for(int k=2*10-1;k>=(2*i+1);k--){
                System.out.print("*");
                
            }
                System.out.println();   

        }

	}

}
