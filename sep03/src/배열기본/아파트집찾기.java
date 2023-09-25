package 배열기본;

public class 아파트집찾기 {

	public static void main(String[] args) {
		
		int[] s = new int[5];
		System.out.println("배열이 들어있는 주소 >> " + s[1]);
		
		int[] s2 = {1, 2, 3, 4, 5};
		
		
		s[0] = 100;
		s[2] = 200;
		s[s.length-1] = 300;
		
		
		System.out.println(s[0]);
		System.out.println(s[2]);
		System.out.println(s[4]);
		
		System.out.println(s2.length);
		System.out.println(s.length);
		
		System.out.println(s[0] + s[2]);
		System.out.println(s[0] == s[2]);
		
	}

}
