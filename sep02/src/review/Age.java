package review;

public class Age {

	public static void main(String[] args) {

		int age = 100;

		int age2 = age + 1;

		String res = "";

		if (age2 > 100) {
			res = "이제부터 시작";
		} else {
			res = "아직 젊어요";
		}

		System.out.println(res);
	}

}
