package 배열기본;

public class 배열최솟값찾기 {
	public static void main(String[] args) {

		int[] n = { 90, 80, 20, 60, 70 };
		// 최솟값/최댓값을 찾을 때 >>> 인덱스를 하나씩 옮기면서 거기까지 최솟값/최댓값을 넣어둘 수 있는 변수를 따로 생성
		// 그 최솟값/최댓값보다 작거나 크면 그 값을 넣어주는 변수가 변경
		int min = n[0];
		for (int i : n) {
			if (i < min) {
				min = i;
			}
		}
		System.out.println("최솟값은 >> " + min);

	}

}
