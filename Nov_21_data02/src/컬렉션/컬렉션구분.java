package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;

public class 컬렉션구분 {

	public static void main(String[] args) {
		// 중복제거된 컬렉션 ==> set
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add(1000);
		System.out.println(bag);
		// bag - 주소가 들어가 있음.
		// HashSet에 toString()이 들어있어서 주소말고 hashset에 들어있는 값들을 String으로 불러와줌
		System.out.println(bag.size());
		
		ArrayList list = new ArrayList();
		list.add("코딩수업");
		list.add(2);
		System.out.println(list);
		String s = (String)list.get(0);
		int time = (int)list.get(1);
		System.out.println(time + 1);
		
		
		
	}

}
