package 부품사용하기;

import 부품만들기.계좌;

public class 은행 {

	public static void main(String[] args) {
		
		계좌 ac1 = new 계좌();
		계좌 ac2 = new 계좌();
		계좌 ac3 = new 계좌();
		
		ac1.이름 = "홍길동";
		ac1.계좌이름 = "튼튼적금";
		ac1.금액 = 1000;
		
		ac2.이름 = "박길동";
		ac2.계좌이름 = "튼튼예금";
		ac2.금액 = 2000;
		
		ac3.이름 = "홍기사";
		ac3.계좌이름 = "다음적금";
		ac3.금액 = 3000;
		
		System.out.println(ac1);
		System.out.println(ac2);
		System.out.println(ac3);
		ac1.입금하다(1000);
		
		// 원래있는 toString()은 참조형변수 프린트할 때 무조건 호출
		// 패키지명.클래스명@주소관리코드값(해시코드값)
		
	}

}
