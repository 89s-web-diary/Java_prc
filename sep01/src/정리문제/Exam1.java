package 정리문제;

import javax.swing.JOptionPane;

public class Exam1 {

	public static void main(String[] args) {

		String inp1 = JOptionPane.showInputDialog("몸무게 입력");
		String inp2 = JOptionPane.showInputDialog("신장 입력");

		double wgt = Double.parseDouble(inp1);
		double hgt = Double.parseDouble(inp2);

		double resH = hgt / 100;

		double bmi = wgt / (resH * resH);

		JOptionPane.showMessageDialog(null, bmi);

	}

}
