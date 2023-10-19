package 게시판정보;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 게시판UI {
	
	public void bbs() {
		
		JFrame f = new JFrame();
		f.setSize(400, 600);
		f.getContentPane().setBackground(Color.yellow);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel top = new JLabel();
		top.setText("게시판");
		top.setHorizontalAlignment(JLabel.CENTER);
		JLabel l1 = new JLabel();
		l1.setText("-----------------");
		JLabel tit = new JLabel();
		tit.setText("제목 입력");
		JLabel writer = new JLabel();
		writer.setText("작성자 입력");
		JLabel content = new JLabel();
		content.setText("내용 입력");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		
		JButton b1 = new JButton();
		b1.setText("게시판 글 작성");
		b1.setBackground(Color.green);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = t1.getText();
				String cont = t3.getText();
				String writer = t2.getText();
				BbsDAO dao = new BbsDAO();
				dao.insert(title, cont, writer);
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
		});
		
		JButton b2 = new JButton();
		b2.setText("게시판 글 수정");
		b2.setBackground(Color.blue);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = JOptionPane.showInputDialog("수정하고 싶은 글 번호");
				int no = Integer.parseInt(s);
				String title = t1.getText();
				String cont = t3.getText();
				BbsDAO dao = new BbsDAO();
				dao.update(no, title, cont);
			}
		});
		
		JButton b3 = new JButton();
		b3.setText("게시판 글 삭제");
		b3.setBackground(Color.red);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = JOptionPane.showInputDialog("삭제하고 싶은 글 번호");
				int no = Integer.parseInt(s);
				BbsDAO dao = new BbsDAO();
				dao.delete(no);
			}
		});
		
		Font font1 = new Font("돋움", Font.BOLD, 30);
		Font font2 = new Font("돋움", Font.BOLD, 35);
		Font font3 = new Font("궁서", Font.BOLD, 50);
		top.setFont(font3);
		l1.setFont(font2);
		tit.setFont(font1);
		writer.setFont(font1);
		content.setFont(font1);
		t1.setFont(font1);
		t2.setFont(font1);
		t3.setFont(font1);
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		
		f.add(top);
		f.add(l1);
		f.add(tit);
		f.add(t1);
		f.add(writer);
		f.add(t2);
		f.add(content);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
