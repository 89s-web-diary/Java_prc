package bean;

public class MainCar {

	public static void main(String[] args) {

		Car car1 = new Car("red",200,2000);	// 무더기(힙영역)
		Car car2 = new Car("red",150,1500);
		Car car3 = new Car("red",100,1000);	// 12*3 ==> 36byte 사용
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
	}

}
