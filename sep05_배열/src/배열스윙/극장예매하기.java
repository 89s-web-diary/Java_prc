package 배열스윙;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 극장예매하기 {

	static int cnt, pay;
	static String no = "";

	public static void main(String[] args) {

		Random r = new Random();

		JFrame f = new JFrame();
		f.setSize(1200, 800);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		// .에 .을 추가해서 사용 ==> 체인식 코드

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton[] b = new JButton[300];

		for (int i = 0; i < b.length; i++) {
//			b[i] = new JButton(i + "");
			b[i] = new JButton(String.valueOf(i));
			int x = r.nextInt(1100);
			int y = r.nextInt(700);
			b[i].setBounds(x, y, 100, 50);
			b[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand(); // 버튼위에 글자를 가지고 옴
					if (s.equals("선택X")) {
						JOptionPane.showMessageDialog(f, "예매된 좌석입니다");
					} else {
						cnt++;
						pay = cnt * 10000;
						no = no.concat(" " + s);
						if(cnt%6==0) {
							no = no.concat("\n");
						}
						JOptionPane.showMessageDialog(f, s + " 예약!\n결제 금액은 " + pay + "원\n 현재 예매 좌석\n" + no);
						JButton bb = (JButton)e.getSource();	// 클린된 object를 가져옴
						bb.setBackground(Color.red);
						bb.setText("선택X");
//						bb.setEnabled(false);	// 버튼 선택을 못하게 만듦
					}
				}
			});
			f.add(b[i]);
		}
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
