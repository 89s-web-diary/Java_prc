package 형변환개념;

import java.util.ArrayList;

public class 참조형형변환 {

	public static void main(String[] args) {

		// 참조형 형변환은 상속관계에서만 가능하다
		ArrayList list = new ArrayList();
		
		list.add("a");	// list.add(Object arg0) <== Object라는 커다란 범위를 다 넣을 수 있음
		// Object(큰) <== String(작)  // 자동형변환
		
		list.add(100);	// Object(큰) <== Integer(작) // 자동형변환

		System.out.println(list);
		
		String a = (String)list.get(0);
		// 사이즈가 큰 Object를 꺼내서 사이즈가 작은 String에 넣어주기 위해선 강제로 타입을 변환시켜야함
		// Object > String	// 강제 형변환
		
	}

}
