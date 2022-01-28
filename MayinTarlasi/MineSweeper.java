package kodluyoruz.MayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	
	Scanner scan = new Scanner(System.in);
	int satir = 0;
	int sutun = 0;
	Mine[][] mineMap;
	Random random = new Random();
	
	
	public void addMines() {
		
		
		int alan = satir * sutun;
		
		int i = 0;
		while(i < alan/4) {
			int mineSatir = random.nextInt(this.satir);
			int mineSutun = random.nextInt(this.sutun);
			mineMap[mineSutun][mineSatir] = new Mine("-", true,false);
			i++;
		}
		
		for(int a = 0;a<sutun;a++) {
			
			for(int b = 0;b<satir;b++) {
				
				if(mineMap[a][b] == null) {
					mineMap[a][b] = new Mine("-", false,false);
				}
				
			}
			
		}
		
	}
	
	public void run() {
		
		System.out.print("S�tun Say�s�: ");
		int sutun = scan.nextInt();
		this.sutun= sutun;
		System.out.print("Sat�r Say�s�: ");
		int satir = scan.nextInt();
		this.satir = satir;
		
		mineMap = new Mine[sutun][satir];
		
		addMines();
				
		wantCoordinate();
		
	}
	
	
	public int mineControl(int sutun,int satir) {
		int mineAmount = 0;
		try {
			
			
			//sa��nda may�n var m�
			Mine mineSag = mineMap[sutun][satir + 1];
			if(mineSag instanceof Mine) {
				if(mineSag.isExistMine) {
					mineAmount++;
				}
				
			}
			
			//solunda may�n var m�
			Mine mineSol = mineMap[sutun][satir-1];
			if(mineSol instanceof Mine) {
				if(mineSol.isExistMine) {
					mineAmount++;
				}
			}
			
			
			//ustunde may�n var m� 
			Mine mineUst = mineMap[sutun-1][satir];
			if(mineUst instanceof Mine) {
				if(mineUst.isExistMine) {
					mineAmount++;
				}
			}
			
			//altinda may�n var m�
			Mine mineAlt = mineMap[sutun+1][satir];
			if(mineAlt instanceof Mine) {
				if(mineAlt.isExistMine) {
					mineAmount++;
				}
			}
			
			//sa� �st may�n var m� 
			Mine minesagUst = mineMap[sutun-1][satir+1];
			if(minesagUst instanceof Mine) {
				if(minesagUst.isExistMine) {
					mineAmount++;
				}
			}
			
			//Sa� alt May�n var m� 
			Mine minesagAlt = mineMap[sutun+1][satir+1];
			if(minesagAlt instanceof Mine) {
				if(minesagAlt.isExistMine) {
					mineAmount++;
				}
			}
			
			//Sol �st may�n var m�
			Mine minesolust = mineMap[sutun-1][satir-1];
			if(minesolust instanceof Mine) {
				if(minesolust.isExistMine) {
					mineAmount++;
				}
			}
			
			//Sol alt may�n var m�
			Mine minesolalt = mineMap[sutun+1][satir-1];
			if(minesolalt instanceof Mine) {
				if(minesolalt.isExistMine) {
					mineAmount++;
				}
			}
			
		}catch (ArrayIndexOutOfBoundsException e) {}
		return mineAmount;			

	}
	
	public void drawMap() {
		
		for(int i = 0;i<sutun;i++) {
			for(int j = 0;j<satir;j++)  {
				if(j != satir-1) {
					System.out.print(mineMap[i][j].text);
				}
				else {
					System.out.print(mineMap[i][j].text + "\n");
				}
				
			}
		}
		
	}
	
	public boolean isGameFinish() {
		
		boolean isGameFinish = true;
		
		for(int a = 0;a<sutun;a++) {
			for(int b = 0;b<satir;b++) {
				if(mineMap[a][b].isOpen == false && mineMap[a][b].isExistMine == false) {
					isGameFinish = false;
				}
			}
		}
		
		return isGameFinish;
	}
	
	public void wantCoordinate() {
		boolean mayinBasti = false;
		while(true) {
			
			drawMap();
			
			if(mayinBasti == true) {
				System.out.println("May�na Bast�n! Oyun Bitti...");

				break;
			}

			
			if(isGameFinish() == true) {
				System.out.println("Oyunu Kazand�n�z!");
				break;
			}

			System.out.print("Sat�r:");
			int satir = scan.nextInt();
			
			System.out.print("Sutun:");
			int sutun = scan.nextInt();
			
			
			if(satir >= this.satir || sutun >= this.sutun) {
				System.out.println("Kordinat,harita d���");
			}
			else {
				if(mineMap[sutun][satir].isExistMine == true) {
					mineMap[sutun][satir].isOpen(true);
					mineMap[sutun][satir].setMineText("*");
					
					mayinBasti = true;
				}
				else {
					mineMap[sutun][satir].setMineText(Integer.toString(mineControl(sutun, satir)));
					mineMap[sutun][satir].isOpen(true);
				}
			}
			
			
		}
		
	}

}
