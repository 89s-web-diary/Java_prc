package 선형구조_스택;

import java.util.LinkedList;

public class 백준큐카드문제 {

	public static void main(String[] args) {
		
		int x = 9;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for (int i = 1; i <= x; i++) {
			queue.add(i);
		}
		System.out.println(queue);
		while(queue.size()!=1) {
			queue.remove(0);
			queue.add(queue.remove());
			System.out.println(queue);
		}
		System.out.println(queue);
	}

}
