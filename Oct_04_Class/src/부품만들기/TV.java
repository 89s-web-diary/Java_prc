package 부품만들기;

public class TV {
	// TV라는 부류의 공통적인 특징을 가지고 틀을 만들 예쩡
	// 속성(특성, 성질) - 볼 수 있는 채널, 볼륨, On/Off상태 ==> 멤버변수로 표현
	// 기능(동작) - 채널을 바꾸다, 유튜브 보다 ==> 멤버메서드(멤버함수)로 표현
	
	public int ch, vol;
	public boolean onoff;
	// TV tv1 = new TV();  ==>  4개의 변수가 만들어진다
	// 주소는 4byte, Int는 4Byte boolean은 1Byte ==> 13Byte 생성
	
	public void chch() {
		System.out.println("채널을 바꾸는 기능 처리");
	}
	
	public void youtube() {
		System.out.println("볼륨을 키워서 동영상을 보다");
	}
	
}
