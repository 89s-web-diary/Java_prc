package 메서드연습;

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
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(650, 800);
		f.getContentPane().setBackground(Color.cyan);
		f.setTitle("로그인 화면");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		ImageIcon diary = new ImageIcon("diary.png");
		ImageIcon log = new ImageIcon("login.png");
		ImageIcon re = new ImageIcon("reset.png");

		JLabel top = new JLabel();
		top.setIcon(diary);
		JLabel id = new JLabel();
		id.setText("ID :");
		JLabel pw = new JLabel();
		pw.setText("PW :");

		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.lightGray);
		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.lightGray);

		JButton login = new JButton();
		login.setIcon(log);
		login.setBackground(Color.gray);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = t1.getText();
				String b = t2.getText();
				if (a.equals("root") && b.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					일기쓰기화면 dry = new 일기쓰기화면();
					dry.open();
					f.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});

		JButton reset = new JButton();
		reset.setIcon(re);
		reset.setBackground(Color.gray);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});

		Font f1 = new Font("맑은 고딕", 1, 50);
		id.setFont(f1);
		pw.setFont(f1);
		t1.setFont(f1);
		t2.setFont(f1);
		login.setFont(f1);
		reset.setFont(f1);

		f.add(top);
		f.add(id);
		f.add(t1);
		f.add(pw);
		f.add(t2);
		f.add(login);
		f.add(reset);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
