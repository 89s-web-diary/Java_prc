package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기쓰기화면 {
	
	static String day, title, content;
	static JFrame f;
	static JTextField t1, t2;
	static JTextArea t3;
	
	public void open() {
		f = new JFrame();
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
		t1 = new JTextField(10);
		t1.setForeground(Color.blue);
		t2 = new JTextField(10);
		t2.setForeground(Color.blue);
		t3 = new JTextArea(5, 10);
		t3.setForeground(Color.blue);

		JButton b1 = new JButton();
		b1.setText("파일에 일기 저장");
		b1.setBackground(Color.magenta);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				day = t1.getText();
				title = t2.getText();
				content = t3.getText();
				
				File file2 = new File(day + ".txt");
				boolean ex = file2.exists();
				if (ex == true) {
					String ins = JOptionPane.showInputDialog(f, "파일이 존재합니다\n수정하시겠습니까?(Y/N)");
					if (ins.equals("Y") || ins.equals("y")) {
						write();
						JOptionPane.showMessageDialog(f, "수정되었습니다");
						re();
					} else {
						JOptionPane.showMessageDialog(f, "날짜를 변경해주세요");
					}
				} else {
					write();
					JOptionPane.showMessageDialog(f, "저장");
					re();
				}
			}
		});

		Font font = new Font("맑은 고딕", 1, 30);
		Font font2 = new Font("맑은 고딕", 1, 40);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		b1.setFont(font2);

		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(b1);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	public void write() {
		try {
			FileWriter file = new FileWriter(day + ".txt");
			file.write(day + "\n");
			file.write(title + "\n");
			file.write(content + "\n");
			file.close();
		} catch (IOException e2) {
			System.out.println("에러");
			e2.printStackTrace(); // 자세하게 에러정보도 볼 수 있음.
		}
	}
	public void re() {
		t1.setText("");
		t2.setText("");
		t3.setText("");
	}
}
