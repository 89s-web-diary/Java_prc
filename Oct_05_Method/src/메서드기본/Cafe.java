package 메서드기본;

public class Cafe {

	public static void main(String[] args) {
		// 계산기의 add()기능을 사용하고 싶으면 램에 계산기 원본을 이용해서
		// 대상을 가져다 놓고 난 다음(new) 필요한 메서드를 사용한다.
		// ==> 객체 생성 먼저 한 후, 필요한 메서드를 선택해서 사용하면 됨.
		// cal 변수안에 계산기 생성된 것의 위치(주소)가 들어있음.
		// ==> 생성된 주소가 있어야 메서드 사용이 가능!
		
		Cal cal = new Cal();
		cal.add(10, 20);
		int sum = cal.add2(10, 20);
		System.out.println(sum);
	}

}
