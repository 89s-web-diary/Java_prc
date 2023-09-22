package 정리문제;

import javax.swing.JOptionPane;

public class Exam2 {

	public static void main(String[] args) {

		int cPnt = 3000;
		String inp = JOptionPane.showInputDialog("추가 포인트를 입력하세요");
		
		double add = Double.parseDouble(inp);
		
		double res = cPnt + add;
		
		JOptionPane.showMessageDialog(null, res);
		
	}

}
