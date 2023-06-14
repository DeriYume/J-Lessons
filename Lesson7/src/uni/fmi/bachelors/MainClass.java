package uni.fmi.bachelors;

public class MainClass {

	public static void main(String[] args) {
		
		Planet p = new Planet("Kb11351", 95000000, 5000, 1.3);
		
		Moon m = new Moon("Kb11351-M00N", 50000, 190, 0.5);
		
		Asteroids a1 = new Asteroids("Death from above", 80000, 90, 5.3, 15.6);
		Asteroids a2 = new Asteroids("Meatball", 1300, 5, 1.3, 0.6);
		Asteroids a3 = new Asteroids("Tarmon gaidon", 30000, 40, 2.3, 1.6);
		
		p.addBody(m);
		p.addBody(a1);
		p.addBody(a2);
		p.addBody(a3);
		
		p.printBodies(true);
	}

}
