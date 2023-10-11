package 상속;

public class 스레드사용 {

	public static void main(String[] args) {
		
		증가스레드 t1 = new 증가스레드();
		감소스레드 t2 = new 감소스레드();
		별스레드 t3 = new 별스레드();
		이름스레드 t4 = new 이름스레드();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
