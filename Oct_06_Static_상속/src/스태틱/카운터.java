package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터 {

	public static int cnt;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel l1 = new JLabel(String.valueOf(cnt));
		l1.setForeground(Color.red);

		JButton m1 = new JButton("1빼기");
		m1.setBackground(Color.green);
		m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cnt--;
				l1.setText(String.valueOf(cnt));
			}
		});
		JButton reset = new JButton("0으로 초기화");
		reset.setBackground(Color.blue);
		reset.setForeground(Color.white);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cnt = 0;
				l1.setText(String.valueOf(cnt));
			}
		});
		JButton p1 = new JButton("1더하기");
		p1.setBackground(Color.green);
		p1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cnt++;
				l1.setText(String.valueOf(cnt));
			}
		});

		l1.setFont(new Font("궁서", Font.BOLD, 150));

		f.add(m1);
		f.add(reset);
		f.add(p1);
		f.add(l1);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
