package 배열기본;

public class String정리 {
	public static void main(String[] args) {

		String s = "    011-245-1234    ";
		s = s.trim();
		String[] arrS = s.split("-");
		Print.arr(arrS);
		if (arrS[0].equals("011")) {
			System.out.println("SK");
		} else if (arrS[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		if (arrS[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		if (s.replace("-", "").length() >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지않은 전화번호");
		}
		System.out.println(s.replace("-", ""));

		String ss = " '휴지','블루볼펜','지우개'+=-";
		ss = ss.trim();
		ss = ss.replace("+=-", "");
		ss = ss.replace("'", "");
		String[] arrSS = ss.split(",");

		if (arrSS[1].substring(0, 2).equals("블루")) {
			System.out.println("파란볼펜이군요");
		} else {
			System.out.println("빨간볼펜이군요");
		}
		Print.arr(arrSS);
		String ans = arrSS[0];
		for (String str : arrSS) {
			if (ans.length() > str.length()) {
				ans = str;
			}
		}
		System.out.println("가장 짧은 문자열 >>> " + ans);

		int[] num = new int[arrSS.length];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = arrSS[i].length();
			sum += arrSS[i].length();
		}
		Print.arr(num);
		System.out.println(sum);

	}

}
