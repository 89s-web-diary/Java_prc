package bean;

public class Coffee2 {
	
	int price;
	String name;
	public static Coffee2 coffee2;
	
	public static Coffee2 getInstance() {
		if(coffee2 == null) {
			coffee2 = new Coffee2(2500, "americano");
		}
		return coffee2;
	}
	
	private Coffee2(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
}
