package 배열기본;

import java.util.ArrayList;
import java.util.Arrays;

// 1. 전체 목록 프린트
// 2. 300이상 들어있는 위치를 arraylist로 모으기
// 3. arraylist안 인덱스에 해당하는 배열의 값들에서 100만큼 빼기
// 4. 수정된 배열 전체 프린트

public class 배열결과리스트에넣기 {

	public static void main(String[] args) {
		int[] n = { 100, 200, 300, 400, 500 };

		Print.arr(n);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int cnt = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 300) {
				list.add(i);
				cnt++;
			}
		}
		System.out.println("300이상의 값 >> " + cnt);
		/*
		 * for (int i = 0; i < list.size(); i++) { n[list.get(i)] -= 100; }
		 */ // 아래 for문이랑 동일
		for (Integer index : list) {
			n[index] -= 100;
		}
		Print.arr(n);
	}

}
