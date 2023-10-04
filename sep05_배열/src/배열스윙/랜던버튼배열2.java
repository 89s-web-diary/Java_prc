package 배열스윙;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜던버튼배열2 {

	public static void main(String[] args) {

		Random r = new Random();

		JFrame f = new JFrame();
		f.setSize(1200, 800);
		f.getContentPane().setBackground(Color.yellow);
		//.에 .을 추가해서 사용 ==> 체인식 코드
		f.setLayout(null);
		
		Color[] clr = {Color.red,Color.magenta,Color.pink,Color.white,Color.blue,Color.green};
		JButton[] b = new JButton[500];
		
		for (int i = 0; i < b.length; i++) {
			b[i] = new JButton("눌러!!");
			int x = r.nextInt(1100);
			int y = r.nextInt(700);
			b[i].setBounds(x, y, 100, 50);
			int k = r.nextInt(6);
			b[i].setBackground(clr[k]);
			f.add(b[i]);
		}
		

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
