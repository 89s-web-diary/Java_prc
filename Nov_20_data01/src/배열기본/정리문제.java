package 배열기본;

import java.util.Arrays;
import java.util.Random;

public class 정리문제 {
	public static void main(String[] args) {
		// 문제 2
		Random r = new Random(100);
		int[] n = new int[20];
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(900);
		}
		int max = n[0];
		for (int i : n) {
			if(i>max) {
				max = i;
			}
		}
		Print.arr(n);
		System.out.println(max);
		
		// 문제 3
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		System.out.println(s1.equals(s2));
		
		if(s1.length()>s2.length()) {
			System.out.println("s1이 더 김");
		}else {
			System.out.println("s2가 더 김");
		}
		
		// 문제 4 
		String s3 = "나는 진짜 java programmer가 되었어";
		String s = s3.substring(6,21);
		System.out.println(s.toUpperCase());
		
		// 문제 5
		String s4 = "2056521";
		char c = s4.charAt(0);
		if (c == '2') {
			System.out.println("여자");
		}else if(c =='1') {
			System.out.println("남자");
		}
		
		String s5 = " [    10, 50, 20, 40, 35]";
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		System.out.println(s5);
		s5 = s5.trim();
		System.out.println(s5);
		String[] s6 = s5.split(", ");
		Print.arr(s6);
		int sum = 0;
		for (String ss : s6) {
			sum+= Integer.parseInt(ss);
		}
		System.out.println(sum);
		
		int[] newar = new int[s6.length];
		for (int i = 0; i < newar.length; i++) {
			newar[i] = Integer.parseInt(s6[i]);
		}
		Print.arr(newar);
		Arrays.sort(newar);
		Print.arr(newar);
		
		StringBuilder sb = new StringBuilder();
		sb.append("홍길동씨");
		System.out.println(sb);
		sb.insert(4," 약 먹을 시간입니다");
		System.out.println(sb);
		
		String s7 = "하이네바이네";
		char[] cc = s7.toCharArray();
		Print.arr(cc);
		// String --> String[] or char[] or char or String추출
		}

}
