package MaceraOyunu.Location;

import java.util.Scanner;

public class ToolStore extends NormalLoc {

	@Override
	public boolean onLocation() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean paraYeterlimi(int amount,int money) {
		if(amount > money) {
			System.out.println("Bu e�ya i�in para yetersiz (" +this.player.money+")");
			return false;
		}
		else {
			System.err.println("E�ya sat�n al�nd�.");
			return true;
		}
	}
	
	public void menu() {
		
		System.out.print("Bir�eyler sat�n al�n... (Paran�z: "+this.player.money+")\n"
				+ "1 - Tabanca (25)\n"
				+ "2 - K�l�� (35)\n "
				+ "3 - T�fek (45)\n"
				+ "4 - Hafif Z�rh (15)\n"
				+ "5 - Orta Z�rh (25)\n"
				+ "6 - A��r Z�rh (40)\nSe�im:");
		
	}
	
	public void buy() {
		menu();
		Scanner scan = new Scanner(System.in);
		int secim = scan.nextInt();
		
		switch (secim) {
		case 1:
			
			if(paraYeterlimi(25, this.player.money)) {
				this.player.inventory.weaponName = "Tabanca";
				this.player.inventory.weaponDamage = 2;
			
			}
			
			break;
		case 2:
			
			if(paraYeterlimi(35,this.player.money)) {
				this.player.inventory.weaponName = "K�l��";
				this.player.inventory.weaponDamage = 3;
			}
			break;
		case 3:
			
			if(paraYeterlimi(45, this.player.money)) {
				this.player.inventory.weaponName = "T�fek";
				this.player.inventory.weaponDamage = 7;
			}
			break;
		case 4:
			if(paraYeterlimi(15, this.player.money)) {
				this.player.inventory.armorName= "Hafif Z�rh";
				this.player.inventory.armorDefence = 1;
				
			}
			break;
			
			
		case 5:
			if(paraYeterlimi(25, this.player.money)) {
				this.player.inventory.armorName = "Orta Z�rh";
				this.player.inventory.armorDefence = 3;
			}
			break;
			
			
		case 6:
			if(paraYeterlimi(40, this.player.money)) {
				this.player.inventory.armorName = "A��r Z�rh";
				this.player.inventory.armorDefence = 5;
			
			}
		default:
			System.out.println("Haatal� e�ya se�imi");
		}
		
	}

}
