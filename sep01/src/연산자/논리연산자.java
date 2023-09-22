package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {

		// &&, ||, !
		// 회원가잆 시 입력
		int id = 1111;
		int pw = 2222;

		// &&에서 맨 앞 조건의 결과가 false인 경우, 뒤에 있는 조건의 비교는 불필요
		// ||에서 맨 앞 조건의 결과가 true인 경우, 뒤에 있는 조건의 비교는 불필요

		// 현재 로그인하기 위해 입력
		int id2 = 1111;
		int pw2 = 3333;
		if (id == id2 && pw == pw2){
			System.out.println("로그인 ok");
		} else {
			System.out.println("로그인 not");
		}

	}

}
