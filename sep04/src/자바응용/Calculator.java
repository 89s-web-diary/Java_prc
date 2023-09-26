package 자바응용;

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

public class Calculator {

	public static void main(String[] args) {

		JFrame f = new JFrame(); // 전체 틀만들기 JFrame
		f.setSize(500, 850); // 틀 사이즈 조정
//		f.setBackground(Color.green);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout(); // 레이아웃 설정 FlowLayout (물흐르듯 순서대로 붙여줌)
		f.setLayout(flow); // 버튼, 텍스트가 겹치지 않게 FlowLayout 조립

		JLabel top = new JLabel();
		// 이미지 부품, Image파일은 프로젝트 바로 아래에 있어야함.
		ImageIcon icon = new ImageIcon("cal.png");
		top.setIcon(icon);

		JLabel l1 = new JLabel(); // 글자 넣는 Label 생성
		l1.setText("숫자1"); // Label에 텍스트 생성
		l1.setForeground(Color.blue);

		JLabel l2 = new JLabel();
		l2.setText("숫자2");
		l2.setForeground(Color.blue);

		JLabel under = new JLabel();
		under.setText("결과 들어가는곳");

		JTextField t1 = new JTextField(10); // 텍스트 상자 생성 / 괄호안에는 몇글자 넣을건지 입력
		t1.setBackground(Color.red); // 배경색
		t1.setForeground(Color.white); // 글자색

		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.red);
		t2.setForeground(Color.white);

		JButton plus = new JButton(); // 버튼 생성 JButton
		plus.setText("더하기"); // 버튼에 텍스트넣기 setText
		plus.setBackground(Color.white);
		plus.setForeground(Color.blue);

		// 플러스 버튼 클릭 시 액션 처리 하겠다는 설정
		// listener ==> 버튼 누르기를 기다림
		// performed ==> 버튼이 눌리면 실행
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("플러스 버튼을 눌렀군");
				String n1 = t1.getText(); // 텍스트필드에 있는 값 String으로 가져오기
				String n2 = t2.getText();
				// 데이터를 입력했는지 확인하는 방법은 2가지
				// 1. equals 사용으로 공백과 같냐
				// 2. .length()를 사용해서 1보다 큰지 확인
				if (n1.equals("") || n2.equals("")) {
					JOptionPane.showMessageDialog(f, "값을 입력하세요");
				} else {
					int n11 = Integer.parseInt(n1);
					int n22 = Integer.parseInt(n2);
					int res = n11 + n22;
					under.setText("더한 값은 " + res);

					t1.setText("");
					t2.setText("");

				}
			}
		});

		JButton min = new JButton();
		min.setText("빼 기");
		min.setBackground(Color.white);
		min.setForeground(Color.blue);
		min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("마이너스 버튼을 눌렀군");

				String n1 = t1.getText(); // 텍스트필드에 있는 값 String으로 가져오기
				String n2 = t2.getText();

				if (n1.equals("") || n2.equals("")) {
					JOptionPane.showMessageDialog(f, "값을 입력하세요");
				} else {

					int n11 = Integer.parseInt(n1);
					int n22 = Integer.parseInt(n2);

					int res = n11 - n22;
					under.setText("뺀 값은 " + res);

					t1.setText("");
					t2.setText("");
				}
			}
		});

		Font font1 = new Font("굴림", 1, 50); // 폰트 생성 Font(글자체, 진하게여부, 글자크기)
		Font font2 = new Font("궁서", 1, 48);

		plus.setFont(font1); // 버튼 글자에 폰트 적용
		min.setFont(font1);
		l1.setFont(font1);
		t1.setFont(font2);
		l2.setFont(font1);
		t2.setFont(font2);
		under.setFont(font1);

		f.add(top);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(plus);
		f.add(min);
		f.add(under);

		f.setVisible(true); // 틀 보이기(위에서 다 설정하고 마지막에 사용)
	}

}
