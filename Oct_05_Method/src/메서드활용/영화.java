package 메서드활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 영화 {

	static int cnt = 0;
	static String[] title = { "30일", "화사한 그녀", "천박사 퇴마 연구소", "1947 보스톤", "화란" };
	static String[] img = { "1.png", "2.png", "3.png", "4.png", "5.png" };
	static double[] scr = { 7.7, 9.4, 6.0, 7.6, 6.5 };
	static JLabel top, mid, bot;

	public static void set() {
		ImageIcon icon = new ImageIcon(img[cnt]);
		mid.setIcon(icon);
		top.setText(title[cnt]);
		bot.setText(String.valueOf(scr[cnt]));
	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.cyan);
		f.setSize(625, 800);

		top = new JLabel();
		f.getContentPane().add(top, BorderLayout.NORTH);

		mid = new JLabel();
		f.getContentPane().add(mid, BorderLayout.CENTER);

		bot = new JLabel();
		f.getContentPane().add(bot, BorderLayout.SOUTH);
		bot.setForeground(Color.red);
		
		top.setHorizontalAlignment(JLabel.CENTER);		// 라벨 글자 중앙으로 설정
		bot.setHorizontalAlignment(JLabel.CENTER);		// 라벨 글자 중앙으로 설정

		// 초기화면 설정하는 파트
		set();

		JButton left = new JButton("<<");
		left.setBackground(Color.yellow);
		f.getContentPane().add(left, BorderLayout.WEST);
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cnt--;
				if (cnt < 0) {
					cnt = 4;
					set();
				} else {
					set();
				}
			}
		});

		JButton right = new JButton(">>");
		right.setBackground(Color.yellow);
		f.getContentPane().add(right, BorderLayout.EAST);
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cnt++;
				if (cnt > 4) {
					cnt = 0;
					set();
				} else {
					set();
				}
			}
		});

		Font font = new Font("고딕", 1, 40);
		top.setFont(font);
		mid.setFont(font);
		bot.setFont(font);
		left.setFont(font);
		right.setFont(font);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
