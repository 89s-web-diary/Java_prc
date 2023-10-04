package 부품사용하기;

import 부품만들기.Phone;
import 부품만들기.TV;

public class 우리집 {

	public static void main(String[] args) {

		TV mytv = new TV();
		mytv.ch = 7;
		mytv.vol = 9;
		mytv.onoff = false;

		TV yourtv = new TV();
		yourtv.ch = 9;
		yourtv.vol = 12;
		yourtv.onoff = true;

		// new -> 객체 만들어주는 키워드 / 객체생성
		// Ram에 주소 + 멤버변수를 힙영역(무더기영역)에 만들어준닫.

		System.out.println(mytv.ch);

		Phone p1 = new Phone();
		p1.size = 11;
		p1.speaker = "바나나사";

		Phone p2 = new Phone();
		p2.size = 9;
		p2.speaker = "메론사";

		System.out.println("사이즈는 " + p1.size + ", 회사는 " + p1.speaker);
		System.out.println("사이즈는 " + p2.size + ", 회사는 " + p2.speaker);
		System.out.println("p1 >> " + p1);
		System.out.println("p2 >> " + p2);
		
		p2.인터넷하다();
		
	}

}
