package 형변환응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 크롤링 extends JFrame{
	
	JButton b1, b2, b3, cs;
	JLabel l1;
	JTextField t1;
	
	public 크롤링() {
		
		setSize(400, 600);
		getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		b1 = new JButton("카카오");	// 035720
		b1.setBackground(Color.CYAN);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search("035720");
			}
		});
		b2 = new JButton("삼성전자");	// 005930
		b2.setBackground(Color.magenta);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search("005930");
			}
		});
		b3 = new JButton("셀트리온");	// 068270
		b3.setBackground(Color.pink);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search("068270");
			}
		});
		l1 = new JLabel("code");
		t1 = new JTextField(11);
		cs = new JButton("크롤링시작");
		cs.setBackground(Color.lightGray);
		
		Font font1 = new Font("돋움", Font.PLAIN, 60);
		b1.setFont(font1);
		b2.setFont(font1);
		b3.setFont(font1);
		cs.setFont(font1);
		Font font2 = new Font("굴림체", Font.BOLD, 55);
		l1.setFont(font2);
		Font font3 = new Font("굴림체", Font.BOLD, 45);
		t1.setFont(font3);
		
		add(b1);
		add(b2);
		add(b3);
		add(l1);
		add(t1);
		add(cs);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		크롤링 name = new 크롤링();
	}
	
	public void search(String a) {
		t1.setText(a);
		t1.setHorizontalAlignment(JTextField.CENTER);
	}

}
