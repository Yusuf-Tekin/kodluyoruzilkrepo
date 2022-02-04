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
		System.err.println(String.format("> %s mekan�nda kar��na %d adet %s ��kt�", name,obstacleCount,this.obstacle.name));
		int i = 1;
		while(i <= obstacleCount) {
			
			while(true) {
				System.out.println(String.format("> Sen, %s'a sald�r�yorsun.", this.obstacle.name));
				System.out.println("> Verilen hasar -> " + (player.damage + player.inventory.weaponDamage));
				this.obstacle.healthy -= (this.player.damage + this.player.inventory.weaponDamage);
				
				System.out.println(String.format("> %s 'in %d can� kald�.", obstacle.name,obstacle.healthy));
				if(this.obstacle.isDead()) {
					i++;
					this.player.money += this.obstacle.money;
					System.err.println(String.format("%s �ld�rd���n i�in %d birim para kazand�n", this.obstacle.name,this.obstacle.money));
					break;
				}
				this.player.healthy -= (this.obstacle.damage - this.player.inventory.armorDefence);

				System.out.println(String.format("> %s, sana sald�r�yor.", this.obstacle.name));
				System.out.println("> Yedi�in hasar -> " + (obstacle.damage - player.inventory.armorDefence));
				System.out.println(String.format("> %d can�n kald�", player.healthy));
				this.player.isDead();
			}
			
		}
		System.out.println("-------------------------------SAVA� B�TT�----------------------------");
		System.out.println(String.format("> T�m %s'ler �ld�.",  obstacle.name));
		System.out.println(String.format("> Kalan can -> %d", this.player.healthy));
		if(this.name == "Ma�ara") {
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
