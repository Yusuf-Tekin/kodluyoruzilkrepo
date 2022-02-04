package MaceraOyunu;

import java.util.Scanner;

public class Player {
	
	public Inventory inventory;
	public int damage;
	public int healthy;
	public int money;
	public String name;
	public int resetHealthy;
	public void isDead() {
		if(this.healthy <= 0) {
			System.out.println("------GEBERD�N------");
			System.exit(0);
		}
	}
	
	
	public void selectChar() {
		Inventory inventory = new Inventory();
		Scanner scan = new Scanner(System.in);
		System.out.print("Karakter Se�in...\n"
				+ "1 - Samuray\n"
				+ "2 - Ok�u\n"
				+ "3 - ��valye\n"
				+ "Se�im:");
		
		int option = scan.nextInt();
		switch (option) {
		case 1: 
			System.out.println("Samuray se�ildi");
			this.damage = 5;
			this.healthy = 21;
			this.resetHealthy = 21;
			this.money = 15;
			this.name = "Samuray";
			this.inventory = inventory;
			
			break;
			
		case 2:
			System.out.println("Ok�u se�ildi");
			this.damage = 7;
			this.healthy= 18;
			this.money = 20;
			this.resetHealthy = 18;
			this.name = "Ok�u";
			this.inventory = inventory;
			break;
		
		case 3:
			System.out.println("��valye se�ildi");
			this.damage = 8;
			this.healthy = 24;
			this.money = 5;
			this.resetHealthy = 24;
			this.name = "��valye";
			this.inventory = inventory;
			
			break;
		default:
			System.out.println("Hatal� se�enek...");
			break;
		}
		
		
	}
	
	public boolean isWin() {
		if(this.inventory.food == true && this.inventory.water == true && this.inventory.firewoord == true) {
			System.out.println("----------OYUN B�TT� KAZANDINIZ...--------------");
			return true;
		}
		else {
			return false;
		}
	}

}
