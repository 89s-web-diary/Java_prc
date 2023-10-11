package 상속응용;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드그래픽 extends JFrame{
	
	// 객체 생성 시 자동호출하는 생성자 메서드를 만들어주면 된다.
	// static은 cpu를 많이 사용 >> static 밖으로 내보내주는 편이 좋음
	
	// static이라 붙으면 객체생성하지 않아도 cpu가 바로 호출해서 사용할 수 있음.
	// 멤버변수가 있으면 static메서드에서 바로 사용 불가능
	// 전역변수에도 static을 붙여주면 객체 생성하지 않아도 static메서드안에서 접근 가능
	// RAM에도 상주하고 있음. 언제든지 cpu가 접근해서 사용 가능. static을 많이 사용하면 X
	
	JLabel cnt, img, day;	// 라벨은 전역변수로 선언
	// 선언된 위치에 따라 사용위치가 결정됨.
	
	public 스레드그래픽() {
		
		setTitle("나의 pc방 모니터링 서비스");
		setSize(600, 300);
		cnt = new JLabel();
		img = new JLabel();
		day = new JLabel();
		getContentPane().add(cnt, BorderLayout.WEST);
		getContentPane().add(img, BorderLayout.EAST);
		getContentPane().add(day, BorderLayout.SOUTH);
		
		Font font = new Font("나눔고딕", Font.BOLD, 40);
		cnt.setFont(font);
		day.setFont(font);
		
		cnt2 cnt2 = new cnt2();
		cnt2.start();
		
		day2 day2 = new day2();
		day2.start();
		
		이미지 img2 = new 이미지();
		img2.start();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public class 카운터스레드 extends Thread {
		
		public void run() {
			for (int i = 500; i >= 0; i--) {
				System.out.println("카운터 >> " + i);
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
	public static void main(String[] args) {
		
		스레드그래픽 f = new 스레드그래픽();
		
	}
	
	
	// 전역변수를 사용하기 위해 클래스 내부에 클래스를 끼워넣음
	// 클래스안에 끼워넣은 클래스를 안쪽클래스라(Inner Class)
	public class cnt2 extends Thread {
		
		public void run() {
			for (int i = 5; i >= 0; i--) {
				cnt.setText("카운터 >> " + i);
				if(i==0) {
					JOptionPane.showMessageDialog(cnt, "Get Out!!!");
					setVisible(false);
				}
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public class day2 extends Thread{
		
		public void run() {
			for (int i = 500; i >= 0; i--) {
				// 오늘 현재 날짜와 시각
				Date date = new Date();
				day.setText(""+date);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public class 이미지 extends Thread {
		
		public void run() {
			
			String[] list = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg"};
			
			for (int i = 0; i < list.length; i++) {
				ImageIcon img2 = new ImageIcon(list[i]);
				img.setIcon(img2);
				
				if(i==4) {
					i=-1;
				}
				try {
					Thread.sleep(5000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
