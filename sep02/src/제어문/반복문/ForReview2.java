package 제어문.반복문;

public class ForReview2 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i < 1000; i = i + 3) {
			if ((i % 5) != 0) {
				sum = sum + i;
				System.out.println("sum >>>>	" + sum + "		i >>>>		" + i);
				if (sum > 100) {
					System.exit(0);
				}
			}
		}
	}
}
