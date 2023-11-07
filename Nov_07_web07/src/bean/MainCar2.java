package bean;

public class MainCar2 {

	public static void main(String[] args) {

		// Car2 car1 = new Car2("red",200,2000);	// ==> 만들 수 없다!
		Car2 car1 = Car2.getInstance();	// ==> getInstance로 만들어진것을 불러오거나 없으면 하나 만들어서 줌!
		Car2 car2 = Car2.getInstance();
		Car2 car3 = Car2.getInstance();	// 12 * 1 ==> 12byte만 사용
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
	}

}
