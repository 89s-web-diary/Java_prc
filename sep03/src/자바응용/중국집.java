package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 중국집 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(770, 700);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton();
		b1.setText("짬뽕");
		b1.setBackground(Color.magenta);

		JButton b2 = new JButton();
		b2.setText("우동");
		b2.setBackground(Color.yellow);

		JButton b3 = new JButton();
		b3.setText("짜장");
		b3.setBackground(Color.cyan);

		JLabel l1 = new JLabel();
		l1.setText("개수 : 0 개");
		l1.setForeground(Color.blue);

		JLabel l2 = new JLabel();
		ImageIcon icon = new ImageIcon("china.jpg");
		l2.setIcon(icon);

		JLabel l3 = new JLabel();
		l3.setText("결제금액 : ");
		l3.setForeground(Color.red);

		Font f1 = new Font("맑은 굴림", 1, 50);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);

		Font f2 = new Font("궁서", 1, 40);
		l1.setFont(f2);
		l3.setFont(f2);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);

	}

}
