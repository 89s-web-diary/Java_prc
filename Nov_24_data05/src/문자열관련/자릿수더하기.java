package 문자열관련;

import java.util.Arrays;

import 배열기본.Print;

public class 자릿수더하기 {
	public static void main(String[] args) {
		Sol3 s = new Sol3();
		int num = 1234;
		int result = s.sol3(num);
		System.out.println(result);
	}
}

class Solution2 {
	public int solution(int n) {
		String s = String.valueOf(n);//"1234"
		//String의 값들을 하나씩 떨어뜨리는 방법은 2가지 
		int answer = 0;
		
		//1) char로 분리 ==> 아스키코드를 고려!!
		char[] c = s.toCharArray(); 
		//c = {'1','2','3','4'};
		for (int i = 0; i < c.length; i++) {
			answer = answer + c[i] - '0';
			// char은 아스키코드 값으로 되어있기에 '0'의 아스키코드 값을 빼줌으로써 int값 숫자로 받아올 수 있음 
		}
		//2) String로 분리(** 더편함)
		//String[] s2 = s.split(""); 
		//s2 = {"1","2","3","4"};
		//하나씩 꺼내서 int로 변경 후, 더해주자.
//		for (int i = 0; i < s2.length; i++) {
//			int x = Integer.parseInt(s2[i]);
//			answer = answer + x;
//		}
		return answer;
	}
}

class Sol3{
	public int sol3(int n) {
		String s = String.valueOf(n);
		char[] c = s.toCharArray();
		int answer = 0;
		for (int i = 0; i < c.length; i++) {
			answer = answer + c[i] - '0';
		}
		return answer;
	}
}
