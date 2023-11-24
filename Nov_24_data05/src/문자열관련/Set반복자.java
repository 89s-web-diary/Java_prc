package 문자열관련;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자 {
	public static void main(String[] args) {
		// set은 꺼내는 기능이 없다. 순서도 없다.
		HashSet<String> set = new HashSet<String>();
		set.add("혤캉");
		set.add("혤캉");
		set.add("마우가");
		set.add("마우가");
		set.add("마우가");
		System.out.println(set);
		
		// set에 있는 값을 하나씩 꺼내려면 반복자를 달아주어야함
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// array >> list : arrays.asList()
		// list >> array : list.toArray()
		// set >> array : set.toArray()
	}
}
