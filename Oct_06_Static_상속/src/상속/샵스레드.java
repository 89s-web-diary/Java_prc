package 상속;

public class 샵스레드 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print("#");
		}
		super.run();
	}
	
}
