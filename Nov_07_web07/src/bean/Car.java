package bean;

public class Car {
	// 멤버변수 + 멤버메서드
	String color;	// 4byte
	int speed;		// 4byte
	int price;		// 4byte
	
	//	==> 12byte의 메모리가 잡힘
	
	public Car(String color, int speed, int price) {
		this.color = color;
		this.speed = speed;
		this.price = price;
	}
	
	
}
