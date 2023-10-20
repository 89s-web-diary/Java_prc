package 예외처리;

public class 문제발생클래스2 {

	public static void main(String[] args) {

		System.out.println("1. 나는 실행");
		try {
			System.out.println("2. 0으로 나누기 >> " + 10 / 0);
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[3]);	// Index는 2번까지밖에 없는데 3번을 호출 ==> Runtime Error 예정
		} catch (Exception e) {
			// e.printStackTrace();
			// 서버관리자에게 이메일을 보내는 처리
			// 서버관리자에게 문자를 보내는 처리
			// git History 처리
			// Jira History 처리
			System.out.println("0으로 나눠서 실행X");
		}
		System.out.println("3. 여기는 가능??");

	}

}
