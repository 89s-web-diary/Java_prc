package 생성자복습;

import java.util.ArrayList;

public class Cal5 {
	
	public ArrayList<Integer> getEven(int[] num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : num) {
			if(i%2==0) {
				list.add(i);
			}
		}
		return list;
	}
	
	public ArrayList<Integer> getOdd(int[] num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : num) {
			if(i%2==1) {
				list.add(i);
			}
		}
		return list;
	}
	
	public ArrayList<Integer> getUnique(int[] num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// arraylist는 중복된 것 포함해서 리스트 입력가능
		// hashset은 중복된 내용을 넣지 않음.
		// HashSet list = new HashSet();
		// <== HashSet으로 list생성 시 아래 조건문 필요x
		for (int i : num) {
			if(!list.contains(i)) {
				list.add(i);
			}
		}
		return list;
	}

}
