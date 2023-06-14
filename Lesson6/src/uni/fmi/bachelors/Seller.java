package uni.fmi.bachelors;

import java.util.ArrayList;

public class Seller extends Person{

	int percent;
	private ArrayList<Article> sells = new ArrayList<>();
	
	public Seller(String name, double weight, int percent) {
		super(name, weight);
		this.percent = percent;
	}
	
	public void addSell(String name, int quantity, double price) {
		Article art = new Article(name, price, quantity);
		sells.add(art);
	}
	
	public double calculatePayment() {
		for (int i = 0 ; i < sells.size() ; i++) {
			for (int j = i; j < sells.size(); j++) {
				if (sells.get(i).getSum() < sells.get(j).getSum()) {
					Article temp = sells.get(i);
					sells.set(i, sells.get(j));
					sells.set(j, temp);
				}
			}
		}
		
		double sum = 0;
		
		for (int i = 0 ; i < sells.size() - 2 ; i++) {
			sum += sells.get(i).getSum();
		}
		
		return (sum/100) * percent;
	}
}
