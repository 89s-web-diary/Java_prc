package 정리문제;

public class CarMain {
	public static void main(String[] args) {
		
		Car car = new Car();
		car.color = "red";
		car.count = 10;
		car.price = 1000;
//		car.developer = "길동쓰"
		System.out.println(car.toString());
		
	}
}
