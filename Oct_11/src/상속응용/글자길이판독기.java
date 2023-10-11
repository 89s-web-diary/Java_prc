package 상속응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class 글자길이판독기 extends JFrame {

	JLabel chr, word, n1, n2;
	JTextArea area;
	JButton cal, board, fnt;
	int cnt = 0;
	int cnt2 = 0;
	int wordN = 0;
	Color[] brdClr = { Color.red, Color.blue, Color.yellow, Color.lightGray, Color.white };
	Color[] fntClr = { Color.pink, Color.green, Color.magenta, Color.black, Color.white };

	public 글자길이판독기() {

		setSize(500, 550);
		chr = new JLabel("Characters : ");
		word = new JLabel("Words : ");
		n1 = new JLabel("입력해주십시오");
		n2 = new JLabel("입력해주십시오");
		FlowLayout flow = new FlowLayout();
		setLayout(flow);

		area = new JTextArea(10, 20);

		cal = new JButton("Count");
		board = new JButton("Pad Color");
		fnt = new JButton("Text Color");

		Font font = new Font("맑은 굴림", Font.BOLD, 30);
		Font font2 = new Font("맑은 굴림", Font.BOLD, 25);
		chr.setFont(font);
		word.setFont(font);
		n1.setFont(font);
		n2.setFont(font);
		area.setFont(font2);
		Font fff = new Font("돋움체", 1, 20);
		cal.setFont(fff);
		
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = area.getText();
				n1.setText(a.length() + "글자입니다");
				String[] a2 = a.split(" ");
				n2.setText(a2.length + "단어입니다");
			}
		});
		
		board.setFont(fff);
		board.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area.setBackground(brdClr[cnt]);
				cnt++;
				if (cnt == 5)
					cnt = 0;
			}
		});
		
		fnt.setFont(fff);
		fnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area.setForeground(fntClr[cnt2]);
				cnt2++;
				if (cnt2 == 5)
					cnt2 = 0;
			}
		});

		add(chr);
		add(n1);
		add(word);
		add(n2);
		add(area);
		add(cal);
		add(board);
		add(fnt);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		글자길이판독기 ame = new 글자길이판독기();
	}

}
