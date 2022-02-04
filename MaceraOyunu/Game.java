package MaceraOyunu;

import java.util.Scanner;

import MaceraOyunu.Location.BattleLoc;
import MaceraOyunu.Location.Cave;
import MaceraOyunu.Location.Forest;
import MaceraOyunu.Location.Location;
import MaceraOyunu.Location.River;
import MaceraOyunu.Location.SafeHouse;
import MaceraOyunu.Location.ToolStore;

public class Game {
	
	Player player;
	Location location;
	
	Cave cave = new Cave();
	Forest forest = new Forest();
	River river = new River();
	ToolStore store = new ToolStore();
	SafeHouse safeHouse = new SafeHouse();
	
	public Game(Player player) {
		// TODO Auto-generated constructor stub
		this.player = player;
		this.location = safeHouse;
	}
	
	public void mekanSec() {
		boolean mekanSecildimi = false;
		while(mekanSecildimi == false) {
			System.out.print("Hangi mekana gitmek istersin?\n"
					+ "1 - Ma�ara\n"
					+ "2 - Orman\n"
					+ "3 - Nehir\n"
					+ "4 - Ma�aza\n"
					+ "5 - G�venli Ev'e D�n"
					+ "Se�im: ");
			
			Scanner scan = new Scanner(System.in);
			int mekanSec = scan.nextInt();
			switch (mekanSec) {
			case 1:
				this.location = (BattleLoc) cave;
				this.location.name = "Ma�ara";
				this.location.player = player;
				this.location.writeLocation();

				mekanSecildimi = true;
				cave.combat();
				
				break;
				
			case 2:
				this.location = forest;
				this.location.name = "Orman";
				this.location.player = player;
				this.location.writeLocation();
				forest.combat();
				mekanSecildimi = true;
				break;
				
				
			case 3:
				this.location = river;
				this.location.name = "Nehir";
				this.location.player = player;
				this.location.writeLocation();
				mekanSecildimi = true;
				river.combat();
				break;
				
			case 4:
				this.location = store;
				this.location.name = "Ma�aza";
				this.location.player = player;
				this.location.writeLocation();
				store.buy();
				mekanSecildimi = true;
				
				break;
				
			case 5:
				this.location = safeHouse;
				this.location.name = "G�venli Ev";
				this.location.writeLocation();
				this.location.player = player;
				mekanSecildimi = true;
				this.player.healthy = this.player.resetHealthy;

				break;
			default:
				System.out.println("Mekan bulunamad�...");
			}
			
			
			if(this.player.isWin()) {
				System.exit(0);
			}
			else {
				mekanSec();
			}
		}
		
		
			
		
		
	}
	
	
	public void start() {
		

		player.selectChar();
		location.name = "G�venli Ev";
		location.player = player;
		location.writeLocation();
		
		mekanSec();
		
		
		
		
	}
	
	

}
