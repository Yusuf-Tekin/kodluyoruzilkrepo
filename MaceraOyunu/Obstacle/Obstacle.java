package MaceraOyunu.Obstacle;

import java.util.Random;

public class Obstacle {
	
	
	public int damage;
	public int healthy;
	public int money;
	public String name;
	public int resetHealthy;
	
	public Obstacle(String name,int damage,int healthy,int money) {
		this.damage = damage;
		this.healthy = healthy;
		this.money = money;
		this.resetHealthy = healthy;
		this.name = name;
	}
	
	public boolean isDead() {
		if(healthy <= 0) {
			this.healthy = resetHealthy;
			return true;
		}
		else {
			return false;
		}
	}
	
	public int obstacleNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(3) + 1;

		return randomNumber;
	};
	
	

}
