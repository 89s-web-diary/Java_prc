package 컬렉션;

import java.awt.Button;
import java.util.ArrayList;
import java.util.HashSet;

public class 리스트연습1 {

	public static void main(String[] args) {
		
		// 순서가 있는 데이터를 모으고 싶을 때
		// 배열??? 컬렉션(리스트 형태)
		ArrayList list = new ArrayList();
		
//		list.add("홍길동");
//		list.add("홍길동");
//		list.add("홍길동");
//		list.add(100);
//		list.add(11.22);
//		list.add('남');
//		list.add(true);
//		
//		HashSet list2 = new HashSet();
//		for (int i = 0; i < list.size(); i++) {
//			list2.add(list.get(i));
//		}
//		System.out.println(list);
//		System.out.println(list2);
		
		list.add(100);
		list.add(11.1);
		list.add(true);
		list.add('a');
		list.add("hong");
		list.add("hong");
		list.add(new Button());
		System.out.println(list);
		
		System.out.println(list.get(4) + "gildong");
		for (Object object : list) {
			System.out.println("값 >> " + object);
		}
		
		System.out.println(list.contains("hong"));
		System.out.println(list.indexOf("hong"));
		
		HashSet list2 = new HashSet();
	
		for (Object object : list) {
			list2.add(object);
		}
		System.out.println(list2);
		
	}

}
