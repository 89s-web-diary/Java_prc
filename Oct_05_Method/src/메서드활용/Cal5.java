package 메서드활용;

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
		for (int i : num) {
			if(!list.contains(i)) {
				list.add(i);
			}
		}
		return list;
	}

}
