package 정리문제;

import javax.swing.JOptionPane;

public class Exam4 {

	public static void main(String[] args) {

		String inp = JOptionPane.showInputDialog("현재 온도는?");
		double tem = Double.parseDouble(inp);

		if (tem >= 25) {
			JOptionPane.showMessageDialog(null, "너무 더워요");
		} else {
			JOptionPane.showMessageDialog(null, "괜찮아요");
		}

	}

}
