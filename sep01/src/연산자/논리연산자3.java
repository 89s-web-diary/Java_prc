package 연산자;

import javax.swing.JOptionPane;

public class 논리연산자3 {

	public static void main(String[] args) {

		String id = "root";
		String pw = "pass";

		String logId = JOptionPane.showInputDialog("아이디 입력");
		String logPw = JOptionPane.showInputDialog("패스워드 입력");

		if (id.equals(logId) && pw.equals(logPw)) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}

	}

}
