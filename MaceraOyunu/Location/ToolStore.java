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
			System.out.println("Bu eþya için para yetersiz (" +this.player.money+")");
			return false;
		}
		else {
			System.err.println("Eþya satýn alýndý.");
			return true;
		}
	}
	
	public void menu() {
		
		System.out.print("Birþeyler satýn alýn... (Paranýz: "+this.player.money+")\n"
				+ "1 - Tabanca (25)\n"
				+ "2 - Kýlýç (35)\n "
				+ "3 - Tüfek (45)\n"
				+ "4 - Hafif Zýrh (15)\n"
				+ "5 - Orta Zýrh (25)\n"
				+ "6 - Aðýr Zýrh (40)\nSeçim:");
		
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
				this.player.inventory.weaponName = "Kýlýç";
				this.player.inventory.weaponDamage = 3;
			}
			break;
		case 3:
			
			if(paraYeterlimi(45, this.player.money)) {
				this.player.inventory.weaponName = "Tüfek";
				this.player.inventory.weaponDamage = 7;
			}
			break;
		case 4:
			if(paraYeterlimi(15, this.player.money)) {
				this.player.inventory.armorName= "Hafif Zýrh";
				this.player.inventory.armorDefence = 1;
				
			}
			break;
			
			
		case 5:
			if(paraYeterlimi(25, this.player.money)) {
				this.player.inventory.armorName = "Orta Zýrh";
				this.player.inventory.armorDefence = 3;
			}
			break;
			
			
		case 6:
			if(paraYeterlimi(40, this.player.money)) {
				this.player.inventory.armorName = "Aðýr Zýrh";
				this.player.inventory.armorDefence = 5;
			
			}
		default:
			System.out.println("Haatalý eþya seçimi");
		}
		
	}

}
