package 연습;

import javax.swing.JOptionPane;

public class Prc1My {

	public static void main(String[] args) {

		int i = 0;

		while (true) {
			char id = 'p';
			String id2 = JOptionPane.showInputDialog("암호를 입력하세요");
			char id3 = id2.charAt(0);

			if (id == id3) {
				JOptionPane.showMessageDialog(null, "PASS!");
				i++;
				break;
			} else {
				JOptionPane.showMessageDialog(null, "재입력!");
			}
		}

		String yes = JOptionPane.showInputDialog("어제 몸무게는?");
		String tod = JOptionPane.showInputDialog("오늘 몸무게는?");

		int y = Integer.parseInt(yes);
		int t = Integer.parseInt(tod);

		if ((y - t) >= 2) {
			JOptionPane.showMessageDialog(null, "다이어트 성공!");
			i++;
		} else {
			JOptionPane.showMessageDialog(null, "좀 더 열심히 하자!");
		}

		if (i == 2) {
			JOptionPane.showMessageDialog(null, "오늘은 성공!");
		} else {
			JOptionPane.showMessageDialog(null, "내일 다시 도전!");
		}

	}

}