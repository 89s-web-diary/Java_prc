package 상속응용;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 경주 extends JFrame {

	JLabel c1, c2, c3, c4;
	Random r = new Random(0);
	int x, y, z, w = 40;

	public 경주() {

		setSize(500, 1000);
//		FlowLayout flow = new FlowLayout();
//		setLayout(flow);

		c1 = new JLabel();
		c2 = new JLabel();
		c3 = new JLabel();
		c4 = new JLabel();

		ImageIcon ic1 = new ImageIcon("c1.png");
		ImageIcon ic2 = new ImageIcon("c2.png");
		ImageIcon ic3 = new ImageIcon("c3.png");
		ImageIcon ic4 = new ImageIcon("c4.png");

		c1.setIcon(ic1);
		c2.setIcon(ic2);
		c3.setIcon(ic3);
		c4.setIcon(ic4);
	
		car1 차1 = new car1();
		car2 차2 = new car2();
		car3 차3 = new car3();
		car4 차4 = new car4();
		
		차1.start();
		차2.start();
		차3.start();
		차4.start();
		
		JLabel c5 = new JLabel();
		add(c5);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {

		경주 시이작 = new 경주();

	}

	public class car1 extends Thread {

		public void run() {
			while(x < 860) {
				c1.setBounds(50, x, 70, 100);
				add(c1);
				x = x + r.nextInt(15);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			JOptionPane.showMessageDialog(null, "1번 우승!");
			car2 차2 = new car2();
			차2.stop();
			car3 차3 = new car3();
			차3.stop();
			car4 차4 = new car4();
			차4.stop();
			setVisible(false);
		}

	}
	public class car2 extends Thread {

		public void run() {
			while(y < 860) {
				c2.setBounds(150, y, 70, 100);
				add(c2);
				y = y + r.nextInt(15);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			JOptionPane.showMessageDialog(null, "2번 우승!");
			car1 차1 = new car1();
			차1.stop();
			car3 차3 = new car3();
			차3.stop();
			car4 차4 = new car4();
			차4.stop();
			setVisible(false);
		}

	}
	public class car3 extends Thread {

		public void run() {
			while(z < 860) {
				c3.setBounds(250, z, 70, 100);
				add(c3);
				z = z + r.nextInt(15);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			JOptionPane.showMessageDialog(null, "3번 우승!");
			car1 차1 = new car1();
			차1.stop();
			car2 차2 = new car2();
			차2.stop();
			car4 차4 = new car4();
			차4.stop();
			setVisible(false);
		}

	}
	public class car4 extends Thread {

		public void run() {
			while(w < 860) {
				c4.setBounds(350, w, 70, 100);
				add(c4);
				w = w+ r.nextInt(15);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			JOptionPane.showMessageDialog(null, "4번 우승!");
			car1 차1 = new car1();
			차1.stop();
			car3 차3 = new car3();
			차3.stop();
			car2 차2 = new car2();
			//차2.set(false);
			setVisible(false);
			
		}

	}

}
