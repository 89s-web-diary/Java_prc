package 회원정보;

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

import 게시판정보.BbsDAO;
import 게시판정보.게시판UI;

public class 회원정보UI {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(400, 520);
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
		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idt.getText();
				String pw = pwt.getText();
				String name = namet.getText();
				String tel = telt.getText();
				MemberDAO dao = new MemberDAO();
				dao.insert(id, pw, name, tel);
			}
		});
		
		JButton upt = new JButton();
		upt.setText("회원 정보 수정");
		upt.setBackground(Color.yellow);
		upt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("수정할 아이디 입력");
				String index = JOptionPane.showInputDialog("수정할 index 입력(pw,name,tel");
				String cont = JOptionPane.showInputDialog("수정할 내용 입력");
				MemberDAO dao = new MemberDAO();
				dao.update(id, index, cont);
			}
		});
		
		JButton del = new JButton();
		del.setText("회원 탈퇴 처리");
		del.setBackground(Color.red);
		del.setOpaque(true);
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("탈퇴할 아이디 입력");
				MemberDAO dao = new MemberDAO();
				dao.delete(id);
			}
		});
		
		JButton bIns = new JButton();
		bIns.setText("게시판 작성");
		bIns.setBackground(Color.magenta);
		bIns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				게시판UI bbs = new 게시판UI();
				bbs.bbs();
			}
		});
		
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
		upt.setFont(font2);
		del.setFont(font2);
		bIns.setFont(font2);
		
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
		f.add(upt);
		f.add(del);
		f.add(bIns);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
