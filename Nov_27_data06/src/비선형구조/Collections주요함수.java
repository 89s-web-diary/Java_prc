package 비선형구조;

import java.util.ArrayList;
import java.util.Collections;

public class Collections주요함수 {

	public static void main(String[] args) {
		int[] s = { 5, 3, 6, 3, 11, 7, 24, 34, 79, 90, 539 };
		ArrayList<Integer> list = new ArrayList<>();
		
		for (Integer i : s) {
			list.add(i);
		}
		System.out.println(list);
		System.out.println(list.size());
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		// Collections 내부함수 중 역순으로 배치시키는 reverse 함수가 존재한다
		System.out.println(list);
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		System.out.println(Collections.frequency(list, 3));
		System.out.println(list.contains(6));
		// contains 함수를 이용하면 리스트안에 해당 값이 존재하는지 판별해서 boolean 값으로 return 시켜줌
		System.out.println(list.indexOf(6));
		// indexOf 함수를 이용하면 해당 값의 위치를 return시켜준다. $$$$ 3번째에 있으므로 index는 2 $$$$
		list.clear();
		// clear를 이용하면 리스트안의 내용을 모두 지워줌
		System.out.println(list);
	}
}
