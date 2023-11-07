package bean;

public class Car2 {
	String color;	// 4byte
	int speed;		// 4byte
	int price;		// 4byte
	public static Car2 car2;
	
	// private 생성자때문에 외부에서 Car2를 생성할 수 없음
	// 외부에서는 Car2가 하나 만들어놓은 객체가 필요
	// Car2.getInstance();
	public static Car2 getInstance() {		// static을 써야 Car2 생성없이도 외부에서 사용 가능
		if(car2 == null) {
			car2 = new Car2("검정", 120, 1200);
		}
		return car2;
	}
	
	private Car2(String color, int speed, int price) {
		this.color = color;
		this.speed = speed;
		this.price = price;
	}
	
	
}
