package 선형구조;

import java.util.*;

public class TreeSet테스트 {

	public static void main(String[] args) {

		int[] n = { 22, 33, 66, 11, 10, 15 };
		Arrays.sort(n);
		int maxK = n[n.length-2];
		System.out.println(maxK);

		TreeSet<Integer> tree = new TreeSet<Integer>();
		int[] n2 = { 22, 22, 44, 11, 11, 33, 55, 66, 20, 10, 30, 55 };
		for (int i : n2) {
			tree.add(i);
		}
		Object[] res = tree.toArray();
		System.out.println(res[res.length-2]);
	}

}
