package MaceraOyunu.Location;

import MaceraOyunu.Player;

public abstract class Location {
	public Player player;
	public String name;
	
	
	public Location() {
		
	}
	
	public void writeLocation() {
		System.out.println("> �uan " + this.name + " mekan�ndas�n.");
	}
	
	public abstract boolean onLocation();
}
