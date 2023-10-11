package 상속응용;

public class ThreadProgramming1 {

	public static void main(String[] args) {
		
		카운터스레드 counter = new 카운터스레드();
		시각스레드 timer = new 시각스레드();
		배열스레드 img = new 배열스레드();
		
		timer.start();
		counter.start();
		img.start();
		
	}

}
