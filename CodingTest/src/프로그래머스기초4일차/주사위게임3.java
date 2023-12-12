package 프로그래머스기초4일차;

public class 주사위게임3 {

	public static void main(String[] args) {
		int a = 6;
		int b = 4;
		int c = 2;
		int d = 5;
		Solution2 sol = new Solution2();
		System.out.println(sol.solution(a, b, c, d));
	}
}

// case1. 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다. clear
// case2. 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
// case3. 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
// case4. 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
// case5. 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다. clear

class Solution2 {
	public int solution(int a, int b, int c, int d) {
		if(a==b) {
			if(c==d) {
				if(b==c) {
					return 1111*a;
				}else {
					return (a+c) * Math.abs(a-c);
				}
			}else {
				if(a==c||a==d) { // case2
					int e = a!=c?c:d;
					return (10*a+e)*(10*a+e);
				}else {
					return c*d;
				}
			}
		}else {
			if(c==d) {
				if(c==a||c==b) { // case2
					int e = c!=a?a:b;
					return (10*c+e)*(10*c+e);
				}else {
					return a*b;
				}
			}else {
				if(a==c || b==d || a==d || b==c) {
					if(a==c && b==d) {
						return (a+b) * Math.abs(a-b);
					}else if(a==d && b==c){
						return (a+b) * Math.abs(a-b);
					}else if(a==c && b!=d) {
						return b*d;
					}else if(a==d && b!=c) {
						return b*c;
					}else if(b==d && a!=c) {
						return a*c;
					}else
						return a*d;
				}else {
					int min1 = a<b?a:b;
					int min2 = c<d?c:d;
					return min1<min2?min1:min2;
				}
			}
		}
	}
}