package variable;

public class 기본형심화 {

	public static void main(String[] args) {

		// 기본형 데이터 4가지 ==> 값을 변수에 바로 넣는다. 원시타입
		// 정수, 실수, 문자1글자, 논리
		// 정수 4가지(byte, short, int, long)
		// 실수 2가지(float, double)
		byte age = 127; // +-127(-128~127), 1byte(8bit)
		// byte age2 = 128;
		short wallet = 25000; // +-3만, 2byte
		int money = 20000000; // +-21억, 4byte
		long space = 20000000000L; // 21억 이상, 8byte
		//           [           ] << 이 범위안에 숫자를 쓰면 long타입을 정해도 int로 인식
		// 							     따라서 숫자 뒤에 L(l)을 써주어야 long타입으로 인식
		
		float weight = 88.8F;
		// long과 같이 float으로 인식시키려면 F(f)를 붙여주어야 함
		double height = 185.5;

		// 모두 int로 했을 대와 메모리 크기 비교!
		// 1) 각각 타입을 다르게 해서 메모리 할당 ==> 7byte
		// 2) 모두 같은 타입인 int로 메모리 할당 ==> 12byte
		// 은행 고객이 5명 로그인을 한 경우
		// 1) 7 * 5 = 35byte
		// 2) 12 * 5 = 60byte

	}
}
