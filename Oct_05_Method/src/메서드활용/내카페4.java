package 메서드활용;

public class 내카페4 {

	public static void main(String[] args) {

		Cal4 cal = new Cal4();

		int cof = cal.sum(5, 2000);
		int milk = cal.sum(2, 3000);
		System.out.println("커피값은 " + cof + "원, 밀크티 값은 " + milk + "원");
		
		int sum = cal.total(cof, milk);
		int res = cal.div(sum, 7);
		System.out.println("1인당 결제 할 금액은 "+res+"원 입니다.");
		
	}

}
