package 배열응용고급;

import java.util.Arrays;

public class 깊은복사성적문제 {

	public static void main(String[] args) {

		String[] 과목명 = { "국어", "영어", "수학", "컴퓨터", "화학" };
		int[] term1 = { 44, 66, 22, 99, 100 };
		int[] term2 = term1.clone();
		term2[0] = 22;
		term2[2] = 88;

		System.out.println("1학기 성적 >> " + Arrays.toString(term1));
		System.out.println("2학기 성적 >> " + Arrays.toString(term2));
		int cnt = 0, cnt2 = 0, cls = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				cnt++;
			} else if (term1[i] < term2[i]) {
				cnt2++;
				cls = i;
			}
		}
		System.out.println("1학기, 2학기 성적 중 동일한 성적 과목수 >> " + cnt);
		System.out.println("1학기, 2학기 성적 중 오른 과목수 >> " + cnt2);
		System.out.println("1학기, 2학기 성적 중 오른 과목명 >> " + 과목명[cls]);

	}

}
