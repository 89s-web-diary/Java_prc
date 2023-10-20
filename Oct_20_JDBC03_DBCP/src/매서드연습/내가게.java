package 매서드연습;

public class 내가게 {

	public static void main(String[] args) {

		int coffeePrice = 5000;
		int coffeeCount = 15;
		// 커피 계산가격이 5만원 이상이면
		// 5000원을 할인해주려고 한다.

		계산기 cal = new 계산기();
		int result = cal.mul(coffeePrice, coffeeCount);

		if (result >= 50000) {
			System.out.println("최종금액은 " + (result - 5000));
		} else {
			System.out.println("최종금액은 " + result);
		}
		
		int[] list = cal.array();
		System.out.println(list[0]+100);
		
		
		MemberVO bag = cal.get2("win2", "1234", "win2", "010");
		bag.setPw("1111");
		System.out.println(bag);
		
		String s = cal.get4("홍길동", 100);
		System.out.println(s+"입니다. 환영해주세요.");
		
	}

}
