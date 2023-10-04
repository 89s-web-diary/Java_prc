package 배열스윙;

import java.awt.Color;
//import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 많은버튼만들기 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(1020, 1050);
		f.setTitle("나의 버튼들");
		f.getContentPane().setBackground(Color.yellow);

		f.setLayout(null);

//		Random r = new Random();

		JButton[] b = new JButton[200];
		// {null, null, ...}
		// 모든 기본형 제외한 참조형 배열은 초기값은 null
		int y = 0, x = 0;
		for (int i = 0; i < b.length; i++) {
			b[i] = new JButton("버튼" + i);
		}
		int i=0;
		for (int k = 0; k < 20; k++) {
			for (int j = 0; j < 10; j++) {
				b[i].setBounds(x, y, 100, 50); // setBounds(위치x값, 위치y값, 가로사이즈, 세로사이즈)
				f.add(b[i]);
				x = x + 100;
				i++;
			}
			x=0;
			y=y+50;
		}

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
