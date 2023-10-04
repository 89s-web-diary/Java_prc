package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기테스트 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(550, 500);
		f.getContentPane().setBackground(Color.white);
		f.setTitle("일기장");
		f.getContentPane().setBackground(Color.yellow);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel l1 = new JLabel();
		l1.setText("오늘의 날짜 : ");
		JLabel l2 = new JLabel();
		l2.setText("오늘의 제목 : ");
		JLabel l3 = new JLabel();
		l3.setText("오늘의 내용 : ");
		JLabel l4 = new JLabel();
		l4.setText("                                          ");
		JTextField t1 = new JTextField(10);
		t1.setForeground(Color.blue);
		JTextField t2 = new JTextField(10);
		t2.setForeground(Color.blue);
		JTextArea t3 = new JTextArea(5,10);
		t3.setForeground(Color.blue);
		
		JButton b1 = new JButton();
		b1.setText("파일에 일기 저장");
		b1.setBackground(Color.magenta);
		
		Font font = new Font("맑은 고딕",1,30);
		Font font2 = new Font("맑은 고딕",1,40);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		l4.setFont(font);
		b1.setFont(font2);
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(b1);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
