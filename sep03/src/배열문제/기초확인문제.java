package 배열문제;

public class 기초확인문제 {

	public static void main(String[] args) {

		int[] s = new int[5];
		System.out.println(s.length);
		s[0] = 100;
		System.out.println(s[0]);
		s[4] = 500;
		System.out.println(s[4]);
		s[2] = 200;
		System.out.println(s[2]);
		for (int i : s) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 0; i < s.length; i++) {
			System.out.println(i + " : " + s[i]);
		}

	}

}
