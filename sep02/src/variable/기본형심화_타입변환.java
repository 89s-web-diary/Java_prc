package variable;

public class 기본형심화_타입변환 {

	public static void main(String[] args) {
		
		byte age = 127;		//1바이트
		int age2 = age;		//4바이트(문제x)
		// 큰방 <---- 작은방 : 자동으로 알아서 들어감.
		
		int age3 = 127;
		byte age4 = (byte)age3;
		// 작은방 <---- 큰방 : 안들어감 ㅜㅜ
		
	}

}
