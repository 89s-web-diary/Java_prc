package practice;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String height = JOptionPane.showInputDialog("키를 입력해주세요");

		double hgt = Double.parseDouble(height);

		double wgt = (hgt - 100) * 0.9;
		String res = String.format("%.3f", wgt);

		JOptionPane.showMessageDialog(null, "적정 몸무게는 " + res + "입니다");
		System.out.printf("적정 몸무게는 %.2f입니다", wgt);

		
		
	}

}
