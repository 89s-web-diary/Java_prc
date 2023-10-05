package 메서드기본;

public class 내카페3 {

	public static void main(String[] args) {

		Cal3 cal = new Cal3();
		int prc = 7000, cnt1 = 5, cnt2 = 4;
		int sum = cal.add(cnt1, cnt2);
		System.out.println("오늘 온 손님의 총 합은 " + sum + "명 입니다");
		System.out.println("손님 수 차이는 " + cal.minus(cnt1, cnt2) + "명 입니다");
		System.out.println("오전 결제금액은 " + cal.mul(cnt1, prc) + "원 입니다");
		System.out.println("오후 결제금액은 " + cal.mul(cnt2, prc) + "원 입니다");
		int total = cal.add(cal.mul(cnt1, prc), cal.mul(cnt2, prc));
		System.out.println("오늘 하루 총 결제금액은 " + total + "원 입니다");
		System.out.println("1인당 결제 금액은 " + cal.div(total, sum) + "원 입니다");
		
		
		
	}

}
