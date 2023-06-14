package uni.fmi.bachelors;

import java.util.ArrayList;

public class Planet extends CosmicObjects {

	private double distanceToSun;//AU - astronomical units
	private ArrayList<CosmicObjects> cosmicBodies = new ArrayList<>();
	
	public Planet(String name, double mass, double diameter, double distanceToSun) {
		super(name, mass, diameter);
		this.distanceToSun = distanceToSun;
	}

	public void addBody(CosmicObjects body) {
		cosmicBodies.add(body);
	}
	
	public void printBodies(boolean dangerousOnly) {
		for(int i = 0 ; i < cosmicBodies.size() ; i++) {
			if(dangerousOnly) {
				if(cosmicBodies.get(i) instanceof Asteroids){
					Asteroids temp = (Asteroids)cosmicBodies.get(i);
					
					if(temp.collisionChance() > 30) {
						System.out.println(temp);
						System.out.println("*Damage: " + temp.collisionDamage());
					}
				}
			}
			else {
				System.out.println(cosmicBodies.get(i));
			}
		}
	}
	
	@Override
	public double gravitationlAcceleration() {
		return ( getMass() / getDiameter() ) / Math.pow(Math.sqrt(distanceToSun) / 3, 20);
	}

}
