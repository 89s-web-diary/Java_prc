package 자바응용;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 중국집 {

	static int tot = 0, prc = 0;
	static JFrame f;
	static JLabel l1, l2, l3;
	// main안에서 사용하기 위해서는 main이 static이 붙어있음.
	// main밖에 있는 변수도 static이 붙어 있어야함.

	public static void main(String[] args) {

		f = new JFrame();
		f.setSize(770, 700);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		l1 = new JLabel();
		l1.setText("개수 : " + tot + "개");
		l1.setForeground(Color.blue);

		l2 = new JLabel();
		ImageIcon iconC = new ImageIcon("china.jpg");
		ImageIcon iconJ = new ImageIcon("jja.jpg");
		ImageIcon iconJJ = new ImageIcon("jjam.jpg");
		ImageIcon iconU = new ImageIcon("uu.jpg");
		l2.setIcon(iconC);

		l3 = new JLabel();
		l3.setText("결제금액 : " + prc + "원");
		l3.setForeground(Color.red);

		JButton b1 = new JButton();
		b1.setText("짬뽕");
		b1.setBackground(Color.magenta);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(1);
				l2.setIcon(iconJJ);
			}
		});

		JButton b2 = new JButton();
		b2.setText("우동");
		b2.setBackground(Color.yellow);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(2);
				l2.setIcon(iconU);
			}
		});

		JButton b3 = new JButton();
		b3.setText("짜장");
		b3.setBackground(Color.cyan);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(3);
				l2.setIcon(iconJ);
			}
		});

		JButton b4 = new JButton();
		b4.setText("계산");
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(4);
				l2.setIcon(iconC);
			}
		});

		Font f1 = new Font("맑은 굴림", 1, 50);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);

		Font f2 = new Font("궁서", 1, 40);
		l1.setFont(f2);
		l3.setFont(f2);
		b4.setFont(f1);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(b4);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);

	}

	public static void show(int a) {

		tot++;
		if (a == 1) {
			prc += 5000;
		} else if (a == 2) {
			prc += 6000;
		} else if (a == 3) {
			prc += 4000;
		} else if (a == 4) {
			JOptionPane.showMessageDialog(f, prc + "원 결제되었습니다.");
			tot = 0;
			prc = 0;
		}
		l1.setText("개수 : " + tot + "개");
		l3.setText("결제금액 : " + prc + "원");
	}

}
