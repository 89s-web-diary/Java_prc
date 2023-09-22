package 정리문제;

public class Exam5 {

	public static void main(String[] args) {

		int n = 5;
		int prc = 5000;

		int tot = n * prc;

		System.out.println("총 커피값은 " + tot);
		if (tot > 20000) {
			System.out.println("할인해드릴게요");
		} else {
			System.out.println("총 커피값을 내세요");
		}

	}

}
