package 컬렉션;

import java.util.HashMap;

public class Map연습1 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("apple", "사과");
		map.put("melon", "멜론");
		map.put("ice", "얼음");
		System.out.println(map);
		System.out.println(map.get("apple"));
		
	}

}
