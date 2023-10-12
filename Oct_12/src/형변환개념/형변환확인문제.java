package 형변환개념;

import java.util.ArrayList;

public class 형변환확인문제 {
	
	public static void main(String[] args) {
		
		ArrayList me = new ArrayList();
		
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');
		
		System.out.println(me);
		
		int res = (int)me.get(0) + 1000;
		System.out.println(res);
		
		double hgt = (double)me.get(1) + 10;
		System.out.println(hgt);
		
		boolean m = (boolean)me.get(2);
		if(m==true)	System.out.println("배불러요");
		else System.out.println("배고파요");
		
		char s = (char)me.get(3);
		if(s=='남') System.out.println("주민번호는 1,3이에요");
		else System.out.println("주민번호는 2,4에요");
		
		// 실제로 코드할 때 다양한 타입을 넣을 수 있기는 하다.
		// 매번 넣을 때마다 형변환을 해야할까? X
		ArrayList<String> e = new ArrayList<String>();
		// <>를 쓰면 객체를 생성할 때 타입을 결정할 수 있음.
		// 형변환을 할 필요가 없음 / < > === 제너릭(제너럴, 일반적인) 프로그래밍
		// < > 안에는 클래스만 가능 ( 기본형 int x Integer o )
		e.add("ㅅㅅ");
		e.add("ㅁㅁ");
		e.add("ㅂㅂ");
		String q = e.get(0);	// 강제 형변환이 필요가 없음 (ArrayList 내부에 String으로 존재하기 때문)
		
		
	}
}
