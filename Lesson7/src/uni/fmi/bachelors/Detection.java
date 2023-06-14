package uni.fmi.bachelors;

public interface Detection {
	
	public static final double SPACE_FACTOR = 0.31565;
	
	public double collisionChance();
	public double collisionDamage();
	
}
