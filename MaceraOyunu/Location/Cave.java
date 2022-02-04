package MaceraOyunu.Location;

import MaceraOyunu.Obstacle.Zombie;

public class Cave extends BattleLoc{
	
	public Cave() {
		super(new Zombie("Zombi",3,10,4));
	}

}
