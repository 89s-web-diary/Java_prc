package 비선형구조;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class 우승자투표문제 {

	public static void main(String[] args) {
		
		// HashMap 이용, getOrDefault()함수를 사용하면 편함
		String[] all = {"홍길동", "김길동", "홍길동", "정길동", "홍길동", "조길동", "김길동"};

		
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < all.length; i++) {
			map.put(all[i], map.getOrDefault(all[i], 0)+1);
		}
		// 1. 전체 명단 프린트
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		// 2. 각 명단의 사람이 몇 표씩을 획득했는가?
		System.out.println(map);

		// 3. 누가 제일 높은 득표를 했는가? 몇 표인가?
		ArrayList<Integer> val = new ArrayList<Integer>();
		for (String key : keys) {
			val.add(map.get(key));
		}
		int max = Collections.max(val);
		// 위의 다섯줄이 아래 두줄로 줄여짐
		Collection<Integer> values = map.values();
		int max2 = Collections.max(values);
		System.out.println(max + " " + max2);
		
		for (String key : keys) {
			if(map.get(key) == max) {
				System.out.println(key);
			}
			
		}
		
		
		
	}

}
