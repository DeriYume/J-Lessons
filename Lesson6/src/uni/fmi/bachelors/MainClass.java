package uni.fmi.bachelors;

public class MainClass {

	public static void main(String[] args) {
		Seller s = new Seller("Maria", 45, 10);
		
		s.addSell("Cabbage", 2, 2.5);
		s.addSell("Tomato", 1, 5.5);
		s.addSell("Cucumber", 3, 8.5);
		s.addSell("Beef", 8, 8.9);
		s.addSell("Cake", 1, 35);
		s.addSell("Water", 6, 5.4);
		
		System.out.println("Maria has earned " + s.calculatePayment() + " bucks today.");
	}

}
