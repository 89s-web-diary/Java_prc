package 배열응용;

public class 성적변동문제 {

	public static void main(String[] args) {

		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		// 2학기에 오른 학생 수 카운트
		// 1,2학기 동일한 학생 수와 번호
		int up = 0, equ = 0;

		for (int i = 0; i < term1.length; i++) {
			if (term1[i] < term2[i]) {
				up++;
			}else if (term1[i] == term2[i]) {
				equ++;
				System.out.println(i);
			}
		}

		System.out.println("향상된 학생 수 >> " + up + "명");

		System.out.println("동일한 학생 수 >> " + equ + "명");
	}

}
