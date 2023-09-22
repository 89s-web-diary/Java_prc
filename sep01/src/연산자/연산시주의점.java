package 연산자;

public class 연산시주의점 {

	public static void main(String[] args) {

		int n1 = 5;
		int n2 = 4;

		int sum = n1 + n2;
		// 자바의 연산시 정수와 정수 연산은 무조건 정수!!!!
		int n4 = sum / 2;
		// 자바의 연산시 "하나라도 실수"이면 무조건 실수!!!!
		System.out.println("평균은 " + n4);

		double avg = (double)sum / 2;
		// 강제 타입 변환 >>> 강제형변환 >>> casting(캐스팅)이라고 함
		
		System.out.println("제대로 평균은 " + avg);

	}

}
