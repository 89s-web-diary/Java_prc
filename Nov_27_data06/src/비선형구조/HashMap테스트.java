package 비선형구조;

import java.util.HashMap;

public class HashMap테스트 {

	public static void main(String[] args) {
		String[] part = {"mislav", "stanko", "mislav", "ana"};
		String[] comp = {"stanko", "ana", "mislav"};
		
		// 1. 참여자 목록 생성
		HashMap<String, Integer> list = new HashMap<>();
		for (int i = 0; i < part.length; i++) {
			list.put(part[i], list.getOrDefault(part[i], 0)+1);
		}
		System.out.println(list);
		
		for (int i = 0; i < comp.length; i++) {
			list.put(comp[i], list.get(comp[i])-1);
		}
		System.out.println(list);
		
		String answer = "";
		for (int i = 0; i < part.length; i++) {
			if(list.get(part[i])!=0) {
				answer = part[i];
			}
		}
		System.out.println(answer);
	}

}
