package MaceraOyunu.Location;

import MaceraOyunu.Obstacle.Obstacle;

public abstract class BattleLoc extends Location {
	
	public Obstacle obstacle;

	public BattleLoc(Obstacle obstacle) {
		this.obstacle = obstacle;
	}
	
	@Override
	public boolean onLocation() {
		
		return true;
	}
	
	public void combat() {
		
		int obstacleCount = obstacle.obstacleNumber();
		System.err.println(String.format("> %s mekanýnda karþýna %d adet %s çýktý", name,obstacleCount,this.obstacle.name));
		int i = 1;
		while(i <= obstacleCount) {
			
			while(true) {
				System.out.println(String.format("> Sen, %s'a saldýrýyorsun.", this.obstacle.name));
				System.out.println("> Verilen hasar -> " + (player.damage + player.inventory.weaponDamage));
				this.obstacle.healthy -= (this.player.damage + this.player.inventory.weaponDamage);
				
				System.out.println(String.format("> %s 'in %d caný kaldý.", obstacle.name,obstacle.healthy));
				if(this.obstacle.isDead()) {
					i++;
					this.player.money += this.obstacle.money;
					System.err.println(String.format("%s öldürdüðün için %d birim para kazandýn", this.obstacle.name,this.obstacle.money));
					break;
				}
				this.player.healthy -= (this.obstacle.damage - this.player.inventory.armorDefence);

				System.out.println(String.format("> %s, sana saldýrýyor.", this.obstacle.name));
				System.out.println("> Yediðin hasar -> " + (obstacle.damage - player.inventory.armorDefence));
				System.out.println(String.format("> %d canýn kaldý", player.healthy));
				this.player.isDead();
			}
			
		}
		System.out.println("-------------------------------SAVAÞ BÝTTÝ----------------------------");
		System.out.println(String.format("> Tüm %s'ler öldü.",  obstacle.name));
		System.out.println(String.format("> Kalan can -> %d", this.player.healthy));
		if(this.name == "Maðara") {
			this.player.inventory.food = true;
			System.err.println("> Yemek envantere eklendi.");
		}
		else if(this.name == "Orman") {
			this.player.inventory.firewoord = true;
			System.err.println("> Odun envantere eklendi.");
		
		}
		else if(this.name == "Nehir") {
			System.err.println("> Su envantere eklendi.");
			this.player.inventory.water = true;
		}
	}
	
}
