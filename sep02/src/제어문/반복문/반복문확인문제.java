package 제어문.반복문;

public class 반복문확인문제 {

	public static void main(String[] args) {
		
		while(true) {
			for(int i=0; i<10; i++) {
				System.out.print("*");
			}
			break;
		}
		System.out.println("");
		System.out.println("=============");
		
		while(true) {
			for(int i = 0; i<5; i++) {
				System.out.print("커피*");
			}
			break;
		}
		System.out.println("");
		System.out.println("=============");

		while(true) {
			for(int i = 0; i<3; i++) {
				System.out.println("커피*우유");
			}
			break;
		}
		System.out.println("=============");
		
		while(true) {
			for(int i = 1; i<4; i++) {
				System.out.println(i + " : 짱!");
			}
			break;
		}

	}

}
