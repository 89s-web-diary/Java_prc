package 회원정보;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 회원정보UI {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(400, 470);
		f.getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		JLabel top = new JLabel();
		ImageIcon img = new ImageIcon("1.png");
		top.setIcon(img);
		JLabel id = new JLabel();
		id.setText("회원 I D");
		JLabel pw = new JLabel();
		pw.setText("회원 PW");
		JLabel name = new JLabel();
		name.setText("회원이름");
		JLabel tel = new JLabel();
		tel.setText("전화번호");
		
		JTextField idt = new JTextField(10);
		idt.setBackground(Color.lightGray);
		JTextField pwt = new JTextField(10);
		pwt.setBackground(Color.lightGray);
		JTextField namet = new JTextField(10);
		namet.setBackground(Color.lightGray);
		JTextField telt = new JTextField(10);
		telt.setBackground(Color.lightGray);
		
		JButton log = new JButton();
		log.setText("회원 가입 완료");
		log.setBackground(Color.cyan);
		log.setOpaque(true);
		JButton del = new JButton();
		del.setText("회원 탈퇴 처리");
		del.setBackground(Color.red);
		del.setOpaque(true);
		
		Font font = new Font("돋움", Font.BOLD, 25);
		Font font2 = new Font("돋움", Font.BOLD, 35);
		id.setFont(font);
		idt.setFont(font);
		pw.setFont(font);
		pwt.setFont(font);
		name.setFont(font);
		namet.setFont(font);
		tel.setFont(font);
		telt.setFont(font);
		log.setFont(font2);
		del.setFont(font2);
		
		f.add(top);
		f.add(id);
		f.add(idt);
		f.add(pw);
		f.add(pwt);
		f.add(name);
		f.add(namet);
		f.add(tel);
		f.add(telt);
		f.add(log);
		f.add(del);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}

}
