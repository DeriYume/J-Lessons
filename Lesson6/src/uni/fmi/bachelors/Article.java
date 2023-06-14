package uni.fmi.bachelors;

public class Article {
	private String name;
	private double price;
	private int count;
	
	public Article(String name, double price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Article: " + name + ", price per count: " + price + ", count: " + count;// + super.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public double getSum() {
		return count * price;
	}
}
