package 배열기본;

public class 타입별배열만들기 {

	public static void main(String[] args) {

		// int, double, String, JButton, boolean 등 배열로 다 만들 수 있다.

		// int형 배열
		int[] age = { 200, 100, 50, 10 };
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}
		System.out.println();
		for (int i : age) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// double형 배열
		double weight[] = { 99.9, 88.8, 77.7, 66.6 };
		for (int i = 0; i < weight.length; i++) {
			System.out.print(weight[i] + " ");
		}
		System.out.println();
		for (double i : weight) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// String형 배열
		String name[] = { "가가", "나나", "다다", "라라" };
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		for (String i : name) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// char형 배열
		char gender[] = {'m','w','w','m'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		for (char i : gender) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// boolean형 배열
		boolean food[] = {false, false, true, false};
		for (int i = 0; i < food.length; i++) {
			System.out.print(food[i] + " ");
		}
		System.out.println();
		for (boolean i : food) {
			System.out.print(i + " ");
		}
		

	}

}
