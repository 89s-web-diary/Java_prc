package 제어문.순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 화면만들기2 {

	public static void main(String[] args) {

		// 1. 필요한 부품을 ram에 다 준비
		// JFrame f
		// JButton b
		// JTextField t1
		// JTextField t2
		// JTextField t3
		// FlowLayout flow

		// 다 import 해주는 단축키 => 컨트롤 + 쉬프트 + o

		JFrame f = new JFrame();
		f.setSize(250, 300);

		JButton b = new JButton();
		b.setText("호로로로로롤로로로로로로ㅗㄹ로롤롤");

		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		JTextField t3 = new JTextField(20);
		FlowLayout flow = new FlowLayout();
		// 글자 써주는 부품 JLabel
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		l1.setText("이름 :");
		l2.setText("나이 :");
		l3.setText("취미 :");

		f.setLayout(flow);
		f.add(b);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);

		f.setVisible(true);
		// 맨 밑에 넣어야지 작업한 거 다 볼 수 있음

	}

}
