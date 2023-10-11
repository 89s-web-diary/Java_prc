package 상속응용;

import java.util.Date;

public class 시각스레드 extends Thread{
	
	public void run() {
		Date date = new Date();
		for (int i = 500; i >= 0; i--) {
			// 오늘 현재 날짜와 시각
			System.out.println("시각 >> " + date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
