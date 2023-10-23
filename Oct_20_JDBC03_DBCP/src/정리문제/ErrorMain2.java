package 정리문제;

public class ErrorMain2 {

	public static void main(String[] args) {
		
		Error2 e = new Error2();
		try {
			e.arr2();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("배열 인덱스 에러를 예외처리함");
		}
		System.out.println("여기는 실행되어야만 해");
	}

}
